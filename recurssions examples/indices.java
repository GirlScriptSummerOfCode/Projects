package recurssion;

public class indices {

	public static int[] indices(int[] arr, int vidx, int data, int count) {

		if (vidx == arr.length) {
			int[] index = new int[arr.length];
			return index;
		}
		if (arr[vidx] == data)
			++count;

		int[] index = indices(arr, vidx + 1, data, count);
		if (arr[vidx] == data) {
			index[count] = vidx;
			++count;
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 6, 2, 5, 2, 2, };
		int[] arr1 = new int[arr.length];
		arr1 = indices(arr, 0, 2, -1);
		if (arr[0] == 0)
			System.out.println(arr[0]);
		for (int val : arr1) {
			if (val != 0)
				System.out.println(val);
		}
	}

}
