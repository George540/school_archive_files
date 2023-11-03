import java.io.*;

public class Tetranacci {
	static PrintWriter output;

	public static void main(String[] args) {
		File file = new File("results.txt");
		int minimum = 10;
		int maximum = 35;
		try {
			output = new PrintWriter(new FileOutputStream(file));
			output.println("PROGRAM BY GEORGE MAVROEIDIS (40065356) . COMP 352 . DUE: 27 SEPTEMBER 2019");
			output.println("");
			output.println("TIME ELAPSED IN NANOSECONDS:");
			for (int i = minimum; i <= maximum; i+=5) {
				long startTime1 = System.nanoTime();
				MultipleTetranacci(i);
				long endtTime1 = System.nanoTime();
				long totalTime1 = endtTime1 - startTime1;
				System.out.println("Elapsed time of function MultipleTetranacci(" + i + "): " + totalTime1);
				output.println("Elapsed time of function MultipleTetranacci(" + i + "): " + totalTime1);
				
				long startTime2 = System.nanoTime();
				LinearTetranacci(i);
				long endtTime2 = System.nanoTime();
				long totalTime2 = endtTime2 - startTime2;
				System.out.println("Elapsed time of function LinearTetranacci(" + i + "): " + totalTime2);
				output.println("Elapsed time of function LinearTetranacci(" + i + "): " + totalTime2);
				System.out.println();
			}
			
			output.println("");
			output.println("RESULT OF EACH FUNCTION FOR COMPARISON:");
			
			for (int i = minimum; i <= maximum; i+=5) {
				System.out.println("Result of MultipleTetranacci(" + i + "): " + MultipleTetranacci(i));
				output.println("Result of MultipleTetranacci(" + i + "): " + MultipleTetranacci(i));
				System.out.println("Result of LinearTetranacci(" + i + "): " + LinearTetranacci(i));
				output.println("Result of LinearTetranacci(" + i + "): " + LinearTetranacci(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please restart program.");
			System.exit(0);
		} finally {
			if (output != null) {
				System.out.println();
				System.out.println("Program is closing. Have a nice day!");
				output.close();
				System.exit(0);
			}
		}
	}
	
	public static int MultipleTetranacci(int n) {
		if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed.");
		if (n == 0 || n == 1 || n == 2) {return 0;}
		else if (n == 3) {return 1;}
		else
			return (MultipleTetranacci(n-1) + MultipleTetranacci(n-2) + MultipleTetranacci(n-3) + MultipleTetranacci(n-4));
	}
	
	public static int LinearTetranacci(int n) {
		if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed.");
		int a = 0, b = 1, c = 1, d = 2;
		int sum = 0;
		
		if (n == 0 || n == 1 || n == 2) {return 0;}
		else if (n == 3 || n == 4) {return 1;}
		else if (n == 5) {return 2;}
		else {
			for (int i = 5; i < n; i++) {
				sum = a + b + c + d;
				a = b;
				b = c;
				c = d;
				d = sum;
			}
			return sum;
		}
	}

}
