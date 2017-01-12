package practice;

import java.util.Scanner;

public class RadixExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str16Radix=in.nextLine();
			String str10Radix=processing(str16Radix);
			System.out.println(str10Radix);
		}
		in.close();
	}

	private static String processing(String str16Radix) {
		
		char[] charArray=str16Radix.toCharArray();
		int len=charArray.length;
		int sum=0;
		int index=0;
		int temp=0;
		for(int i=1;i<len-1;i++){
			index=len-i;
			switch (charArray[index]) {
			case 'F':
				temp=15*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			case 'E':
				temp=14*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			case 'D':
				temp=13*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			case 'C':
				temp=12*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			case 'B':
				temp=11*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			case 'A':
				temp=10*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			default:
				temp=(charArray[index]-'0')*(int)Math.pow(16, i-1);
				sum+=temp;
				break;
			}
		}
		return String.valueOf(sum);
	}

}
