package com.sis;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private static List<Department> allDepartments = new ArrayList<Department>();
	
	private String name;
	private int semester;
	
	public Department(String name, int semester) {
		this.name = name;
		this.semester = semester;
		
		allDepartments.add(this);
	}
	
	public static Department getDepartmentByName(String departmentName, int semester) {
		for (Department department : allDepartments) {
			if(department.name == departmentName && department.semester == semester)
				return department;
		}
		
		return null;
	}
	
	public static List<Department> getDepartmentsBySemester(int semester) {
		List<Department> departments = new ArrayList<Department>();
		
		for (Department department : allDepartments) {
			if(department.semester == semester)
				departments.add(department);
		}
		
		return departments;
	}
	
	public static ArrayList<Integer> getSemestersArray() {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		
		for (Department department : allDepartments) {
			if(!ls.contains(department.semester))
				ls.add(department.semester);
		}
		
		return ls;
	}
	
	
	public String getName() {
		return this.name;
	}
}
