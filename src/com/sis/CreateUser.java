import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateUser {

	private JFrame frame;
	private JTextField textField_6;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		panel_1.setBounds(71, 86, 520, 377);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(324, 39, 145, 121);
		panel_1.add(label_12);
		
		JLabel label = new JLabel("Student ID");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 27, 73, 14);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(126, 25, 127, 20);
		panel_1.add(textField);
		
		JLabel label_1 = new JLabel("First name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 58, 73, 14);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 56, 127, 20);
		panel_1.add(textField_1);
		
		JLabel label_2 = new JLabel("Last name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(10, 89, 73, 14);
		panel_1.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 87, 127, 20);
		panel_1.add(textField_2);
		
		JLabel label_3 = new JLabel("Date of birth");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(10, 124, 73, 14);
		panel_1.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 122, 127, 20);
		panel_1.add(textField_3);
		
		JLabel label_4 = new JLabel("Gender");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(10, 149, 46, 14);
		panel_1.add(label_4);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radioButton.setBounds(126, 145, 52, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radioButton_1.setBounds(180, 145, 73, 23);
		panel_1.add(radioButton_1);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(10, 274, 46, 14);
		panel_1.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(126, 247, 127, 20);
		panel_1.add(textField_4);
		
		JLabel label_6 = new JLabel("Phone");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(10, 299, 46, 14);
		panel_1.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(126, 272, 127, 20);
		panel_1.add(textField_5);
		
		JLabel label_7 = new JLabel("Address");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(10, 249, 46, 14);
		panel_1.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(126, 297, 127, 20);
		panel_1.add(textField_7);
		
		JLabel label_8 = new JLabel("Department");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(10, 174, 73, 14);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Course");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(10, 199, 46, 14);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Semester");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(10, 224, 73, 14);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(304, 132, -346, 30);
		panel_1.add(label_11);
		
		JButton button = new JButton("Add new");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(126, 343, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Update");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBounds(225, 343, 89, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Save");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.setBounds(324, 343, 89, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Delete");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_3.setBounds(423, 343, 89, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Add picture");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_4.setBounds(324, 171, 105, 23);
		panel_1.add(button_4);
		
		JLabel lblStudentForm = new JLabel("Student form");
		lblStudentForm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentForm.setBounds(10, 0, 96, 14);
		panel_1.add(lblStudentForm);
		
		JComboBox comboDepartment = new JComboBox();
		comboDepartment.setBounds(126, 175, 127, 20);
		panel_1.add(comboDepartment);
		
		List<String> ls = new ArrayList<String>(); 
		ls.add("Architecture");
		ls.add("etf");
		comboDepartment.setModel(new DefaultComboBoxModel(ls.toArray()));
		
		JComboBox comboCourse = new JComboBox();
		comboCourse.setBounds(126, 197, 127, 20);
		panel_1.add(comboCourse);
		
		JComboBox comboSemester = new JComboBox();
		comboSemester.setBounds(126, 222, 127, 20);
		panel_1.add(comboSemester);
	}
}
