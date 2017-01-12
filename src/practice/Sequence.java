package practice;

import java.util.Scanner;

public class Sequence {

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
		int sum=n*2+3*n*(n-1)/2;
		System.out.println(sum);		
	}
}
