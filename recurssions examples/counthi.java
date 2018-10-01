package recurssion;

import java.util.Scanner;

public class counthi {
	public static void find(String que,String s,int count )
	{
		if(que.length()==1)
		{
			System.out.println(count);
			return;
		}
		if(s.equals(que.substring(0,2)))
		{
			++count;
		}
		String roq=que.substring(1);
		find(roq,s,count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		find(s, "hi", 0);
	}

}
