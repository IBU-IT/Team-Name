package com.sis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCourseJP extends JPanel {
	private JTextField semester;
	private JTextField course;
	private JTextField year;
	private JTextField department;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCourseJP window = new AddCourseJP();
					//window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AddCourseJP() {
		JFrame frame = new JFrame ("Add a Course");
		frame.setVisible(true);
		frame.setSize(637,551);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCourseId = new JLabel("Semester");
		lblCourseId.setBounds(10, 198, 57, 14);
		frame.getContentPane().add(lblCourseId);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 223, 46, 14);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(10, 248, 46, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 271, 71, 14);
		frame.getContentPane().add(lblDepartment);
		
		semester = new JTextField();
		semester.setBounds(91, 195, 108, 20);
		frame.getContentPane().add(semester);
		semester.setColumns(10);
		
		course = new JTextField();
		course.setBounds(90, 220, 109, 20);
		frame.getContentPane().add(course);
		course.setColumns(10);
		
		year = new JTextField();
		year.setBounds(91, 245, 108, 20);
		frame.getContentPane().add(year);
		year.setColumns(10);
		
		department = new JTextField();
		department.setBounds(91, 268, 108, 20);
		frame.getContentPane().add(department);
		department.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!semester.getText().equals("") && !course.getText().equals("") && !year.getText().equals("")) {
					InsertCourse professor = new InsertCourse(course.getText(), year.getText(), department.getText(), semester.getText());
					JOptionPane.showMessageDialog(null, "Course added");
				} else {
					JOptionPane.showMessageDialog(null, "You have to enter all data");
				}
			}
		});
		btnSave.setBounds(475, 447, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\t.png"));
		label.setBounds(0, 0, 621, 512);
		frame.getContentPane().add(label);

	}
	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}
