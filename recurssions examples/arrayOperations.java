package recurssion;

public class arrayOperations {

	public static void displayrev(int[] arr, int vidx) {
		if (vidx == arr.length)
			return;
		displayrev(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return 0;
		}
		int max = arr[vidx];

		int m = max(arr, vidx + 1);
		if (m < max)
			return max;
		else
			return m;

	}

	public static int findfirst(int[] arr, int vidx, int data) {
		if (vidx == arr.length)
			return -1;
		if (arr[vidx] == data)
			return vidx;
		int pos = findfirst(arr, vidx + 1, data);
		return pos;
	}

	public static int findlast(int[] arr, int vidx, int data) {
		if (vidx < 0)
			return -1;
		if (arr[vidx] == data)
			return vidx;
		int pos = findlast(arr, vidx - 1, data);
		return pos;
	}

	public static boolean find(int[] arr, int vidx, int data) {
		if (vidx == arr.length)
			return false;
		if (arr[vidx] == data)
			return true;
		boolean b = find(arr, vidx + 1, data);
		return b;
	}

	public static void main(String[] args) {
		int[] arr = { 55, 44, 11, 22, 33, 99, 44 };
		 System.out.println(max(arr, 0));
		 System.out.println(findfirst(arr,0,44));
		 System.out.println(findlast(arr,arr.length-1,44));
		System.out.println(find(arr, 0, 454));
	}

}
