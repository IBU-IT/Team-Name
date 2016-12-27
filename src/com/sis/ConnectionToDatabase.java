package com.sis;

import java.sql.*;

public class ConnectionToDatabase {
	
	static final String DBuser = "a158cb_oop";
	static final String DBpassword = "adminadmin123";
	static final String DBurl = "jdbc:mysql://mysql5006.smarterasp.net:3306/db_a158cb_oop";
	public static Connection con = null;
	
	public static void main(String[] args) {
		String[] s = RetriveProfessor(1);
			for(int i = 0; i<s.length; i++){
				System.out.println(s[i]);
			}
			}
	
	
	public ConnectionToDatabase() {
		
		try{
			
			con = DriverManager.getConnection(DBurl, DBuser, DBpassword);

			} catch (Exception e) {
			
			System.out.println(e);
			
			}
	}


	
	public static String[] RetriveStudent(int id){

		String[] studentArray = new String[9];
		
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
				
				String email = rs.getString("email");
				
				String phone = rs.getString("phone");

				// print the results
				//System.out.format("%s, %s, %s, %s\n", firstName, lastName, adress);
				
				studentArray[0] = String.valueOf(id);
				studentArray[1] = firstName;
				studentArray[2] = lastName;
				studentArray[3] = adress;
				studentArray[4] = password;
				studentArray[5] = year;
				studentArray[6] = department;
				studentArray[7] = email;
				studentArray[8] = phone;
			
			}

		} catch (Exception e) {
			
			System.out.println("ERROR while retriving data from table ::::::>" + e);
		}
		
		return studentArray;
	}
	
	
	
	public static String RetriveTranscript(int studentID, int courseID){
		
		String query = " select * from transcripttable where studentid=? and courseid=?";
		
		String finalGrade = "null";
		
		try {

			Connection con = DriverManager.getConnection(DBurl, DBuser, DBpassword);
			PreparedStatement stm = con.prepareStatement(query);
			
			stm.setInt(1, studentID);
			stm.setInt(2, courseID);
			
			ResultSet rs = stm.executeQuery();
 
			while (rs.next()) {
				
				finalGrade = rs.getString("finalgrade");
				
				
			
			}

		} catch (Exception e) {
			
			System.out.println("ERROR while retriving data from table ::::::>" + e);
		}
		
		return finalGrade;
	}

	
	public static String[] RetriveProfessor(int id){

		String[] professorArray = new String[4];
		
		String query = " select * from professorstable where id=?";
		
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
				
				professorArray[0] = firstName;
				professorArray[1] = lastName;
				professorArray[2] = adress;
				professorArray[3] = password;
			
			}

		} catch (Exception e) {
			
			System.out.println("ERROR while retriving data from table ::::::>" + e);
		}
		
		return professorArray;
	}
}
