package com.sis;

import java.sql.PreparedStatement;

public class UpdateStudentDb extends ConnectionToDatabase{
	/**
	 * The vertical distances of point.
	 */
	public UpdateStudentDb(int studentId, String name, String lastName, String adress, String password, int year, String department, String email, String phone) {
		try {
			

			String query = " update studentstable set  name= ?, lastName = ?, adress = ?, password = ?, year = ?, department = ?, email =?, phone = ? where id =?" + 
			" values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(9, studentId);
			
			preparedStmt.setString(1, name);
			
			preparedStmt.setString(2, lastName);

			preparedStmt.setString(3, adress);

			preparedStmt.setString(4, password);
			
			preparedStmt.setInt(5, year);
			
			preparedStmt.setString(6, department);
			
			preparedStmt.setString(7, email);
			
			preparedStmt.setString(8, phone);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
		}
	}

}
