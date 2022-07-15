package com.springcore;

public class Student {
	private int student;
	private String studentName;
	private String studentAddress;
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(int student, String studentName, String studentAddress) {
		super();
		this.student = student;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [student=" + student + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	

}
