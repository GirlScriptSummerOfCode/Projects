package recurssion;

public class boardpath {

	public static void path(int curr,int end ,String ans)
	{
		if(curr==end)
		{
			System.out.println(ans);
			return;
		}
		
		if(curr>end)
		{
			return;
		}
		
		for(int i=1;i<=6;++i)
		{
			
			path(curr+i, end, ans+i);
		}
	}
	
	
	public static void main(String[] args) {

		path(0, 10, "");
	}

}
