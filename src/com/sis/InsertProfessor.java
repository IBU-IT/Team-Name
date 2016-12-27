package com.sis;

import java.sql.PreparedStatement;

public class InsertProfessor extends ConnectionToDatabase{
	
	public InsertProfessor(String name, String lastName, String adress, String password) {
		try {
			

			String query = " insert into professorstable (id, Name, LastName, adress, password)" + " values (?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(1, 0);
			
			preparedStmt.setString(2, name);
			
			preparedStmt.setString(3, lastName);

			preparedStmt.setString(4, adress);

			preparedStmt.setString(5, password);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
		}	
		
		}

}
