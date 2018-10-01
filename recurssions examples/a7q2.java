package recurssion;

public class a7q2 {

public static int[] chartoint(String s){
	int[] a =new int[s.length()];
for(int i=0;i<s.length();++i)
	a[i]=s.charAt(i)-48;
	return a;
}
	public static void main(String[] args) {
	int[] arr=chartoint("0123456789");
	for(int val:arr)
		System.out.print(val);
	}

}
