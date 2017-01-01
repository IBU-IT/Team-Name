package com.sis;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SearchStudent {
	
	private static void setUIFont(javax.swing.plaf.FontUIResource f)
	{
	    java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements())
	    {
	        Object key = keys.nextElement();
	        Object value = UIManager.get(key);
	        if (value instanceof javax.swing.plaf.FontUIResource)
	        {
	            UIManager.put(key, f);
	        }
	    }
	}

	private JFrame frmLogin;
	private JTextField studentidTB;
	private JTextField passwordTB;

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
					SearchStudent window = new SearchStudent();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void init() {
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
		
		
	}

	/**
	 * Create the application.
	 */
	public SearchStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 631, 576);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		studentidTB = new JTextField();
		studentidTB.setBounds(215, 214, 244, 40);
		studentidTB.setBackground(new Color(128/255f,128/255f,128/255f));
		studentidTB.setBorder(null);
		studentidTB.setText("Username");
		studentidTB.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (studentidTB.getText().equals("Username")) {
		        	studentidTB.setText("");
		        	studentidTB.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (studentidTB.getText().isEmpty()) {
		        	studentidTB.setForeground(Color.RED);
		        	studentidTB.setText("Username");
		        }
		    }
		    });
		

//		File font_file = new File("Roboto-Regular.ttf");
//		Font font = null;
//		try {
//			font = Font.createFont(Font.TRUETYPE_FONT, font_file).deriveFont(17f);
//		} catch (FontFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//studentidTB.setFont(font);
		
		//studentidTB.setOpaque(false);
		frmLogin.getContentPane().add(studentidTB);
		
		
		passwordTB = new JTextField();
		passwordTB.setBounds(215, 265, 244, 40);
		frmLogin.getContentPane().add(passwordTB);
		passwordTB.setBackground(new Color(128/255f,128/255f,128/255f));
		passwordTB.setBorder(null);
		//passwordTB.setForeground(Color.GRAY);
		passwordTB.setText("Password");
		passwordTB.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (passwordTB.getText().equals("Password")) {
		        	passwordTB.setText("");
		        	passwordTB.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (passwordTB.getText().isEmpty()) {
		        	passwordTB.setForeground(Color.RED);
		        	passwordTB.setText("Password");
		        }
		    }
		    });
		
		
		JLabel greskaLBL = new JLabel("");
		greskaLBL.setBounds(90, 34, 286, 14);
		frmLogin.getContentPane().add(greskaLBL);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.setForeground(Color.WHITE);
		submitBtn.setBackground(new Color(148,196,108));
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(arg0);
				
				if (studentidTB.getText() != null || passwordTB.getText() != null) {
					
					String[] student = ConnectionToDatabase.RetriveStudent(Integer.parseInt(studentidTB.getText()));
					
					if (passwordTB.getText().equals(student[4])){
						StudentDashboard studentDashboard = new StudentDashboard();
						frmLogin.setVisible(false);
						studentDashboard.showWindow();
						System.out.println("done");
					}
					
					System.out.println("pw and username are entered but not in db " + student[4]);
				
				}else {
					System.out.println("error");
					greskaLBL.setText("You have to enter id and password");
					
					
				}
				
			}//actionPerformed
		});
		
		submitBtn.setBounds(179, 323, 280, 41);
		frmLogin.getContentPane().add(submitBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("15730843_746693345482056_948976948_n.jpg"));
		lblNewLabel.setBounds(0, 0, 615, 537);
		frmLogin.getContentPane().add(lblNewLabel);
		
		
	}
}