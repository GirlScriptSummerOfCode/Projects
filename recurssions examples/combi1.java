package recurssion;

import java.util.ArrayList;

public class combi1 {

	public static void main(String[] args) {
String s="abc";
ArrayList<String> s1=permu(s);
System.out.println(s1);
	}

	
	public static ArrayList<String> permu(String s)
	{
//		String ch1="\n";
		if(s.length()==0)
		{
			 ArrayList<String> blank=new ArrayList<>();
			 blank.add(s);
			 return blank;
		}
		char ch=s.charAt(0);
		String smaller=s.substring(1);
		ArrayList<String> rr=permu(smaller);								//rec result
		ArrayList<String> mr=new ArrayList<>();
		for(String rs:rr){
			mr.add(rs);
//			mr.add(ch1);
			mr.add(ch+rs);
//			mr.add(ch1);
			mr.add(((int)(ch)+rs));
//			mr.add(ch1);
		}
		return mr;
	}
}
