package com.JavaCrud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JavaCrud extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCrud frame = new JavaCrud();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JavaCrud() {
		setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 92, 92)));
		panel.setBounds(12, 12, 1332, 703);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 92, 92)));
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(34, 25, 1267, 82);
		panel.add(panel_1);
		
		JLabel lblUserRegistrationSystem = new JLabel("User Registration System");
		lblUserRegistrationSystem.setFont(new Font("Gurajada", Font.BOLD, 50));
		lblUserRegistrationSystem.setBounds(378, 22, 645, 48);
		panel_1.add(lblUserRegistrationSystem);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 92, 92)));
		panel_1_1.setBackground(new Color(0, 255, 255));
		panel_1_1.setBounds(34, 119, 437, 486);
		panel.add(panel_1_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName.setBounds(29, 50, 155, 36);
		panel_1_1.add(lblFirstName);
		
		JLabel lblFirstName_1 = new JLabel("Last Name");
		lblFirstName_1.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName_1.setBounds(29, 98, 155, 36);
		panel_1_1.add(lblFirstName_1);
		
		JLabel lblFirstName_1_1 = new JLabel("Age");
		lblFirstName_1_1.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName_1_1.setBounds(29, 147, 155, 36);
		panel_1_1.add(lblFirstName_1_1);
		
		JLabel lblFirstName_1_2 = new JLabel("Gender");
		lblFirstName_1_2.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName_1_2.setBounds(29, 198, 155, 36);
		panel_1_1.add(lblFirstName_1_2);
		
		JLabel lblFirstName_1_3 = new JLabel("Email");
		lblFirstName_1_3.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName_1_3.setBounds(29, 244, 155, 36);
		panel_1_1.add(lblFirstName_1_3);
		
		JLabel lblFirstName_1_4 = new JLabel("Phone");
		lblFirstName_1_4.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName_1_4.setBounds(29, 295, 155, 36);
		panel_1_1.add(lblFirstName_1_4);
		
		JLabel lblFirstName_1_5 = new JLabel("Password");
		lblFirstName_1_5.setFont(new Font("Gurajada", Font.BOLD, 29));
		lblFirstName_1_5.setBounds(29, 343, 155, 36);
		panel_1_1.add(lblFirstName_1_5);
		
		textField = new JTextField();
		textField.setBounds(183, 57, 227, 29);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 109, 227, 29);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 158, 227, 29);
		panel_1_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 246, 227, 29);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 292, 227, 29);
		panel_1_1.add(textField_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 343, 227, 29);
		panel_1_1.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(183, 204, 227, 29);
		panel_1_1.add(comboBox);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 92, 92)));
		panel_1_2.setBackground(new Color(0, 255, 255));
		panel_1_2.setBounds(34, 617, 1267, 63);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Gurajada", Font.BOLD, 34));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(27, 12, 144, 39);
		panel_1_2.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Gurajada", Font.BOLD, 34));
		btnClear.setBounds(239, 12, 144, 39);
		panel_1_2.add(btnClear);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setFont(new Font("Gurajada", Font.BOLD, 34));
		btnUpdate.setBounds(446, 12, 144, 39);
		panel_1_2.add(btnUpdate);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Gurajada", Font.BOLD, 34));
		btnPrint.setBounds(668, 12, 144, 39);
		panel_1_2.add(btnPrint);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Gurajada", Font.BOLD, 34));
		btnDelete.setBounds(883, 12, 144, 39);
		panel_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Gurajada", Font.BOLD, 34));
		btnExit.setBounds(1081, 12, 144, 39);
		panel_1_2.add(btnExit);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 92, 92)));
		panel_1_3.setBackground(new Color(0, 255, 255));
		panel_1_3.setBounds(483, 119, 818, 486);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 92, 92)));
		scrollPane.setBounds(12, 12, 794, 462);
		panel_1_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Age", "Gender", "Email", "Phone", "Password"
			}
		));
		scrollPane.setViewportView(table);
	}
}
