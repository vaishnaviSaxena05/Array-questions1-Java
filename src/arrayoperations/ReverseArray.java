package arrayoperations;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int arr[], int n) {
	   int low = 0 , high = n-1;
	   while(low<high) {
		   int temp = arr[low];
		   arr[low]= arr[high];
		   arr[high]= temp;
		   low++;
		   high--;
	   }
	   
	}
	
	public static void main(String[] args) {
		int n= 5;
		int arr[]= {23,4,76,77,8};
		reverseArray(arr, n);
		System.out.println(Arrays.toString(arr));
	}

}
