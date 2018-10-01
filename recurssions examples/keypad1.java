package recurssion;

public class keypad1 {
	public static String getcode(char key) {
		if (key == '1') {
			return "abc";
		}
		if (key == '2') {
			return "def";
		}
		if (key == '3') {
			return "ghi";
		}
		if (key == '4') {
			return "jkl";
		}
		if (key == '5') {
			return "mno";
		}
		if (key == '6') {
			return "pqrs";
		}
		if (key == '7') {
			return "tuv";
		}
		if (key == '8') {
			return "wx";
		}
		if (key == '9') {
			return "yx";
		}
		if (key == '0') {
			return ".,";
		}
		return "null";

	}


	public static void pkp(String que,String ans)
	{
		if(que.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char num=que.charAt(0);
		String code=getcode(num);
		String roq=que.substring(1);
		for(int i=0;i<code.length();++i)
		{
			pkp(roq,ans+code.charAt(i));
		}
	}
	public static void main(String[] args) {
		
		pkp("12","");

	}

}
