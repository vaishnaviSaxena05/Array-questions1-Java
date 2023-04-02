package arrayoperations;

public class ArrayDelete {
    static int delete(int size, int arr[] ,int element) {
    	int i;
    	for(i=0;i<size;i++) {
    		if (arr[i]== element)
    			break;
    	}
    		if(i==size)
    			return size;
    		for(int j=i;j<size-1;j++) {
    			arr[j]=arr[j+1];
    		}
    		return (size-1);
    
    }
    public static void main(String[] args) {
    	int arr[] = {3, 8, 12, 5, 6}, element = 12,size = 5;

        

        System.out.println("Before Deletion");

        for(int i=0; i < size; i++)
        {
        		System.out.print(arr[i]+" ");
        }

        System.out.println();
        

     size=    delete(size, arr, element);

        System.out.println("After Deletion");

        for(int i=0; i < size; i++)
        {
        		System.out.print(arr[i]+" ");
        }
	}
}
