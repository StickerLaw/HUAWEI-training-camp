package practice;

import java.util.Arrays;
import java.util.Scanner;

public class KMinistNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String s1=in.nextLine();
			String s2=in.nextLine();
			String res=processing(s1,s2);
			System.out.println(res);
		}
		in.close();
	}

	private static String processing(String s1, String s2) {
		
		String[] s1s=s1.split(" ");
		String [] s2s=s2.split(" ");
		int n=Integer.parseInt(s1s[0]);
		int k=Integer.parseInt(s1s[1]);
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=Integer.parseInt(s2s[i]);
		}
		Arrays.sort(array);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<k;i++){
			sb.append(array[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
