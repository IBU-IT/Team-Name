package com.sis;

import java.sql.*;

public class ConnectionToDatabase {
	
	static final String DBuser = "a158cb_oop";
	static final String DBpassword = "adminadmin123";
	static final String DBurl = "jdbc:mysql://mysql5006.smarterasp.net:3306/db_a158cb_oop";
	public static Connection con = null;
	
	public ConnectionToDatabase() {
		
		try{
			
			con = DriverManager.getConnection(DBurl, DBuser, DBpassword);

			} catch (Exception e) {
			
			System.out.println(e);
			
			}
		
//		InsertStudent("adnan","ahmic","visoko","pw",2,"IT");
		
//		String[] a = RetriveStudent(301016);
//		for (int n=0; n<a.length; n++){
//			System.out.println(a[n]);
//		}
	}


	
	public static String[] RetriveStudent(int id){

		String[] studentArray = new String[7];
		
		String query = " select * from StudentsTable where id=?";
		
		try {

			Connection con = DriverManager.getConnection(DBurl, DBuser, DBpassword);
			PreparedStatement stm = con.prepareStatement(query);
			
			stm.setInt(1, id);
			
			ResultSet rs = stm.executeQuery();
 
			while (rs.next()) {
				
				String firstName = rs.getString("name");
				
				String lastName = rs.getString("lastname");
				
				String adress = rs.getString("adress");
				
				String password = rs.getString("password");
				
				String year = rs.getString("year");
				
				String department = rs.getString("department");

				// print the results
				//System.out.format("%s, %s, %s, %s\n", firstName, lastName, adress);
				
				studentArray[0] = String.valueOf(id);
				studentArray[1] = firstName;
				studentArray[2] = lastName;
				studentArray[3] = adress;
				studentArray[4] = password;
				studentArray[5] = year;
				studentArray[6] = department;
			
			}

		} catch (Exception e) {
			
			System.out.println("ERROR while retriving data from table ::::::>" + e);
		}
		
		return studentArray;
	}

}
