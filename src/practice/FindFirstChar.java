package practice;

import java.util.HashSet;
import java.util.Scanner;

public class FindFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String demo=in.nextLine();
		char res=findChar(demo);
		System.out.print(res);
		in.close();
	}

	private static char findChar(String demo) {
		
		HashSet<Character> hset=new HashSet<>();
		int lenth=demo.length();
		char result=demo.charAt(lenth-1);
		int size=0;
		for(int i=lenth-1;i>=0;i--){
			hset.add(demo.charAt(i));
			if(hset.size()==(size+1)){
				result =demo.charAt(i);
			}else {
				size++;
			}
		}
		return result;
	}

}
