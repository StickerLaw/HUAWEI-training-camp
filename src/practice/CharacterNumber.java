package practice;

import java.util.Scanner;

public class CharacterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine().toLowerCase();
			char a=(in.nextLine().toLowerCase()).charAt(0);
			System.out.println(caculator(str,a));
		}
		in.close();
	}

	private static int caculator(String str, char a) {
		
		int sum=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==a){
				sum++;
			}
		}
		return sum;
	}

}
