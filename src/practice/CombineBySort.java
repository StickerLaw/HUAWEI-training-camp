package practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 将两个整型数组按照升序合并，并且过滤掉重复数组元素[注: 题目更新了。输出之后有换行]
 */
public class CombineBySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=Integer.parseInt(in.nextLine());
			int[] array1=new int[n];
			String str1=in.nextLine();
			String [] str1s=str1.split(" ");
			for(int i=0;i<n;i++){
				array1[i]=Integer.parseInt(str1s[i]);
			}
			int m=Integer.parseInt(in.nextLine());
			int[]array2=new int[m];
			String str2=in.nextLine();
			String [] str2s=str2.split(" ");
			for(int j=0;j<m;j++){
				array2[j]=Integer.parseInt(str2s[j]);
			}
			String res=processing(array1,array2,n,m);
			System.out.println(res);
		}
		in.close();
	}

	private static String processing(int[] array1, int[] array2, int n, int m) {
		
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<n;i++){
			set.add(array1[i]);
		}
		for(int i=0;i<m;i++){
			set.add(array2[i]);
		}
		StringBuilder sb=new StringBuilder();
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()){
			sb.append(iterator.next());
		}
		
		return sb.toString().trim();
	}

}
