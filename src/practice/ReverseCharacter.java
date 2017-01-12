package practice;

import java.util.Scanner;

public class ReverseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			String out=processing(str);
			System.out.println(out);
		}
		in.close();
	}

	private static String processing(String str) {
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString().trim();
	}

}
