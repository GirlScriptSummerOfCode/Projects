package recurssion;

public class q1 {
public static void func(int n)
{
	if(n==0)
		return ;
	if(n%2!=0)
		System.out.println("hi "+n);
	func(n-1);
	if(n%2==0)
	System.out.println("bye "+n);
}
	public static void main(String[] args) {
func(7);
	}

}
