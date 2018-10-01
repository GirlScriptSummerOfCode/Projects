package recurssion;

public class a6q14 {
	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void sort(int[] arr, int vidx, int index) {
		if (vidx == 1)
			return;

		if (index < vidx - 1) {
			sort(arr, vidx, index + 1);
			if (arr[index] > arr[index + 1])
				swap(arr, index, index + 1);
		}
		if (index == vidx - 1)
			sort(arr, vidx - 1, 0);
	}

	public static void main(String[] args) {
		int[] arr = { 66, 55, 33, 11, 22, 44 };
		sort(arr, arr.length, 0);

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
