package practice;

import java.util.Scanner;

public class PlaceApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int m=in.nextInt();
			int n=in.nextInt();
			int count=processing(m,n);
			System.out.println(count);
		}
		in.close();
	}

	private static int processing(int m, int n) {
		if(m<0||n<=0){
			return 0;
		}else if(m<=1||n==1){
			return 1;
		}else {
			return (processing(m, n-1)+processing(m-n, n));
		}
	}
}
