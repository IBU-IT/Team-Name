package com.sis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SearchStudentJP extends JFrame {

	private JPanel contentPane;
	private JTextField studentid;
	private JTextField firstname;
	private JTextField lastName;
	private JTextField address;
	private JTextField year;
	private JTextField department;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStudentJP frame = new SearchStudentJP();
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
	public SearchStudentJP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUpdate = new JButton("Update");
		
		btnUpdate.setBounds(112, 470, 89, 23);
		contentPane.add(btnUpdate);
		
		studentid = new JTextField();
		studentid.setBounds(115, 27, 86, 20);
		contentPane.add(studentid);
		studentid.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setForeground(Color.WHITE);
		lblStudentId.setBackground(new Color(148,196,108));
		lblStudentId.setBounds(38, 30, 67, 14);
		contentPane.add(lblStudentId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(148,196,108));
		
		btnSearch.setBounds(211, 26, 89, 23);
		contentPane.add(btnSearch);
		
		firstname = new JTextField();
		firstname.setBounds(115, 124, 244, 20);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		JLabel lblName = new JLabel("Firstname");
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(new Color(148,196,108));
		lblName.setBounds(38, 127, 67, 14);
		contentPane.add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setForeground(Color.WHITE);
		lblLastname.setBackground(new Color(148,196,108));
		lblLastname.setBounds(38, 190, 67, 14);
		contentPane.add(lblLastname);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(115, 187, 244, 20);
		contentPane.add(lastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBackground(new Color(148,196,108));
		lblAddress.setBounds(38, 251, 67, 14);
		contentPane.add(lblAddress);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(115, 248, 244, 20);
		contentPane.add(address);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(Color.WHITE);
		lblYear.setBackground(new Color(148,196,108));
		lblYear.setBounds(38, 307, 67, 14);
		contentPane.add(lblYear);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(115, 304, 244, 20);
		contentPane.add(year);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setBackground(new Color(148,196,108));
		lblDepartment.setBounds(38, 366, 67, 14);
		contentPane.add(lblDepartment);
		
		department = new JTextField();
		department.setColumns(10);
		department.setBounds(115, 363, 244, 20);
		contentPane.add(department);
		
		JLabel lblYear_1 = new JLabel("Email");
		lblYear_1.setForeground(Color.WHITE);
		lblYear_1.setBackground(new Color(148,196,108));
		lblYear_1.setBounds(38, 424, 67, 14);
		contentPane.add(lblYear_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(115, 424, 244, 20);
		contentPane.add(email);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase();
				boolean result = connectionToDatabase.DeleteStudent(studentid.getText());
				if (result) {
					JOptionPane.showMessageDialog(null, "Student deleted!");
				} else {
					JOptionPane.showMessageDialog(null, "Something went wrong!");
				}
			}
		});
		btnDelete.setBounds(211, 470, 89, 23);
		contentPane.add(btnDelete);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase();
				boolean result = connectionToDatabase.UpdateStudent(studentid.getText(), firstname.getText(), lastName.getText(), address.getText(), Integer.parseInt(year.getText()), department.getText(), email.getText());
				if (result) {
					JOptionPane.showMessageDialog(null, "Student updated!");
				} else {
					JOptionPane.showMessageDialog(null, "Something went wrong!");
				}
			}
		});
		
		JLabel lblSearchStudent = new JLabel("");
		lblSearchStudent.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\\u0107\u0107.png"));
		lblSearchStudent.setBounds(0, 5, 561, 499);
		contentPane.add(lblSearchStudent);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase();
				try {
					String[] student = connectionToDatabase.RetriveStudent(Integer.parseInt(studentid.getText()));
					if (student == null) {
						JOptionPane.showMessageDialog(null, "That student doesn't exists!");
					} else {
						firstname.setText(student[1]);
						lastName.setText(student[2]);
						address.setText(student[3]);
						year.setText(student[5]);
						department.setText(student[6]);
						email.setText(student[7]);
						
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "StudentID has to be number");
				}
				
							
			}
		});
	}

	public static void init() {
		// TODO Auto-generated method stub
		
	}
}
