public class BinarySearch {
	int binarySearch(int[] a, int x) {
	int low = 0;
	int high = a.length - 1;
	int mid;

	while (low <= high) {
		mid = (low + high) / 2;
		if(a[mid]  < x) {
			low = mid + 1;
		} else if (a[mid] > x) {
			high = mid - 1;
		} else {
			return mid;
		}
	}
	return -1; // Error
}

int binarySearchRecursive(int[] a, int x, int low, int high) {
	if (low > high) return -1; // Error

	int mid = (low + high) / 2;
	if (a[mid] < x) {
		return binarySearchRecursive(a, x, mid + 1, high);
	} else if (a[mid] > x) {
		return binarySearchRecursive(a, x, low, mid - 1);
	} else {
		return mid;
	}
}

public static void main(String[] args) {
	BinarySearch search = new BinarySearch();  
	int[] array = {1, 6, 5, 3};
	System.out.println(search.binarySearch(array, 6) == 1);
}
}