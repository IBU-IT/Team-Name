package com.sis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ProfessorOrCourse extends JPanel {

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
					ProfessorOrCourse window = new ProfessorOrCourse();
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

	public ProfessorOrCourse() {
		
		JFrame frame = new JFrame ("Professor or Course Menu");
		frame.setVisible(true);
		frame.setSize(637,551);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddProfessor = new JButton("Add professor");
		btnAddProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProfessorJP prof = new AddProfessorJP();
				prof.setVisible(true);
			}
		});
		btnAddProfessor.setForeground(Color.WHITE);
		btnAddProfessor.setBackground(new Color(148,196,108));
		btnAddProfessor.setBounds(72, 433, 181, 34);
		frame.getContentPane().add(btnAddProfessor);
		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCourseJP course = new AddCourseJP();
				course.setVisible(true);
			}
		});
		btnAddCourse.setForeground(Color.WHITE);
		btnAddCourse.setBackground(new Color(148,196,108));
		btnAddCourse.setBounds(398, 433, 175, 34);
		frame.getContentPane().add(btnAddCourse);
		
		JLabel backroundProfOrCour = new JLabel("");
		backroundProfOrCour.setIcon(new ImageIcon("ProfOrCOurse.jpg"));
		backroundProfOrCour.setBounds(0, 0, 631, 512);
		frame.getContentPane().add(backroundProfOrCour);

	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
