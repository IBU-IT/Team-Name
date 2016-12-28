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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnSearchStudent = new JButton("Search Student");
		btnSearchStudent.setForeground(Color.WHITE);
		btnSearchStudent.setBackground(new Color(148,196,108));
		btnSearchStudent.setBounds(427, 415, 150, 23);
		frame.getContentPane().add(btnSearchStudent);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddStudent.setForeground(Color.WHITE);
		btnAddStudent.setBackground(new Color(148,196,108));
		btnAddStudent.setBounds(81, 415, 150, 23);
		frame.getContentPane().add(btnAddStudent);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\15731437_746703492147708_1514733347_n.jpg"));
		lblNewLabel.setBounds(0, 0, 621, 512);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}
