package com.JavaCrud;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectDB {

	String dburl= "jdbc:mysql://localhost:3306/UserRegistration";
	String dbuser="root";
	String dbpwd="";
	Connection cnx;
	public Connection dbConnection() {
	try {
		cnx = DriverManager.getConnection(dburl,dbuser,dbpwd);
		if(cnx!=null) {
			JOptionPane.showMessageDialog(null,"Db connected Successfully","Db found",1);
		}
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
	return cnx;

}
	public void addUser(String name,String lname,String age,String gender,String email,String phone,String password ) throws SQLException {
		String sql="INSERT INTO users(FirstName,LastName,Age,Gender,Email,Phone,Password) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement st = cnx.prepareStatement(sql);
		st.setString(1,name);
		st.setString(2,lname);
		st.setString(3,age);
		st.setString(4,gender);
		st.setString(5,email);
		st.setString(6,phone);
		st.setString(7,password);
		int row=st.executeUpdate();
		if(row>0) {
			JOptionPane.showMessageDialog(null, "Record insterted successfully");
		}
		
	}
	
	
	
}