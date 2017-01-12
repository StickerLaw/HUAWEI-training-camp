package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CharacterNotRepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			int num=processing(str);
			System.out.println(num );
		}
		in.close();
	}

	private static int processing(String str) {
		Set<Character> chSet=new HashSet<>();
		for(int i=0;i<str.length();i++){
			chSet.add(str.charAt(i));
		}
		return chSet.size();
	}

}
