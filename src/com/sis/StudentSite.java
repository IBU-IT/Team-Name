package com.sis;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class StudentSite {

	private JFrame frmLogin;
	private JTextField studentidTB;
	private JTextField passwordTB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSite window = new StudentSite();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSite() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 631, 576);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		studentidTB = new JTextField();
		studentidTB.setBounds(211, 222, 165, 20);
		frmLogin.getContentPane().add(studentidTB);
		studentidTB.setColumns(10);
		
		passwordTB = new JTextField();
		passwordTB.setBounds(211, 275, 165, 20);
		frmLogin.getContentPane().add(passwordTB);
		passwordTB.setColumns(10);
		
		JLabel lblStudentid = new JLabel("ID");
		lblStudentid.setBounds(135, 98, 66, 14);
		frmLogin.getContentPane().add(lblStudentid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(135, 150, 66, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		JLabel greskaLBL = new JLabel("");
		greskaLBL.setBounds(90, 34, 286, 14);
		frmLogin.getContentPane().add(greskaLBL);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (studentidTB.getText() == "" || passwordTB.getText() == "") {
					greskaLBL.setText("You have to enter id and password");
				}else if(!studentidTB.getText().equals("admin") || !passwordTB.getText().equals("admin")){
					greskaLBL.setText("Wrong studentid password combination");
				}else {
					StudentDashboard studentDashboard = new StudentDashboard();
					frmLogin.setVisible(false);
					studentDashboard.showWindow();
				}
				
			}
		});
		
		submitBtn.setBounds(393, 94, 89, 23);
		frmLogin.getContentPane().add(submitBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\15730843_746693345482056_948976948_n.jpg"));
		lblNewLabel.setBounds(0, 0, 615, 537);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		frmLogin.getContentPane().add(lblNewLabel_1);
	}
}