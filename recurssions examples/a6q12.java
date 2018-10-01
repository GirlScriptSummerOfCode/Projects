package recurssion;

public class a6q12 {
	public static void swap(int[] arr,int i,int j)
	{
		
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		
	}
	public static void rev(int[] arr, int vidx) {
		if (vidx == arr.length / 2)
			return;
		swap(arr,vidx,(arr.length - 1 - vidx));
		rev(arr, vidx + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5,6 };
		rev(arr, 0);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
	}

}
