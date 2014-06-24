import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int[] array = {1, 5, 3, 6, 4};
		sort.mergesort(array, 0, 4);
		System.out.println(Arrays.toString(array));
	}
	
	void mergesort(int[] array, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergesort(array, low, middle); // Sort left half
			System.out.println(Arrays.toString(array));
			mergesort(array, middle + 1, high); // Sort right half
			merge(array, low, middle, high); // Merge them
		}¸
	}

	void merge(int[] array, int low, int middle, int high) {
		int[] helper = new int[array.length];
		// Copy both halves into a helper array
		for(int i = low; i <= high; i++) {
			helper[i] = array[i];
		}

		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;

		// Iterate throught helper array. Compare the left and right
		// half, copying back the smaller elements from the two halves
		// into the original array.
		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			}
			 else { // If the right element is smaller than the left element
			 	array[current] = helper[helperRight];
			 	helperRight++; 
			 }
			 current++;
			}

		// Copy the rest of the left side of the array into the target array
			int remaining = middle - helperLeft;
			for (int i = 0; i <= remaining; i++) {
				array[current + i] = helper[helperLeft + i];
			}
		}
	}