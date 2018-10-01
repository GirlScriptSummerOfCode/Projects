package recurssion;

public class a7q13 {

	public static void inverse(int[] arr,int vidx)
	{
		if(vidx==arr.length)
			return;
		
		int val=arr[vidx];
		inverse(arr, vidx+1);
		arr[val]=vidx;
	}
	public static void main(String[] args) {
		
		int[] arr={1,4,0,2,3};
		inverse(arr, 0);
		
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
	}

}
