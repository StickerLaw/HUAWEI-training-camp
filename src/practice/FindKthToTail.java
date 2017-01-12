package practice;

import java.util.Scanner;

public class FindKthToTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=Integer.parseInt(in.nextLine());
			String inStr=in.nextLine();
			int k=Integer.parseInt(in.nextLine());
			String  kthNumber=processing(n,inStr,k);
			System.out.println(kthNumber);
		}
		in.close();

	}
	private static String processing(int n, String inStr, int k) {
		int[] array=new int[n];
		String[] nums=inStr.split(" ");
		if(nums.length<n){
			return null;
		}
		for(int i=0;i<n;i++){
			array[i]=Integer.parseInt(nums[i]);
		}
		if(n<k){
			return null;
		}
		return ""+array[n-k];
	}
}
