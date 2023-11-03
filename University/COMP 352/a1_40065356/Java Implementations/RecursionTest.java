import java.util.Arrays;

public class RecursionTest {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr1));
		System.out.println(System.currentTimeMillis());
		reverseArray1(arr1, 0, arr1.length-1);
		System.out.println(System.currentTimeMillis());
		System.out.println(Arrays.toString(arr1));
		reverseArray2(arr1);
		System.out.println(System.currentTimeMillis());
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void reverseArray1(int[] arr, int low, int high) {
		if (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			reverseArray1(arr, low+1, high-1);
		}
	}

	public static int[] reverseArray2(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return arr;
	}
}
