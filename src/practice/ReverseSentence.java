package practice;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			String strOut=reverse(str);
			System.out.println(strOut);
		}	
		in.close();
	}

	private static String reverse(String str) {

		String[] strs=str.split(" ");
		StringBuilder sb=new StringBuilder();	
		int len=strs.length;
		for(int i=0;i<len;i++){
			sb.append(strs[len-1-i]).append(" ");			
		}
		return sb.toString().trim();
	}

}
