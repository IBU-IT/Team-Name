package com.sis;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
File font_file = new File("Roboto-Regular.ttf");
		
		try {
			setUIFont (new javax.swing.plaf.FontUIResource(Font.createFont(Font.TRUETYPE_FONT, font_file).deriveFont(17f)));
		} catch (FontFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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

	private static void setUIFont(FontUIResource fontUIResource) {
		// TODO Auto-generated method stub
		
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
		frame.setBounds(100, 100, 644, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLoginAs = new JLabel("Login as : ");
		lblLoginAs.setForeground(Color.WHITE);
		lblLoginAs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLoginAs.setBounds(69, 265, 89, 23);
		frame.getContentPane().add(lblLoginAs);
		
		JButton btnContionue = new JButton("Continue");
		btnContionue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnContionue.setForeground(Color.WHITE);
		btnContionue.setBackground(new Color(148,196,108));
		btnContionue.setBounds(470, 439, 114, 32);
		frame.getContentPane().add(btnContionue);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(167, 282, 172, 88);
		panel.setBackground(new Color(148,196,108));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnAdministrator = new JRadioButton("Administrator");
		
		
		rdbtnAdministrator.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnAdministrator.setForeground(Color.WHITE);
		rdbtnAdministrator.setBackground(new Color(148,196,108));
		
		rdbtnAdministrator.setBounds(6, 0, 109, 23);
		panel.add(rdbtnAdministrator);
	
		
		JRadioButton rdbtnProffessor = new JRadioButton("Professor");
		rdbtnProffessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnProffessor.setForeground(Color.WHITE);
		rdbtnProffessor.setBackground(new Color(148,196,108));
		
		
		rdbtnProffessor.setBounds(6, 26, 109, 23);
		panel.add(rdbtnProffessor);
		rdbtnProffessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnStudent.setForeground(Color.WHITE);
		rdbtnStudent.setBackground(new Color(148,196,108));
		rdbtnStudent.setBounds(6, 52, 109, 23);
		panel.add(rdbtnStudent);
		rdbtnStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnAdministrator);
		group.add(rdbtnProffessor);
		group.add(rdbtnStudent);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("u0111.jpg"));
		label.setBounds(0, 0, 628, 524);
		frame.getContentPane().add(label);
		
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
