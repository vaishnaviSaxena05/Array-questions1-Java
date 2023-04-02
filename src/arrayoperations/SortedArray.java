package arrayoperations;

public class SortedArray {
	public static boolean sortedArray(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;

			}

		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 34, 56, 87};

		System.out.println(sortedArray(arr));
	}
}
