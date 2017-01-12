package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String strInteger=in.nextLine();
			int m=merging(strInteger);
			System.out.println(m);
		}
		in.close();
	}

	private static int merging(String  n) {

		char[] chs=n.toCharArray();
		int len=chs.length;
		List<Character> chList=new ArrayList<Character>();
		for(int i=len-1;i>=0;i--){
			if(!chList.contains(chs[i])){
				chList.add(chs[i]);
			}
		}
		StringBuilder sb=new StringBuilder();
		for(char ch:chList){
			sb.append(ch);
		}
		
		return Integer.parseInt(sb.toString().trim());
	}

}
