package recurssion;

public class powersum {
	public static int calc(int que, int pow, int count,String ans,int i) {
		if (que  == 0) {
			++count;
//			System.out.println(ans);
			return count;
		}
if(Math.pow(i, pow)>que){
	return count;
}
		for (int j = i; (int) Math.pow(j, pow) <= que; ++j) {
			ans+=i+" ";
			count = calc(que-(int) Math.pow(j, pow), pow, count,ans,i+1);
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(calc(100, 2, 0,"",1));

	}

}
