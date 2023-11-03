import java.io.*;

public class TailTetranacci {
	static PrintWriter output;

	public static void main(String[] args) {
		File file = new File("resultsTail.txt");
		int minimum = 10;
		int maximum = 20;
		// base cases (first 4 tetranacci numbers)
		final int[] arr = {0, 0, 0, 1};
		
		try {
			output = new PrintWriter(new FileOutputStream(file));
			output.println("PROGRAM BY GEORGE MAVROEIDIS (40065356) . COMP 352 . DUE: 30 SEPTEMBER 2019");
			output.println("");
			output.println("TIME ELAPSED IN NANOSECONDS:");
			for (int i = minimum; i <= maximum; i+=5) {
				long startTime1 = System.nanoTime();
				tailTetranacci(arr, i);
				long endtTime1 = System.nanoTime();
				long totalTime1 = endtTime1 - startTime1;
				System.out.println("Elapsed time of function tailTetranacci(arr, " + i + "): " + totalTime1);
				output.println("Elapsed time of function tailTetranacci(arr, " + i + "): " + totalTime1);
				
			}
			
			output.println("");
			output.println("RESULT OF EACH FUNCTION FOR COMPARISON:");
			
			int[] arr2 = {0, 0, 0, 1};
			System.out.println("Result of tailTetranacci(arr, 10): " + tailTetranacci(arr2, 10));
			output.println("Result of tailTetranacci(arr, 10): " + tailTetranacci(arr2, 10));
			int[] arr3 = {0, 0, 0, 1};
			System.out.println("Result of tailTetranacci(arr, 15): " + tailTetranacci(arr3, 15));
			output.println("Result of tailTetranacci(arr, 15): " + tailTetranacci(arr3, 15));
			int[] arr4 = {0, 0, 0, 1};
			System.out.println("Result of tailTetranacci(arr, 20): " + tailTetranacci(arr4, 20));
			output.println("Result of tailTetranacci(arr, 20): " + tailTetranacci(arr, 20));
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

	
	private static int tailTetranacci(int[] arr, int n) {
		if (n < 4) return arr[n];
	    int sum = arr[0] + arr[1] + arr[2] + arr[3];
	    for (int i = 0; i < 3; i++) 
	    	arr[i] = arr[i+1];
	    arr[3] = sum;
	    return tailTetranacci(arr, n-1); 
	}

}
