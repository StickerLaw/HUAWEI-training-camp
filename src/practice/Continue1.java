package practice;

import java.util.Scanner;

public class Continue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int b=Integer.parseInt(in.nextLine());
			int res=processing(b);
			System.out.println(res);
		}
		in.close();
	}

	private static int processing(int b) {
		
		StringBuilder sb=new StringBuilder();
		int  a=128;
		while(a>0&&b>0){
			sb.append(b/a);
			b=b-a*(b/a);
			a=a/2;
		}
		String str1=sb.toString().trim();
		String [] strs=str1.split("0");
		int len=strs.length;
		int sum=0;
		for(int i=0;i<len;i++){
			if(sum<strs[i].length()){
				sum=strs[i].length();
			}
		}
		return sum;
	}

}
