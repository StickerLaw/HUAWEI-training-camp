package checkpoint;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String res=reverseInt(n);
		System.out.println(res);
		in.close();

	}

	private static String reverseInt(int n) {
		String str=String.valueOf(n);
		int len=str.length();
		String result="";
		for(int i=len-1;i>=0;i--){
			result+=str.charAt(i);
		}
		return result;
	}

}
