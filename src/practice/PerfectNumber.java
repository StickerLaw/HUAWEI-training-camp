package practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int pNumber=processing(n);
			System.out.println(pNumber);
			
		}
		in.close();
	}

	private static int processing(int n) {
		
		if(n<1){
			return -1;
		}
		int count=0;
		for(int i=1;i<=n;i++){
			int sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				count++;
			}
		}
		return count;
	}

}
