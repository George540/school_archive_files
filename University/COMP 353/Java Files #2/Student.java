package Comp353;

public class Student {
	
	public int studentID;
	private String name;
	private String program;
	private String address;
	
	public Student() {
		studentID = 0;
		program = "none";
		address = "none";
	}
	
	public Student(int studentID, String name, String program, String address) {
		this.studentID = studentID;
		this.name = name;
		this.program = program;
		this.address = address;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student Name: " + name + ", Student ID: " + studentID + ", Program: " + program + ", Address: " + address;
	}

}
