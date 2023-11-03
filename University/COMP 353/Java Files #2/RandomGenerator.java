package Comp353;
import java.util.Random; 

public class RandomGenerator {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		/*
		int min = 1000;
		int max = 9999;
		for (int i = 0; i < 30; i++) {
			System.out.println(rand.nextInt(max-min)+min);
		}
		*/
		
		String[] programs = new String[10];
		programs[0] = "Computer Science";
		programs[1] = "Software Engineering";
		programs[2] = "Film Animation";
		programs[3] = "Computational Arts";
		programs[4] = "Physical Education";
		programs[5] = "Business Administration";
		programs[6] = "Psychology";
		programs[7] = "Communications";
		programs[8] = "Political Science";
		programs[9] = "Economics";
		
		String[] courses = new String[15];
		courses[1] = "Advanced Programming Design in C++";
		courses[2] = "Databases";
		courses[3] = "Thermodynamics";
		courses[4] = "Linear Algebra I";
		courses[5] = "Introduction to Philosophy";
		courses[6] = "Advanced 3D Animation";
		courses[7] = "Sound Design";
		courses[8] = "Game Design";
		courses[9] = "Transistors II";
		courses[10] = "Differential Equations";
		courses[11] = "Geography of Canada";
		courses[12] = "History of WWII";
		courses[13] = "Nanotechnology";
		courses[14] = "Artificial Intelligence";
		
		String[] grades = new String[13];
		grades[0] = "A+";
		grades[1] = "A";
		grades[2] = "A-";
		grades[3] = "B+";
		grades[4] = "B";
		grades[5] = "B-";
		grades[6] = "C+";
		grades[7] = "C";
		grades[8] = "C-";
		grades[9] = "D+";
		grades[10] = "D";
		grades[11] = "D-";
		grades[12] = "F";
		
		
		for (int i = 0; i < 30; i++) {
			System.out.println(grades[rand.nextInt(13)]);
		}
		
		

	}

}
