package practice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=in.nextInt();
			}
			int[] outArray=processing(array,n);
			for(int i=0;i<outArray.length;i++){
				System.out.println(outArray[i]);
			}
		}
		in.close();
	}

	private static int[] processing(int[] array, int n) {
		
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<n;i++){
			set.add(array[i]);
		}
		int size=set.size();
		int[] a=new int[size];
		int index=0;
		for(int m:set){
			a[index]=m;
			index++;
		}
		return a;
	}

}
