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

		JPanel panel = new JPanel();
		panel.setBounds(10, 111, 192, 163);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblDisreteMathematics = new JLabel("<HTML><U>Disrete mathematics</U></HTML>");
		lblDisreteMathematics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				labelclick(frame);
			}
		});

		JLabel lblCourses = new JLabel("Courses");
		lblCourses.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblCourses);
		lblDisreteMathematics.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblDisreteMathematics);

		JLabel lblDiferentialEquations = new JLabel("<HTML><U>Diferential equations</U></HTML>");
		lblDiferentialEquations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelclick(frame);
			}
		});
		lblDiferentialEquations.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblDiferentialEquations);

		JLabel lblDigitalDesign = new JLabel("<HTML><U>Digital design</U></HTML>");
		lblDigitalDesign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelclick(frame);
			}
		});
		lblDigitalDesign.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigitalDesign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblDigitalDesign);

		JLabel lblObjectOrientedProgramming = new JLabel("<HTML><U>Object oriented programming</U></HTML>");
		lblObjectOrientedProgramming.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelclick(frame);
			}
		});
		lblObjectOrientedProgramming.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblObjectOrientedProgramming);

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

	}

	private void labelclick(Component frmLogin) {
		JOptionPane.showMessageDialog(frmLogin, "My Goodness, you are right");
	}
}
