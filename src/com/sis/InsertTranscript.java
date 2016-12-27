package com.sis;

import java.sql.PreparedStatement;

public class InsertTranscript extends ConnectionToDatabase{
	
public InsertTranscript(int studentID, int courseID, String finalGrade){
		
	try {
		

		String query = " insert into transcripttable (studentid, courseid, finalgrade)" + " values (?, ?, ?)";

		PreparedStatement preparedStmt = con.prepareStatement(query);

		
		preparedStmt.setInt(1, studentID);
		
		preparedStmt.setInt(2, courseID);
		
		preparedStmt.setString(3, finalGrade);

		preparedStmt.execute();
		

		System.out.format("Table Updated");

	} catch (Exception e) {
		
		System.out.println("ERROR while inserting into table. " + e);
	}	
	
	}

}
