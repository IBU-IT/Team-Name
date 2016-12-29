package com.sis;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Login {

	private JFrame frame;
	private JTextField txtWelcomeToOur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWelcomeToOur = new JTextField();
		txtWelcomeToOur.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtWelcomeToOur.setForeground(Color.BLACK);
		txtWelcomeToOur.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToOur.setText("Welcome to our Student information system");
		txtWelcomeToOur.setBounds(29, 41, 359, 20);
		frame.getContentPane().add(txtWelcomeToOur);
		txtWelcomeToOur.setColumns(10);
		
		JLabel lblLoginAs = new JLabel("Login as : ");
		lblLoginAs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLoginAs.setBounds(29, 126, 60, 14);
		frame.getContentPane().add(lblLoginAs);
		
		JButton btnContionue = new JButton("Continue");
		btnContionue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnContionue.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnContionue);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(104, 126, 172, 88);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnAdministrator = new JRadioButton("Administrator");
		rdbtnAdministrator.setBounds(6, 0, 109, 23);
		panel.add(rdbtnAdministrator);
		rdbtnAdministrator.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JRadioButton rdbtnProffessor = new JRadioButton("Proffessor");
		
		rdbtnProffessor.setBounds(6, 26, 109, 23);
		panel.add(rdbtnProffessor);
		rdbtnProffessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBounds(6, 52, 109, 23);
		panel.add(rdbtnStudent);
		rdbtnStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnAdministrator);
		group.add(rdbtnProffessor);
		group.add(rdbtnStudent);
		
		btnContionue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				if(rdbtnAdministrator.isSelected()) {
					Admin.init();
					
				} else {
					StudentSite.init();
				}
				
			}
		});
	}
}
