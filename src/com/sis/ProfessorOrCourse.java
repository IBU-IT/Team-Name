package com.sis;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfessorOrCourse extends JPanel {

	public static void main(String[] args) {
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
		backroundProfOrCour.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\ProfOrCOurse.jpg"));
		backroundProfOrCour.setBounds(0, 0, 631, 512);
		frame.getContentPane().add(backroundProfOrCour);

	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
