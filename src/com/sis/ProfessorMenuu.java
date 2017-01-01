package com.sis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ProfessorMenuu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
File font_file = new File("Roboto-Regular.ttf");
		
		try {
			setUIFont (new javax.swing.plaf.FontUIResource(Font.createFont(Font.TRUETYPE_FONT, font_file).deriveFont(17f)));
		} catch (FontFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfessorMenuu window = new ProfessorMenuu();
					//window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void setUIFont(FontUIResource fontUIResource) {
		// TODO Auto-generated method stub
		
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
		
		btnSearchStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SearchStudentJP.init();
				SearchStudentJP prof = new SearchStudentJP();
				prof.setVisible(true);
			}
				
			
		});
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddStudent.setForeground(Color.WHITE);
		btnAddStudent.setBackground(new Color(148,196,108));
		btnAddStudent.setBounds(81, 415, 150, 23);
		frame.getContentPane().add(btnAddStudent);
		
		btnAddStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CreateUser.init();
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("15731437_746703492147708_1514733347_n.jpg"));
		lblNewLabel.setBounds(0, 0, 621, 512);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}
