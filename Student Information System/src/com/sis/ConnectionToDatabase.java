package com.sis;

import java.sql.*;

public class ConnectionToDatabase {

	public static void main(String[] args) {

		String user = "sql7146982";
		String password = "SS2pTPI2Lz";
		String url = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7146982";

		try {

			Connection con = DriverManager.getConnection(url, user, password);

			int id = 0;

			String query = " select * from Students where id=?";

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

	public void InsertInTable(String Name, String LastName, String Adress) {
		try {
			String user = "sql7146982";
			String password = "SS2pTPI2Lz";
			String url = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7146982";

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

}
