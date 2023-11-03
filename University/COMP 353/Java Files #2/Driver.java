package Comp353;
import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		File studentFile = new File("Student.txt");
		File courseFile = new File("Course.txt");
		File enrolledFile = new File("Course_Enrolled.txt");
		
		Scanner sc1;
		int category = 0;
		Student[] students = new Student[30];
		Course[] courses = new Course[30];
		CourseEnrolled[] enrolled = new CourseEnrolled[30];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			courses[i] = new Course();
			enrolled[i] = new CourseEnrolled();
		}
		
		String line;
		int number = 0;
		int index = 0;
		
		try {
			sc1 = new Scanner(studentFile);
			
			while (sc1.hasNextLine()) {
				line = sc1.nextLine();
				if (line.equalsIgnoreCase("#studentID") || line.equalsIgnoreCase("#program") || line.equalsIgnoreCase("#address") || line.equalsIgnoreCase("#name")) {
					category++;
					index = 0;
					continue;
				}
				
				if (category == 1) {
					number = Integer.parseInt(line);
					students[index].studentID = number;
				}
				else if (category == 2) {
					students[index].setProgram(line);
				}
				else if (category == 3) {
					students[index].setAddress(line);
				}
				else if (category == 4) {
					students[index].setName(line);
				}
				index++;
			}
			
			students[29].setName("George Bugs");
			sc1 = new Scanner(courseFile);
			category = 0;
			index = 0;
			
			while (sc1.hasNextLine()) {
				line = sc1.nextLine();
				if (line.equalsIgnoreCase("#courseID") || line.equalsIgnoreCase("#name") || line.equalsIgnoreCase("#credits")) {
					category++;
					index = 0;
					continue;
				}
				
				if (category == 1) {
					courses[index].courseID = line;
				}
				else if (category == 2) {
					courses[index].setName(line);
				}
				else if (category == 3) {
					courses[index].setCredits(Double.parseDouble(line));
				}
				index++;
			}
			
			sc1 = new Scanner(enrolledFile);
			category = 0;
			index = 0;
			
			while (sc1.hasNextLine()) {
				line = sc1.nextLine();
				if (line.equalsIgnoreCase("#studentID") || line.equalsIgnoreCase("#courseID") || line.equalsIgnoreCase("#grade")) {
					category++;
					index = 0;
					continue;
				}
				
				if (category == 1) {
					enrolled[index].studentID = Integer.parseInt(line);
				}
				else if (category == 2) {
					enrolled[index].courseID = line;
				}
				else if (category == 3) {
					enrolled[index].setGrade(line);
				}
				index++;
			}
			
			
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found. Restart");
			System.exit(0);
		}
		catch (IOException e) {
			System.out.println("Cannot read file. Restart program");
			System.exit(0);
		}
		
		/*
		for (int i = 0; i < 30; i++) {
			System.out.println(i + ". " + students[i].toString());
		}
		*/
		for (int i = 0; i < 30; i++) {
			if (enrolled[i].courseID.equalsIgnoreCase("COMP353") && (enrolled[i].getGrade().equalsIgnoreCase("A+") || enrolled[i].getGrade().equalsIgnoreCase("A") || enrolled[i].getGrade().equalsIgnoreCase("A-") || enrolled[i].getGrade().equalsIgnoreCase("B+"))) {
				System.out.println(students[i].toString());
				System.out.println(enrolled[i].toString());
				System.out.println();
			}
		}

	}

}
