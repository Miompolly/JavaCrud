package com.JavaCrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnectDB {

    String dburl = "jdbc:mysql://localhost:3306/UserRegistration";
    String dbuser = "root";
    String dbpwd = "";
    Connection cnx;

    public Connection dbConnection() {
        try {
            cnx = DriverManager.getConnection(dburl, dbuser, dbpwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cnx;
    }

    public boolean isEmailExists(String email) throws SQLException {
        String sql = "SELECT * FROM users WHERE Email = ?";
        PreparedStatement st = cnx.prepareStatement(sql);
        st.setString(1, email);
        ResultSet rs = st.executeQuery();
        return rs.next(); // Returns true if email exists in the database
    }

    public void addUser(String name, String lname, String age, String gender, String email, String phone, String password) throws SQLException {
        if (email.length() > 0 && name.length() > 0 && age.length() > 0 && lname.length() > 0 && phone.length() > 0 && password.length() > 0 && gender.length() > 0) {
            // Check if email exists in the database
            if (isEmailExists(email)) {
                JOptionPane.showMessageDialog(null, "Email already exists in the database", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO users(FirstName, LastName, Age, Gender, Email, Phone, Password) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = cnx.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, lname);
            st.setString(3, age);
            st.setString(4, gender);
            st.setString(5, email);
            st.setString(6, phone);
            st.setString(7, password);
            int row = st.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Record inserted successfully");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill in all Fields !!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getUsers() {
        ResultSet rs = null;
        try {
            if (cnx != null) {
                String query = "SELECT * FROM users";
                Statement stmt = cnx.createStatement();
                rs = stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
