package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * 编写一个函数，传入一个int型数组，返回该数组能否分成两组，使得两组中各元素加起来的和相等，并且，所有5的倍数必须在其中一个组中，
 * 所有3的倍数在另一个组中（不包括5的倍数），能满足以上条件，返回true；不满足时返回false。 
 * 
 * 首先想到的是递归的算法，但是递归占用的空间复杂度非常大，如果程序对空间有要求，适合使用非递归的方法
 */
public class DevideArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=Integer.parseInt(in.nextLine());
			String strIn=in.nextLine();
			String [] strs=strIn.split(" ");
			int [] array=new int[strs.length];
			for(int i=0;i<strs.length;i++){
				array[i]=Integer.parseInt(strs[i]);
			}
			boolean b=canDevided(array,n);
			System.out.println(b);
		}
		in.close();
	}

	private static boolean canDevided(int[] array, int n) {
		int sum3=0;
		int sum5=0;
		List<Integer> list=new ArrayList<Integer>();
		
		int len1=0;
		for(int i=0;i<n;i++){
			if(array[i]%5==0){
				sum5+=array[i];
				len1++;
			}else if(array[i]%3==0){
				sum3+=array[i];
			}else {
				list.add(array[i]);
			}
		}
		
		if (array.length==0||array.length==len1||len1==0) {
			return false;
		}
		
		Integer[] a = new Integer[list.size()];
		list.toArray(a);
		int m=a.length;
//		boolean b=isDevided(sum3,sum5,a,0,m);            // 递归的方法
		boolean b=isDevided1(sum3,sum5,a,m);           // 非递归的方法
		return b;
	}

	private static boolean isDevided1(int sum3, int sum5, Integer[] a, int m) {
		int max=1<<m;
		for(int i=0;i<max;i++){
			int temp3=sum3;
			int temp5=sum5;
			for(int j=0;j<m;j++){
				if((i&(1<<j))!=0){
					temp3+=a[j];
				}else {
					temp5+=a[j];
				}
			}
			if(temp3==temp5){
				return true;
			}
		}
		return false;
	}

//	private static boolean isDevided(int sum3, int sum5, Integer[] a, int i, int m) {
//		if(i==m){
//			return sum3==sum5;
//		}else {
//			return(isDevided(sum3+a[i], sum5, a, i+1, m)||isDevided(sum3, sum5+a[i], a, i+1, m));
//		}
//	}

}
