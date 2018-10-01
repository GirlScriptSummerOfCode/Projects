package recurssion;

import java.util.ArrayList;

public class permu1 {

	public static void main(String[] args) {
String s="abc";
ArrayList<String> s1=permu(s);
System.out.println(s1);
	}

	
	public static ArrayList<String> permu(String s)
	{

		if(s.length()==1)
		{
			 ArrayList<String> blank=new ArrayList<>();
			 blank.add(s);
			 return blank;
		}
		char ch=s.charAt(0);
		String smaller=s.substring(1);
		ArrayList<String> rr=permu(smaller);
		ArrayList<String> mr=new ArrayList<>();
		for(String rs:rr){
		  for(int i=0;i<=rs.length();++i)
		  {
			  String ms=rs.substring(0, i)+ch+rs.substring(i);
			  mr.add(ms);
		  }
		}
		return mr;
	}
}
