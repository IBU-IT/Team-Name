package com.sis;

import java.sql.PreparedStatement;

public class InsertAttendence extends ConnectionToDatabase{
	
	public InsertAttendence(int studentID, int courseID, String attendence) {
		try {
			

			String query = " insert into attendencetable (studentid, courseid, attendence)" + " values (?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(1, studentID);
			
			preparedStmt.setInt(2, courseID);
			
			preparedStmt.setString(3, attendence);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
		}
	}

}
