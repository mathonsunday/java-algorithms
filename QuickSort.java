public class QuickSort {
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
	while (left <= right) {
		// Find element on left that should be on right
		while (arr[left] < pivot) left++;

		// Find element on the right that should be on the left
		while (arr[right] > pivot) right--;

		// Swap elements, and move left anf right indices
		if (left <= right) {
			swap(arr, left, right); // swap elements
			left++;
			right--;
		}
	}
	return left;
	}
}