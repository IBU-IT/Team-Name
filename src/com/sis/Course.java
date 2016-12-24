package com.sis;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private static List<Course> allCourses = new ArrayList<Course>();
	
	private String name;
	private Department department;
	
	public Course(String name, Department department) {
		this.name = name;
		this.department = department;
		
		allCourses.add(this);
	}
	
	public static List<Course> getCoursesByDepartmentName(String departmentName, int semester) {
		List<Course> courses = new ArrayList<Course>();
		
		Department department = Department.getDepartmentByName(departmentName, semester);
		
		for (Course course : allCourses) {
			if(course.department == department)
				courses.add(course);
		}
		
		return courses;
	}
	
	public String getName() {
		return this.name;
	}
	
}