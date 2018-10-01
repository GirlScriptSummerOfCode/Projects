package recurssion;

public class a6q11 {
	public static boolean palindrome(int[] arr,int vidx)
	{
		if(vidx==arr.length/2)
			return true;
		boolean bool=false;
		if(arr[vidx]==arr[arr.length-1-vidx])
		{
		bool=palindrome(arr,vidx+1);
		}
		
			return bool;
	}

	public static void main(String[] args) {
int[] arr={1,2,3,2,1,9};
	System.out.println(palindrome(arr,0));
	}

}
