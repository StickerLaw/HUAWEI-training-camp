package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TableMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int[][] arrays=new int[n][2];
			for(int i=0;i<n;i++){
				arrays[i][0]=in.nextInt();
				arrays[i][1]=in.nextInt();
			}
			int[][] outArray=merging(arrays,n);
			for(int i=0;i<outArray.length;i++){
				System.out.println(outArray[i][0]);
				System.out.println(outArray[i][1]);
			}
		}
		in.close();
	}

	private static int[][] merging(int[][] arrays,int n) {
	
		Map<Integer, Integer> tableMap=new HashMap<>();
		for(int i=0;i<n;i++){
			if(tableMap.containsKey(arrays[i][0])){
				tableMap.put(arrays[i][0], tableMap.get(arrays[i][0])+arrays[i][1]);
			}else {
				tableMap.put(arrays[i][0], arrays[i][1]);
			}
		}
		int[][] result=new int[tableMap.size()][2];
		int j=0;
		for(int k:tableMap.keySet()){
			result[j][0]=k;
			result[j][1]=tableMap.get(k);
			j++;
		}
		return result;
	}

}
