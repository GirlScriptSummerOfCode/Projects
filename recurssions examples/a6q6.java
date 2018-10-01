package recurssion;

public class a6q6 {
	public static boolean check(int[] arr, int vidx) {
		if (vidx == arr.length - 1)
			return true;
		if (arr[vidx] > arr[vidx + 1])
			return false;
		else
		return(check(arr, vidx + 1));
		

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 }, arr2 = { 1, 4, 5, 2, 0 };
		System.out.println(check(arr2,0));
	}

}
