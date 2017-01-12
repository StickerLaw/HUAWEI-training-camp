package practice;

import java.util.Scanner;

public class CalcAutomorphicNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=Integer.parseInt(in.nextLine());
			processing(n);
		}
		in.close();
	}

	private static void processing(int n) {
		int sum=0;
		for(int i=0;i<n;i++){
			String s1=String.valueOf(i);
			String s2=String.valueOf(i*i);
			int len1=s1.length();
			int len2=s2.length();
			String s3=s2.substring(len2-len1,len2);
			if(s1.equals(s3)){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
