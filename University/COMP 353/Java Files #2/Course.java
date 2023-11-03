package Comp353;

public class Course {

	public String courseID;
	private String name;
	private double credits;
	
	
	
	
	public Course() {
		courseID = "none";
		name = "none";
		credits = 0;
	}
	
	public Course(String courseID, String name, double credits) {
		this.courseID = courseID;
		this.name = name;
		this.credits = credits;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course ID: " + courseID + ", name: " + name + ", credits: " + credits;
	}
	
	
	
	
}
