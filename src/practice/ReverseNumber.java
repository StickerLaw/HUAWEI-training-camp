package practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			String strOut=processing(str);
			System.out.println(strOut);
		}
		in.close();
	}

	private static String processing(String str) {

		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		
		return sb.toString().trim();
	}

}
