package practice;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String strIn=in.nextLine();
			char  ch=processing(strIn);
			System.out.println(ch);			
		}
		in.close();
	}

	private static char  processing(String strIn) {
		char[] ch1=strIn.toCharArray();
		for(int i=0;i<ch1.length;i++){
			if(strIn.indexOf(ch1[i])==strIn.lastIndexOf(ch1[i])){
				return ch1[i];
			}
		}
		return '.';
	}
	
}
