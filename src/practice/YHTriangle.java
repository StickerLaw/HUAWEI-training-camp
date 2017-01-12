package practice;

import java.util.Scanner;

public class YHTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
		    int res=processing(n);
		    System.out.println(res);
		}
		in.close();
	}

	private static int processing(int n) {
		
		if(n<=2){
			return -1;
		}else {
			if(n%2==1){
				return 2;
			}else if(n%4==0){
				return 3;
			}else {
				return 4;
			}
		}
	}

}
