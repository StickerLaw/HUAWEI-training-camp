package practice;

import java.util.Scanner;

public class HandredMoneyAndEggs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()){
//			int a=in.nextInt();
			processing();
		}
		in.close();
	}

	private static void processing() {		
		int sum=0;
		for(int i=0;i<100;i+=3){
			for(int j=0;j<100-i;j++){
				sum=i/3+5*j+3*(100-i-j);
				if(sum==100){
					System.out.println(j+" "+(100-i-j)+" "+i);
				}
			}
		}
		
	}

}
