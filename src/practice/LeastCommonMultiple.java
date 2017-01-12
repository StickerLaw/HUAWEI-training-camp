package practice;

import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int num1=Integer.parseInt(in.nextLine());
			int num2=Integer.parseInt(in.nextLine());
			System.out.println(processing(num1,num2));
		}
		in.close();
	}

	private static int processing(int num1, int num2) {
		
		int start=(int)Math.max(num1, num2);
		int end=num1*num2;
		for(int i=start;i<=end;i++){
			if(i%num1==0 && i%num2==0){
				return i;
			}
		}
		return num1*num2;
	}

}
