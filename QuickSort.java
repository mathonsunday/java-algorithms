import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] array = {1, 5, 3, 6, 4, 12, 19, 30, 9, 14};
		sort.quickSort(array, 0, 9);
		System.out.println(Arrays.toString(array));
	}

	void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1) { // Sort left half
			quickSort(arr, left, index - 1);
		}
		if (index < right) { // Sort right half
			quickSort(arr, index, right);
		}
	}

	int partition(int arr[], int left, int right) {
		int pivot = arr[(left + right) / 2]; // Pick pivot point
		// System.out.println("Our pivot is " + pivot);
		while (left <= right) {
		// Find element on left that should be on right
		while (arr[left] < pivot) left++;

		// Find element on the right that should be on the left
		while (arr[right] > pivot) right--;

		// Swap elements, and move left and right indices
		if (left <= right) {
			// System.out.println("We're swapping " + arr[left] + " and " + arr[right]);
			swap(arr, left, right); // swap elements
			left++;
			right--;yyyyyyyyy
			System.out.println(Arrays.toString(arr));y
		}
	}
	return left;
	}

	void swap(int arr[], int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}