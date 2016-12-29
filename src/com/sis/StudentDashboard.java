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
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

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
		frame.setBounds(100, 100, 681, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWlcomeAdnanAhmic = new JLabel("Welcome Adnan Ahmic");
		lblWlcomeAdnanAhmic.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWlcomeAdnanAhmic.setBounds(25, 31, 214, 36);
		frame.getContentPane().add(lblWlcomeAdnanAhmic);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GRAY));
		panel_2.setBounds(226, 111, 405, 414);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 5, 385, 398);
		panel_2.add(panel_1);
		panel_1.setBorder(new EmptyBorder(0, 10, 0, 0));
		panel_1.setLayout(new GridLayout(10, 1, 0, 0));

		JLabel lblLectures = new JLabel("Lectures");
		lblLectures.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblLectures);

		JLabel label = new JLabel("<HTML><U>Discrete math lession1</U></HTML>");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelclick(frame);
			}
		});
		panel_1.add(label);

		JLabel lbldiscreteMathLession = new JLabel("<HTML><U>Discrete math lession2</U></HTML>");
		lbldiscreteMathLession.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelclick(frame);
			}
		});
		panel_1.add(lbldiscreteMathLession);

		JLabel lblDiscreteMathLession = new JLabel("<HTML><U>Digital design lab 3</U></HTML>");
		lblDiscreteMathLession.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelclick(frame);
			}
		});
		panel_1.add(lblDiscreteMathLession);
		
		JLabel lblGrades = new JLabel("Grades");
		lblGrades.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrades.setBounds(71, 201, 70, 14);
		frame.getContentPane().add(lblGrades);
		
		JLabel lblAcademics = new JLabel("Attendance");
		lblAcademics.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAcademics.setBounds(71, 156, 95, 14);
		frame.getContentPane().add(lblAcademics);
		
		lblAcademics.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		       

		    }  
		}); 
		
		JLabel lblMessages = new JLabel("Messages");
		lblMessages.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMessages.setBounds(71, 294, 95, 14);
		frame.getContentPane().add(lblMessages);
		
		JLabel lblNewLabel = new JLabel("Payment");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(71, 246, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCourses = new JLabel("Courses");
		lblCourses.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCourses.setBounds(71, 111, 86, 14);
		frame.getContentPane().add(lblCourses);

	}

	private void labelclick(Component frmLogin) {
		JOptionPane.showMessageDialog(frmLogin, "My Goodness, you are right");
	}
}
