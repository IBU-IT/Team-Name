package com.sis;

import java.sql.PreparedStatement;

public class InsertCourse extends ConnectionToDatabase{
	
	public InsertCourse(String course, String year, String department, String semester) {
		try {
			

			String query = " insert into coursestable (courseid, course, year, department, semester)" + " values (?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(1, 0);
			
			preparedStmt.setString(2, course);
			
			preparedStmt.setString(3, year);

			preparedStmt.setString(4, department);

			preparedStmt.setString(5, semester);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
		}	
		
		}

}
