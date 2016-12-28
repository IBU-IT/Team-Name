package com.sis;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class CreateUser {

	private JFrame frame;
	private JTextField textField_6;
	private JTextField textField;
	private JTextField Firstname;
	private JTextField Lastname;
	private JTextField Adress;
	private JTextField Email;
	private JTextField Phone;
	private Dictionary<String, String> dic;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		Department Architecture = new Department("Architecture", 1);
		Department Architecture2 = new Department("Architecture", 2);
		Department Architecture3 = new Department("Architecture", 3);
		Department Architecture4 = new Department("Architecture", 4);
		Department Architecture5 = new Department("Architecture", 5);
		
		Course Drawings = new Course("Drawings I", Architecture);
		Course ArhitecturalDesign = new Course("Arhitectural Design", Architecture);
		Course ArhitecturalHistory = new Course("Arhitectural History", Architecture);
		Course ArhitecturalStructures = new Course("Arhitectural Structures", Architecture);
		Course StrengthofMaterials = new Course("Strength of Materials", Architecture);
		
		Course BasicDesign = new Course("Basic Design", Architecture2);
		Course HistoryOfDesign = new Course("History Of Design", Architecture2);
		Course ArhitecturalDesignII = new Course("Arhitectural Design II", Architecture2);
		Course FreehandDrawing = new Course("Freehand Drawind", Architecture2);
		Course BuildingMaterials = new Course("Building Materials", Architecture2);
		
		Course GraphicCommunication = new Course("GraphicCommunication", Architecture3);
		Course BuildingTechnology = new Course("Building Technology", Architecture3);
		Course ArhitecturalDesignIII = new Course("Arhitectural Design II", Architecture3);
		Course DesignMethods = new Course("Design Methods", Architecture3);
		Course Entrepreneurship = new Course("Entrepreneurship", Architecture3);
		
		Course StrengthofMaterialsII = new Course(" Strength of Materials II", Architecture4);
		Course DesignMethodsII = new Course("Design Methods II", Architecture4);
		Course ArhitecturalStructuresII = new Course("Arhitectural Structures II", Architecture4);
		Course UrbanDesign = new Course("UrbanDesign", Architecture4);
		Course BuildingMaterialsII = new Course("Building Materials II", Architecture4);
		
		Course CityPlaning = new Course("City Planing", Architecture5);
		Course BuildingConstruction = new Course("Building Construction", Architecture5);
		Course Structures = new Course("Structures", Architecture5);
		Course ArhitecturalDesignIV = new Course("Arhitectural Design IV", Architecture5);
		
		
		Department IT = new Department("IT", 1);
		Department IT2 = new Department("IT", 2);
		Department IT3 = new Department("IT", 3 );
		Department IT4 = new Department("IT", 4 );
		Department IT5 = new Department("IT", 5 );
		
		
		Course ProgrammingI  = new Course("Programming I", IT);
		Course CalculusI = new Course("Calculus I",IT);
		Course TurkishLanguage = new Course("Turkish Language I",IT);
		Course GeneralPhysics  = new Course("General Physics I", IT);
		Course EnglishLanguageI = new Course ("English Language I",IT);
		

		Course ProgrammingII = new Course ("Programming II",IT2);
		Course CalculusII = new Course ("Calculus II",IT2);
		Course GeneralPhysicsII = new Course ("General Physics II",IT2);
		Course TurskihLanguageII = new Course ("Turkish Language II",IT2);
		Course EnglishLanguageII = new Course ("English Language II",IT2);
		


		Course DigitalDesign = new Course ("Digital Design",IT3);
		Course DatabaseSystems = new Course ("Database System",IT3);
		Course DiscreteMathematics = new Course ("Discrete Mathematics",IT3);
		Course DifferentialEquations = new Course ("Differential Equations",IT3);
		Course IndustrialTrainingI = new Course ("Industrial Training I",IT3);
		
		
		
		Course NumericalAnalysis= new Course ("Numerical Analysis",IT4);
		Course ComputerOrganization = new Course ("Computer Organization",IT4);
		Course ProgrammingLanguages = new Course ("Programming Languages",IT4);
		Course DataStructures = new Course ("Data Structures",IT4);
		
		
		Course OperatingSystems = new Course ("Operating Systems",IT5);
		Course ComputerNetworks = new Course ("Computer Networks",IT5);
		Course IndustrialTrainingII = new Course ("Industrial Training II",IT5);
		Course MajorElectiveCourseI = new Course ("Major Elective Course I",IT5);
		Course MajorElectiveCourseII  = new Course ("Major Elective Course II",IT5);
		Course MajorElectiveCourseIII = new Course ("Major Elective Course III",IT5);
		
		

		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					CreateUser window = new CreateUser();
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
	public CreateUser() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 636, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(73, 28, 452, 47);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentId_1 = new JLabel("Student ID");
		lblStudentId_1.setBounds(143, 12, 60, 16);
		panel.add(lblStudentId_1);
		lblStudentId_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_6 = new JTextField();
		textField_6.setBounds(213, 11, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearch.setBounds(10, 0, 46, 14);
		panel.add(lblSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(83, 86, 520, 377);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(324, 38, 145, 121);
		panel_1.add(label_12);
		
		JLabel label = new JLabel("Student ID");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 27, 73, 14);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(126, 25, 159, 20);
		panel_1.add(textField);
		
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		firstNameLabel.setBounds(10, 58, 73, 14);
		panel_1.add(firstNameLabel);
		
		Firstname = new JTextField();
		Firstname.setColumns(10);
		Firstname.setBounds(126, 56, 159, 20);
		panel_1.add(Firstname);
		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lastNameLabel.setBounds(10, 89, 73, 14);
		panel_1.add(lastNameLabel);
		
		Lastname = new JTextField();
		Lastname.setColumns(10);
		Lastname.setBounds(126, 87, 159, 20);
		panel_1.add(Lastname);
		
		JLabel dateLabel = new JLabel("Date of birth");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel.setBounds(10, 124, 73, 14);
		panel_1.add(dateLabel);
		
		JLabel label_4 = new JLabel("Gender");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(10, 149, 46, 14);
		panel_1.add(label_4);
		
		JRadioButton radioButtonMale = new JRadioButton("Male");
		radioButtonMale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radioButtonMale.setBounds(126, 145, 52, 23);
		panel_1.add(radioButtonMale);
		
		JRadioButton radioButtonFemale = new JRadioButton("Female");
		radioButtonFemale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radioButtonFemale.setBounds(180, 145, 73, 23);
		panel_1.add(radioButtonFemale);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButtonMale);
		group.add(radioButtonFemale);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailLabel.setBounds(10, 274, 46, 14);
		panel_1.add(emailLabel);
		
		Adress = new JTextField();
		Adress.setColumns(10);
		Adress.setBounds(126, 247, 159, 20);
		panel_1.add(Adress);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		phoneLabel.setBounds(10, 299, 46, 14);
		panel_1.add(phoneLabel);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(126, 272, 159, 20);
		
		panel_1.add(Email);
		
		JLabel addressLabel = new JLabel("Adress");
		addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		addressLabel.setBounds(10, 249, 46, 14);
		panel_1.add(addressLabel);
		
		Phone = new JTextField();
		Phone.setColumns(10);
		Phone.setBounds(126, 297, 159, 20);
		panel_1.add(Phone);
		
		JLabel departmentLabel = new JLabel("Department");
		departmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		departmentLabel.setBounds(10, 174, 73, 14);
		panel_1.add(departmentLabel);
		
		JLabel semesterLabel = new JLabel("Semester");
		semesterLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		semesterLabel.setBounds(10, 199, 73, 14);
		panel_1.add(semesterLabel);
		
		JLabel courseLabel = new JLabel("Course");
		courseLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		courseLabel.setBounds(10, 224, 73, 14);
		panel_1.add(courseLabel);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(304, 132, -346, 30);
		panel_1.add(label_11);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnUpdate.setBounds(127, 343, 89, 23);
		panel_1.add(btnUpdate);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (firstNameLabel!=null && lastNameLabel != null) {
					InsertStudent s = new InsertStudent(firstNameLabel.getText(), 
							lastNameLabel.getText(), 
							addressLabel.getText(), 
							"asd", 
							1, 
							departmentLabel.getText(), 
							emailLabel.getText(), 
							phoneLabel.getText());
				}
					
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInsert.setBounds(33, 343, 89, 23);
		panel_1.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDelete.setBounds(222, 343, 89, 23);
		panel_1.add(btnDelete);
		
		JLabel lblStudentForm = new JLabel("Student form");
		lblStudentForm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentForm.setBounds(10, 0, 96, 14);
		panel_1.add(lblStudentForm);
		
		JComboBox<Integer> comboSemester = new JComboBox<Integer>();
		comboSemester.setBounds(126, 197, 159, 20);
		panel_1.add(comboSemester);

		
		JComboBox<String> comboDepartment = new JComboBox<String>();
		comboDepartment.setBounds(126, 172, 159, 20);
		panel_1.add(comboDepartment);
		
		JComboBox<String> comboCourse = new JComboBox<String>();
		comboCourse.setBounds(126, 222, 159, 20);
		panel_1.add(comboCourse);

		comboDepartment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String o = (String)comboDepartment.getSelectedItem();
				comboCourse.setModel(new DefaultComboBoxModel(getCourseNames(o, (int)comboSemester.getSelectedItem()).toArray()));
			}
		});
		
		comboSemester.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int o = (int)comboSemester.getSelectedItem();
				comboDepartment.setModel(new DefaultComboBoxModel(getDepartmentNames(o).toArray()));
				comboCourse.setModel(new DefaultComboBoxModel(getCourseNames((String)comboDepartment.getSelectedItem(),  (int)comboSemester.getSelectedItem()).toArray()));
			}
		});
		
		comboSemester.setModel(new DefaultComboBoxModel(Department.getSemestersArray().toArray()));
		comboDepartment.setModel(new DefaultComboBoxModel(getDepartmentNames((int)comboSemester.getSelectedItem()).toArray()));
		comboCourse.setModel(new DefaultComboBoxModel(getCourseNames((String)comboDepartment.getSelectedItem(), (int)comboSemester.getSelectedItem()).toArray()));

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			
			}

			
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancel.setBounds(316, 343, 89, 23);
		panel_1.add(btnCancel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(126, 118, 159, 20);
		panel_1.add(dateChooser);
		
	}
	
	private List<String> getDepartmentNames(int semester) {
		List<Department> deps = Department.getDepartmentsBySemester(semester);
		List<String> names = new ArrayList<String>();
		
		for (Department dep : deps) {
			names.add(dep.getName());
		}
		
		return names;
	}
	
	private List<String> getCourseNames(String department, int semester) {
		List<Course> courses = Course.getCoursesByDepartmentName(department, semester);
		List<String> names = new ArrayList<String>();
		
		for (Course c : courses) {
			names.add(c.getName());
		}
		
		return names;
	}
}
