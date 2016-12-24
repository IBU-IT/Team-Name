package com.sis;

import java.sql.*;

public class ConnectionToDatabase {
	
	static final String user = "a158cb_oop";
	static final String password = "adminadmin123";
	static final String url = "jdbc:mysql://mysql5006.smarterasp.net:3306/db_a158cb_oop";

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(url, user, password);

			int id = 301015;

			String query = " select * from StudentsTable where id=?";

			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
 
			while (rs.next()) {
				int ids = rs.getInt("id");
				String firstName = rs.getString("Name");
				String lastName = rs.getString("LastName");
				String adress = rs.getString("Adress");

				// print the results
				System.out.format("%s, %s, %s, %s\n", ids, firstName, lastName, adress);
			}

		} catch (Exception e) {
			System.out.println("ERROR while retriving data from table. " + e);
		}
	}

	public void InsertInTable(String Name, String LastName, String Adress, String Password, int year, String department) {
		try {
			

			Connection con = DriverManager.getConnection(url, user, password);

			String query = " insert into Students (id, Name, LastName, adress)" + " values (?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			preparedStmt.setInt(1, 0);
			preparedStmt.setString(2, "Ibrahim");
			preparedStmt.setString(3, "Muzaferija");

			preparedStmt.setString(4, "Sarajevo");

			preparedStmt.execute();

			System.out.format("Table Updated");

		} catch (Exception e) {
			System.out.println("ERROR while inserting into table. " + e);
		}
	}
	
	public int RetriveFromDatabase(String query, int intFromTable){
		//to do
		int i = 0;
		
		try {

			Connection con = DriverManager.getConnection(url, user, password);


			// example of query: " select * from StudentsTable where id=?";

			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, intFromTable);
			ResultSet rs = stm.executeQuery();
 
			while (rs.next()) {
				int ids = rs.getInt("id");
				String firstName = rs.getString("Name");
				String lastName = rs.getString("LastName");
				String adress = rs.getString("Adress");

				// print the results
				System.out.format("%s, %s, %s, %s\n", ids, firstName, lastName, adress);
				
			}

		} catch (Exception e) {
			System.out.println("ERROR while retriving data from table. " + e);
		}
		
		return i;
	}

}
