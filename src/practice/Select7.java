package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Select7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int N=in.nextInt();
			int res=sevenSelect(N);
			System.out.println(res);
		}
		in.close();
	}

	private static int sevenSelect(int n) {
		Set<Integer> resultSet=new TreeSet<>();
		int time=n/7;
		// 倍数的
		for(int i=1;i<=time;i++){
			resultSet.add(i*7);
		}
		// 含7的
		int len=0;
		double temp=n;

		while(temp>=1){
			temp=temp/10;
			len++;
		}
		int[] tem=new int[len];         // 总的位数数组
		List<int[]> Numlist=new ArrayList<int[]>();
		for(int p=0;p<len;p++){
			produceResultSet(tem,len,0,p,Numlist);
		}
				
		for(int[] number:Numlist){
			int m=0;
			for(int i=0;i<len;i++){
				m=m+number[i]*(int)(Math.pow(10, len-i-1));
			}
			if(m<=n){
				resultSet.add(m);
			}
		}
		return resultSet.size();
	}

	private static void produceResultSet(int[] tem, int len, int n,int p,List<int[]> numlist) {
		int[] tempArray=tem;
		tempArray[p]=7;
		if(n==len-1&&n==p){
			numlist.add(tempArray.clone());	
			
		}else if(n==len-1&&n!=p){
			for(int i=0;i<10;i++){
				tempArray[n]=i;
				numlist.add(tempArray.clone());
			}		
		}else if(n!=len-1&&n==p){
			produceResultSet(tempArray,len,n+1,p,numlist);
		}else{
			for(int i=0;i<10;i++){
				tempArray[n]=i;
				produceResultSet(tempArray,len,n+1,p,numlist);
			}
		}
	}
}
