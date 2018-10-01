package recurssion;

public class subsetasciadv {

public static void printss(String qst,String ans){
	if(qst.length()==0){
		System.out.println(ans);
		return;
	}
char ch=qst.charAt(0);
String roq=qst.substring(1);
printss(roq,ans+"");
printss(roq,ans+ch);
printss(roq,(ans+(int)(ch)));
}
	public static void main(String[] args) {
printss("abc","");
	}

}
