package com.sis;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddProfessorJP extends JPanel {
	private JTextField profesorID;
	private JTextField name;
	private JTextField lastname;
	private JTextField address;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProfessorJP window = new AddProfessorJP();
					//window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AddProfessorJP() {
		JFrame frame = new JFrame ("Add a professor");
		frame.setVisible(true);
		frame.setSize(637,551);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblProfessorId = new JLabel("Professor ID");
		
		lblProfessorId.setBounds(23, 208, 92, 14);
		frame.getContentPane().add(lblProfessorId);
		
		profesorID = new JTextField();
		profesorID.setBounds(125, 205, 120, 20);
		frame.getContentPane().add(profesorID);
		profesorID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(new Color(148,196,108));
		lblName.setBounds(23, 242, 66, 14);
		frame.getContentPane().add(lblName);
		
		name = new JTextField();
		name.setBounds(125, 239, 120, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setBackground(new Color(148,196,108));
		lblLastName.setBounds(23, 276, 66, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setForeground(Color.WHITE);
		lblAdress.setBackground(new Color(148,196,108));
		lblAdress.setBounds(23, 301, 46, 14);
		frame.getContentPane().add(lblAdress);
		
		lastname = new JTextField();
		lastname.setBounds(125, 270, 120, 20);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		address = new JTextField();
		address.setBounds(125, 298, 120, 20);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.WHITE);
		btnSave.setBackground(new Color(148,196,108));
		btnSave.addActionListener(new ActionListener() {
			// kreiranje profesora
			public void actionPerformed(ActionEvent e) {
				if (!profesorID.getText().equals("") && !name.getText().equals("") && !lastname.getText().equals("")) {
					InsertProfessor professor = new InsertProfessor(name.getText(), lastname.getText(), address.getText(), name.getText());
					JOptionPane.showMessageDialog(null, "Professor added");
				} else {
					JOptionPane.showMessageDialog(null, "You have to enter professorID, name, lastname");
				}
			}
		});
		btnSave.setBounds(456, 452, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel lblBackprof = new JLabel("backProf");
		lblBackprof.setIcon(new ImageIcon("C:\\Users\\nixx\\Desktop\\t.png"));
		lblBackprof.setBounds(0, 0, 621, 512);
		frame.getContentPane().add(lblBackprof);

	}
	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}
