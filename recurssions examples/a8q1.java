package recurssion;

public class a8q1 {

	public static void main(String[] args) {
	System.out.println(permu("abc", "",0));
	}

	private static int permu(String que, String ans,int count) {
		if (que.length() == 0) {
			System.out.println(ans);
			++count;
			return count;
		}

			char ch = que.charAt(0);

//			count=permu(que.substring(1), ans,count);
			if(ans.length()<3){
			count=permu(que.substring(1), ans + ch,count);}
 return count;

	}

}
