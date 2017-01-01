package com.sis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchStudentSql extends ConnectionToDatabase{
	
	public SearchStudentSql() {
		
	}
	public ResultSet Search(String studentid) {
		try {
			String query = " select * from studentstable where id = ?";

			PreparedStatement preparedStmt = con.prepareStatement(query);
			
			preparedStmt.setInt(1, Integer.parseInt(studentid));

			preparedStmt.execute();
			
			return preparedStmt.getResultSet();

			

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
			return null;
		}
	}
}
