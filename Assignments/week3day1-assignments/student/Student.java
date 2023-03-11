package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println(" student name :uzma");
	}
	public void studentId() {
		System.out.println("The student code : 6457 ");
	}
	public void studentDept() {
		System.out.println("This student is in compute department ");
	}
	public static void main(String[] args) {
				
		Student student1 = new Student();;
		student1.collegeName();
		student1.collegeCode();
		student1.collegeRank();
	    student1.deptName();
		student1.studentId();
		student1.studentName();
		student1.studentDept();
	}
}
