package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str1=in.nextLine();
			String str2=in.nextLine();
			String res=BigIntegerAdd(str1,str2);
			System.out.println(res);
		}
		in.close();
	}

	private static String BigIntegerAdd(String str1, String str2) {
		BigInteger num1=new BigInteger(str1);
		BigInteger num2=new BigInteger(str2);
		BigInteger sum=num1.add(num2);
		
		return sum.toString();
	}

}
