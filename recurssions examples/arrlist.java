package recurssion;

import java.util.ArrayList;

public class arrlist {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1, 2, 2, 3, 5 }, arr2 = { 1, 1, 2, 2, 4, 5 };
 ArrayList<Integer> arr3=getIntersection(arr1,arr2);
 System.out.println(arr3);
	}

	public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> rv = new ArrayList<>();
		int i=0,j=0;
		while((i!=arr1.length)&&(j!=arr2.length))
		{
			if(arr1[i]==arr2[j])
			{
				rv.add(arr1[i]);
				++i;
				++j;
			}
			else if(arr1[i]>arr2[j]){
				++j;
			}
			else {
				++i;
			}
		}
		return rv;
	}
}
