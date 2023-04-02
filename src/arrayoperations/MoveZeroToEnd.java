package arrayoperations;

import java.util.Arrays;

public class MoveZeroToEnd {
	public static void moveZero (int arr[] ,int n) {
		  for(int i=0;i<n-1;i++) {
			 if( arr[i]==0) {
				
			 }
			 for(int j=i+1;j<n;j++) {
				 if(arr[j]!=0) {
					 arr[i]= arr[i]+arr[j];
					 arr[j]= arr[i]-arr[j];
					 arr[i]= arr[i]-arr[j];
				 }
			 }
		  }
	}
	
	public static void main(String[] args) {
		int n= 7;
		int arr[] = {10,5,0,8,0,9,0};
		moveZero(arr, n);
		 System.out.println(Arrays.toString(arr));
		
	}

}
