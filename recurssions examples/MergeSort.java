package recurssion;

public class MergeSort {

	public static void main(String[] args) {
		int[] one = { 11, 33, 55, 66 }, two = { 5, 7, 9, 14, 22 };
		int[] arr = merge(one, two);
		// for (int val : arr) {
		// System.out.print(val + " ");
		// }
		int[] three = { 2, 54, 6, 23, 7, 2, 67, 44, 77, 99, 0 };
		three = mergesort(three, 0, three.length - 1);
		for (int val : three) {
			System.out.print(val + " ");
		}
	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int[] arr = new int[one.length + two.length];
		while ((i < one.length) && (j < two.length)) {
			if (one[i] > two[j]) {
				arr[k] = two[j];
				++j;
				++k;
			} else {
				arr[k] = one[i];
				++i;
				++k;
			}
		}
		while (j < two.length) {

			arr[k] = two[j];
			++j;
			++k;
		}
		while (i < one.length) {

			arr[k] = one[i];
			++i;
			++k;
		}
		return arr;
	}

	public static int[] mergesort(int arr[], int lo, int hi) {
		if (hi == lo) {
			int[] b = new int[1];
			b[0] = arr[lo];
			return b;
		}
		int mid = (lo + hi) / 2;
		int[] fhalf = mergesort(arr, lo, mid);
		int[] shalf = mergesort(arr, mid + 1, hi);

		int arr1[] = merge(fhalf, shalf);
		return arr1;
	}
}
