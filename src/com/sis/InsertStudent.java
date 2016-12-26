package com.sis;

import java.sql.PreparedStatement;

public class InsertStudent extends ConnectionToDatabase{
	
	public InsertStudent(String name, String lastName, String adress, String password, int year, String department) {
		try {
			

			String query = " insert into studentstable (id, Name, LastName, adress, password, year, department)" + " values (?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(1, 0);
			
			preparedStmt.setString(2, name);
			
			preparedStmt.setString(3, lastName);

			preparedStmt.setString(4, adress);

			preparedStmt.setString(5, password);
			
			preparedStmt.setInt(6, year);
			
			preparedStmt.setString(7, department);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
		}
	}

}
