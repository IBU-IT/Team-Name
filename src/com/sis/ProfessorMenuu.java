package com.sis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ProfessorMenuu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfessorMenuu window = new ProfessorMenuu();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfessorMenuu() {

		JFrame frame = new JFrame ("Professor Menu");
		frame.setVisible(true);
		frame.setSize(637,551);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddStudent = new JButton("Add student");
		btnAddStudent.setForeground(Color.WHITE);
		btnAddStudent.setBackground(new Color(148,196,108));
		btnAddStudent.setBounds(81, 415, 149, 23);
		frame.getContentPane().add(btnAddStudent);
		
		JButton btnSearchStudent = new JButton("Search Student");
		btnSearchStudent.setForeground(Color.WHITE);
		btnSearchStudent.setBackground(new Color(148,196,108));
		btnSearchStudent.setBounds(428, 415, 149, 23);
		frame.getContentPane().add(btnSearchStudent);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\15731437_746703492147708_1514733347_n.jpg"));
		label.setBounds(0, 0, 621, 512);
		frame.getContentPane().add(label);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
