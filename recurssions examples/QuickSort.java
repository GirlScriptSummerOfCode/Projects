package recurssion;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 5, 11, 33, 66, 22 };
		qsort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void qsort(int[] arr, int low, int hi) {
		if (low >= hi)
			return;

		int left = low, right = hi;
		int mid = (low + hi) / 2;
		int pivit = arr[mid];
		while (left <= right) {
			while (arr[left] < pivit) {
				++left;
			}
			while (arr[right] > pivit) {
				--right;
			}

			if (left <= right) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				right--;
				left++;
			}
		}

		qsort(arr, low, right);
		qsort(arr, left, hi);

	}
}
