package recurssion;

public class a7q12 {

	public static void combi(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		String ch="";
		for(int i=1;i<3;++i){
			String s=que.substring(0,i);
				for(int j=0;j<i;++j){
					ch+=(char)(s.charAt(j)+96);
				}
				combi(que.substring(i),ans+ch);
		}
	}

	public static void main(String[] args) {
combi("1234","");
	}

}
