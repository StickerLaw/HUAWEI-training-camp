package practice;


import java.util.Scanner;

public class NOfNegativeAverageOfPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=Integer.parseInt(in.nextLine());
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=in.nextInt();
			}
			processing(array,n);
		}
		in.close();
	}

	private static void processing(int[] array, int n) {

		int negative=0;
		int positive=0;
		int sum=0;
		for(int i=0;i<n;i++){
			if(array[i]<0){
				negative++;
			}else if(array[i]>0){
				positive++;
				sum+=array[i];
			}
		}
		
		System.out.println(negative);
		if(sum/(positive+0.0)%1>0){
			System.out.println(sum/(positive+0.0));
		}else {
			System.out.println(sum/(positive));
		}
		
	}

}
