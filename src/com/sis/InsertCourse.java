package com.sis;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.plaf.FontUIResource;

public class InsertCourse extends ConnectionToDatabase{
	
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
		
		//InsertCourseDB("Programing", "2", "it", "4");
		
	}
	
	private static void setUIFont(FontUIResource fontUIResource) {
		// TODO Auto-generated method stub
		
	}

	public InsertCourse(String course, String year, String department, String semester) {
		
		InsertCourseDB(course, year, department, semester);
	}
	
	public static void InsertCourseDB(String course, String year, String department, String semester) {
		try {
			

			String query = " insert into coursestable (courseid, course, year, department, semester)" + " values (?, ?, ?, ?, ?)";
			
			con = DriverManager.getConnection(DBurl, DBuser, DBpassword);

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(1, 0);
			
			preparedStmt.setString(2, course);
			
			preparedStmt.setString(3, year);

			preparedStmt.setString(4, department);

			preparedStmt.setString(5, semester);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		}

}
