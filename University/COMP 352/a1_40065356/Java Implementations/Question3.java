import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		System.out.println("QUESTION 3 - ALGORITHM IMPLEMENTATION:");
		System.out.println();
		int[] B = {4,11,5,3,2};
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(myAlgorithm(B, B.length)));
		System.out.println();
		
		int[] C = {7,3,4,6,1,9,5,13,12,0,20,80,24,78,15,100,45,33};
		System.out.println(Arrays.toString(C));
		System.out.println(Arrays.toString(myAlgorithm(C, C.length)));
		System.out.println();
		
		int[] D = {7,3,9,1};
		System.out.println(Arrays.toString(D));
		System.out.println(Arrays.toString(myAlgorithm(D, D.length)));
		System.out.println();
		
		int[] E = {9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(E));
		System.out.println(Arrays.toString(myAlgorithm(E, E.length)));
		System.out.println();

	}
	
	public static int[] myAlgorithm(int[] A, int n) {
		boolean done = true;
		int j = 0;
		while (j <= n-2) {
			if (A[j] > A[j+1]) {
				// swap method using temp variable
				A[j] = A[j] + A[j+1];
				A[j+1] = A[j] - A[j+1];
				A[j] = A[j] - A[j+1];
				done = false;
			}
			j++;
		}
		j = n-1;
		while (j >= 1) {
			if (A[j] < A[j-1]) {
				// swap method using temp variable
				A[j-1] = A[j-1] + A[j];
				A[j] = A[j-1] - A[j];
				A[j-1] = A[j-1] - A[j];
				done = false;
			}
			j--;
		}
		if(!done) {
			myAlgorithm(A, n);
			System.out.println("EXECUTION");
		}
		else
			return A;
		return A;
	}
}
