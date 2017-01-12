package practice;

import java.util.Scanner;

public class NumberOfCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			int num=caclCapital(str);
			System.out.println(num);
		}
		in.close();
	}

	private static int caclCapital(String str) {
		
		if(str.isEmpty()){
			return 0;
		}
		char[] chs=str.toCharArray();
		int sum=0;
		for(int i=0;i<chs.length;i++){
			if(chs[i]>=65&&chs[i]<=90){
				sum++;
			}
		}
		return sum;
	}

}
