package practice;

import java.util.Scanner;

public class ApproximateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			double d=in.nextDouble();
			System.out.println(processing(d));
		}
		in.close();
	}

	private static long processing(double d) {
		
		long l=(long)d;
		double temp=d-l;
		if(temp>=0.5){
			return l+1;
		}else {
			return l;
		}
	}

}
