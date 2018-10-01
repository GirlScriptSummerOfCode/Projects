package recurssion;

public class subsetadv {

public static void printss(String qst,String ans){
	if(qst.length()==0){
		System.out.println(ans);
		return;
	}
char ch=qst.charAt(0);
String roq=qst.substring(1);
printss(roq,ans+"");
printss(roq,ans+ch);
}
	public static void main(String[] args) {
printss("abc","");
	}

}
