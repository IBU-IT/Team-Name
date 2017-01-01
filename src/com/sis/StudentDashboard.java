package com.sis;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDashboard {

	private JFrame frame;

	public void showWindow() {
		frame.setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDashboard window = new StudentDashboard();
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
	public StudentDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRzultat = new JLabel("<html><h1>Welcome</h1></html>");
		lblRzultat.setBounds(207, 125, 385, 383);
		frame.getContentPane().add(lblRzultat);
		
		JButton btnMessages = new JButton("Messages");
		btnMessages.setForeground(Color.WHITE);
		btnMessages.setBackground(new Color(148,196,108));
		btnMessages.setBounds(47, 262, 106, 23);
		frame.getContentPane().add(btnMessages);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.setForeground(Color.WHITE);
		btnPayment.setBackground(new Color(148,196,108));
		btnPayment.setBounds(47, 228, 106, 23);
		frame.getContentPane().add(btnPayment);
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		
		JButton btnGrades = new JButton("Grades");
		btnGrades.setForeground(Color.WHITE);
		btnGrades.setBackground(new Color(148,196,108));
		btnGrades.setBounds(47, 194, 106, 23);
		frame.getContentPane().add(btnGrades);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.setForeground(Color.WHITE);
		btnAttendance.setBackground(new Color(148,196,108));
		btnAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase();
				List<String> attend = connectionToDatabase.RetrieveAttendence();
			}
		});
		btnAttendance.setBounds(47, 155, 106, 23);
		frame.getContentPane().add(btnAttendance);
		
		JButton btnCourses = new JButton("Courses");
		btnCourses.setForeground(Color.WHITE);
		btnCourses.setBackground(new Color(148,196,108));
		btnCourses.setBounds(47, 121, 106, 23);
		frame.getContentPane().add(btnCourses);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\m.jpg"));
		label_1.setBounds(0, 0, 637, 536);
		frame.getContentPane().add(label_1);
		
		btnCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase();
				List<String> result = connectionToDatabase.RetriveCourses();
				String textResult = "<html><ul>";
				for(int i = 0;i < result.size(); i++) {
					textResult += "<li>"+result.get(i)+"</li>";
				}
				textResult += "</ul></html>";
				lblRzultat.setText(textResult);
			}
		});
	}
}
