package arrayoperations;

import java.util.Arrays;

public class ArrayInsert {
   // n = 4, x= 4,cap = 6, pos= 3
	   static int insert(int arr[], int n, int x, int cap, int pos) {
	      if(n == cap) {
	    	  return n;
	      }
	      int indx= pos-1;
	      for(int i=n-1;i>=indx;i--) {
	    	  arr[i+1]= arr[i];
	      }
	  	arr[indx] = x;

    	return n + 1;
	   }
   public static void main(String[] args) {
	int arr[]= new int [6]; int cap = 6, n = 4;
	arr[0]= 32; arr[1]=27; arr[2]= 56;arr[3]= 5;
	  System.out.println("Before Insertion");
	  for(int i=0; i < n; i++)
      {
      		System.out.print(arr[i]+" ");
      }
	  int x = 4, pos = 3;

	n=  insert(arr, n, x, cap, pos);
	System.out.println();
      System.out.println("After Insertion");

      for(int i=0; i < n; i++)
      {
      		System.out.print(arr[i]+" ");
      }
	 System.out.println();
	System.out.println(Arrays.toString(arr));
}
}
