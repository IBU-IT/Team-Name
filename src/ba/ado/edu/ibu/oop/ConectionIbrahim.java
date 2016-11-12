package com.ibrahimmuzaferija.oop;

import java.sql.*;

public class ConectionIbrahim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "agencij2_ibrahim";
		String password = "adminadmin";
		String url = "//localhost:3306/agencij2_oopproject";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);

//			String query = " select * from sistable";
//
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(query);
//
//			while (rs.next()) {
//				int id = rs.getInt("idsistable");
//				String firstName = rs.getString("studentname");
//				String lastName = rs.getString("studentlastname");
//				String adress = rs.getString("adress");
//
//				// print the results
//				System.out.format("%s, %s, %s, %s\n", id, firstName, lastName, adress);
//			}
//
//			System.out.println("dobar");

			int id = 1;

			String query = " select * from students where id=?";

			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1,id);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				int ids = rs.getInt("id");
				String firstName = rs.getString("name");
				String lastName = rs.getString("last_name");
				String adress = rs.getString("adress");

				// print the results
				System.out.format("%s, %s, %s, %s\n", ids, firstName, lastName, adress);
			}

			// PreparedStatement preparedStmt = con.prepareStatement(query);

			// preparedStmt.setInt (1, 1);
			// preparedStmt.setString (2, "Rubble");
			// preparedStmt.setString (3, "nesto");

			// preparedStmt.setString (4, "sarajevo");

			// preparedStmt.execute();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
