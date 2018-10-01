package recurssion;

public class a7q4 {

	public static void main(String[] args) {
System.out.println(palindrome("abcddcba"));
	}

	private static boolean palindrome(String que) {

		if(que.length()<=1)
		{
			return true;
		}
		boolean ans=false;
		if(que.charAt(0)!=que.charAt(que.length()-1))
			{
			ans=false;
			return ans;
			}
		else
		{
			ans=palindrome(que.substring(1, que.length()-1));
		}
		return ans;
	}

}
