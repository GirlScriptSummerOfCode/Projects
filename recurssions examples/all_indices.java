package recurssion;

public class all_indices {

	public static void main(String[] args) {
		int[] arr = { 66, 33, 55, 33, 11, 22, 44 };
		int[] ind = indices(arr,33, 0, 0);
		for(int val:ind)
			System.out.print(val+"\t");
	}

	private static int[] indices(int[] arr, int data,int vidx, int count) {
		if(vidx==arr.length)
		{
			int[] ind=new int[count];
			return ind;
		}
		
		if(arr[vidx]==data)
			++count;
		int[] ind=	indices(arr, data,vidx+1, count);
		if(arr[vidx]==data)
	ind[count-1]=vidx;
	
	return ind;
	}

}
