package Comp353;

public class CourseEnrolled {

	
	public int studentID;
	public String courseID;
	private String grade;
	
	public CourseEnrolled() {
		studentID = 0;
		courseID = "none";
		grade = "NA";
	}

	public CourseEnrolled(int studentID, String courseID, String grade) {
		super();
		this.studentID = studentID;
		this.courseID = courseID;
		this.grade = grade;
	}
	

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentID: " + studentID + ", courseID: " + courseID + ", grade received: " + grade;
	}	
	
}
