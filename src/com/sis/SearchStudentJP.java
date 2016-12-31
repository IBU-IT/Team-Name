package com.sis;

import java.awt.BorderLayout;
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
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		studentid = new JTextField();
		studentid.setBounds(115, 27, 86, 20);
		contentPane.add(studentid);
		studentid.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(38, 30, 67, 14);
		contentPane.add(lblStudentId);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.setBounds(211, 26, 89, 23);
		contentPane.add(btnSearch);
		
		firstname = new JTextField();
		firstname.setEditable(false);
		firstname.setBounds(115, 101, 244, 20);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		JLabel lblName = new JLabel("Firstname");
		lblName.setBounds(38, 104, 67, 14);
		contentPane.add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(38, 139, 67, 14);
		contentPane.add(lblLastname);
		
		lastName = new JTextField();
		lastName.setEditable(false);
		lastName.setColumns(10);
		lastName.setBounds(115, 136, 244, 20);
		contentPane.add(lastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(38, 179, 67, 14);
		contentPane.add(lblAddress);
		
		address = new JTextField();
		address.setEditable(false);
		address.setColumns(10);
		address.setBounds(115, 176, 244, 20);
		contentPane.add(address);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(38, 210, 67, 14);
		contentPane.add(lblYear);
		
		year = new JTextField();
		year.setEditable(false);
		year.setColumns(10);
		year.setBounds(115, 207, 244, 20);
		contentPane.add(year);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(38, 243, 67, 14);
		contentPane.add(lblDepartment);
		
		department = new JTextField();
		department.setEditable(false);
		department.setColumns(10);
		department.setBounds(115, 240, 244, 20);
		contentPane.add(department);
		
		JLabel lblYear_1 = new JLabel("Email");
		lblYear_1.setBounds(38, 274, 67, 14);
		contentPane.add(lblYear_1);
		
		email = new JTextField();
		email.setEditable(false);
		email.setColumns(10);
		email.setBounds(115, 271, 244, 20);
		contentPane.add(email);
		
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
}
