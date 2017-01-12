package practice;

import java.util.Scanner;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str1=in.nextLine();
			String str2=in.nextLine();
			boolean b=boollsAllCharExist(str1,str2);
			System.out.println(b);
		}
		in.close();
	}

	private static boolean boollsAllCharExist(String str1, String str2) {
		
		int len=str1.length();
		for(int i=0;i<len;i++){
			if(!str2.contains(String.valueOf(str1.charAt(i)))){
				return false;
			}
		}
		return true;
	}

}
