package practice;

import java.util.Scanner;

public class MulityThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			String strOut=processing(n);
			System.out.println(strOut);
		}
		in.close();
	}

	private static String processing(int n) {
		
		String s1="ABCD";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++){
			sb.append(s1);
		}
		return sb.toString().trim();
	}

}
