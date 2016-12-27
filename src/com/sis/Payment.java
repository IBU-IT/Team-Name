package com.sis;

import java.sql.PreparedStatement;

public class Payment extends ConnectionToDatabase{
	
	public Payment(int studentID, String amount, String date) {
		try {
			

			String query = " insert into payementstable (payementid, studentid, amount, date)" + " values (?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			
			preparedStmt.setInt(1, 0);
			
			preparedStmt.setInt(2, studentID);
			
			preparedStmt.setString(3, amount);

			preparedStmt.setString(4, date);

			preparedStmt.execute();
			

			System.out.format("Table Updated");

		} catch (Exception e) {
			
			System.out.println("ERROR while inserting into table. " + e);
		}
	}

}