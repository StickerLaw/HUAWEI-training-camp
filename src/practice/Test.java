package practice;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<int[]> list=new ArrayList<int[]>();
//		int[] a=new int[1];
//		for(int i=0;i<10;i++){
//			a[0]=i;
//			list.add(a.clone());
//		}
//		
//		for(int[] tem:list){
//			System.out.println(tem[0]);
//		}
		/*
		char ch1,ch2,ch3,ch4,ch5,ch6;
		ch1='a';
		ch2='z';
		ch3='A';
		ch4='Z';
		ch5='0';
		ch6='9';
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		System.out.println((int)ch5);
		System.out.println((int)ch6);
		System.out.println((int)'1');
		
		
		char ch='A';
		System.out.println((int)ch );
		
		char cha=(char)97+1;
		System.out.println(cha);
		*/
		System.out.println((int)' ');
		
		String str="255.255.255.0";
		
		String [] strs=str.split("\\.");
		for(int i=0;i<4;i++){
			System.out.println(strs[i]);
		}
	}

}
