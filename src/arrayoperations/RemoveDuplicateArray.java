package arrayoperations;

public class RemoveDuplicateArray {
	public static int removeDuplicate(int arr[], int n) {
		int temp[] = new int[n];
		temp[0] = arr[0];
		int res = 1;
		for (int i = 0; i < n; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}

		}
		for(int i = 0; i < res; i++)
    	{
    		arr[i] = temp[i];
    	}
		return res;
	}

	public static void main(String[] args) {
		int n= 6;
             int arr[]= {23,20,20,3,3,12};
             System.out.println("Before Removal");
             for(int i = 0; i < n; i++)
             {
             		System.out.print(arr[i]+" ");
             }
             System.out.println();

             n = removeDuplicate(arr, n);

             System.out.println("After Removal");

             for(int i = 0; i < n; i++)
             {
             		System.out.print(arr[i]+" ");
             }
	}

}
