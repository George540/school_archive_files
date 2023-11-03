
import java.util.Arrays;

public class Q1_ArrayAlgorithm {

	public static void main(String[] args) {
		int[] A = {2,5,8,9,2,3,4,8};
		System.out.println("QUESTION 1 - ALGORITHM:");
		System.out.println("EVEN NUMBER OF ELEMENTS IN ARRAY: ");
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(algoArray(A, A.length)));
		
		System.out.println();
		
		System.out.println("ODD NUMBER OF ELEMENTS IN ARRAY: ");
		int[] B = {2,5,8,9,2,3,4,8,5};
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(algoArray(B, B.length)));

	}
	
	public static int[] algoArray(int[] A, int n) {
		if (n < 4)
			return A;
		for (int i = 0; i < (int)Math.ceil(n/2); i+=2) {
			if (i+1 < (int)Math.ceil(n/2)) {
				int temp = A[i+1];
				A[i+1] = A[i];
				A[i] = temp;
			}
		}
		for (int i = (int)Math.ceil((n+1)/2); i < n; i+=2) {
			if (i+1 < n)
				A[i+1] *= A[i];
		}
		return A;
	}
}
