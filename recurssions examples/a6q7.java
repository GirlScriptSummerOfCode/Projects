package recurssion;

public class a6q7 {

	public static void main(String[] args) {
		int[] arr = { 66, 55, 33, 11, 22, 44 };
System.out.println(search(arr,0,33));
	}

	private static boolean search(int[] arr, int vidx, int data) {
		
		if(vidx==arr.length)
			return false;
		boolean x=false;
		if(arr[vidx]==data)
			return true;
		else
			x=search(arr, vidx+1, data);
		return x;
	}

}
