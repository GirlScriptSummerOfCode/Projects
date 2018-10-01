package recurssion;

public class power {

	public static int power(int x,int y)
	{
		if(y==0)
			return 1;
		else
		 return power(x,y-1)*x;
	}
	public static void main(String[] args) {
		System.out.println(power(2,3));

	}

}
