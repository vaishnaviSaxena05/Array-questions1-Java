package arrayoperations;

import java.util.Arrays;

public class ArrayLargestElement {
	static int getLargest(int arr[]) {
		int  res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[res]) {
				res = i;

			}

		}
		return res;
	}

	public static void main(String[] args) {
           int arr[]= {32,3,5,67,34};
         
           getLargest(arr);
           System.out.println();
           System.out.println(Arrays.toString(arr));
           
	}
}
