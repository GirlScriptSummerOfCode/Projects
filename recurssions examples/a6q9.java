package recurssion;

public class a6q9 {

	public static void main(String[] args) {
		int[] arr = { 66, 55, 33, 11, 22, 44,33 };
System.out.println(search(arr,0,33));
	}

	private static int search(int[] arr, int vidx, int data) {
		
		if(vidx==arr.length)
			return -1;
		int index=-1;
	
			index=search(arr, vidx+1, data);
			if(index==-1){
			{	if(arr[vidx]==data)
						index= vidx;
			}}

	return index;
	}

}
