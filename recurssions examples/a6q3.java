package recurssion;

public class a6q3 {

	public static int print(int i ,int j)
	{
		if(i==0)
			return 0;
		else if(j==0)
		{
			System.out.println();
			print(i-1,i-1);
			
		return 0;
		}
		if(j>0)
		{
		System.out.print("*\t");
		print(i,j-1);
		return 0;
		}
	return 0;	
	}
	public static void main(String[] args) {
int k=print(3,3);

	}

}
