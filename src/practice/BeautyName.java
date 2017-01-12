package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String strName=in.nextLine();
		String[] result=CaculateBeauty(strName);
		in.close();
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	private static String[] CaculateBeauty(String strName) {
		// TODO Auto-generated method stub
		String [] strs=strName.split(" ");
		int n=Integer.parseInt(strs[0]);
		String[] res=new String[n];
		for(int i=1;i<=n;i++){
			String bea=beauty(strs[i]);
			res[i-1]=bea;
		}
		return res;
	}

	private static String beauty(String string) {
		// TODO Auto-generated method stub
		List<Character> chList=new ArrayList<Character>();
		int len=string.length();
		for(int i=0;i<len;i++){
			if(!chList.contains(string.charAt(i))){
				chList.add(string.charAt(i));
			}
		}
		int l=chList.size();
		int[] chNum=new int[l];
		for(int i=0;i<l;i++){
			for(int j=0;j<len;j++){
				if(chList.get(i)==string.charAt(j)){
					chNum[i]++;
				}
			}
		}
		
		for(int i=l-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(chNum[j]<chNum[j+1]){
					int temp=chNum[j];
					chNum[j]=chNum[j+1];
					chNum[j+1]=temp;
					
//					char tem=chList.get(j);
//					chList.set(j, chList.get(j+1));
//					chList.set(j+1, tem);
				}
			}
		}
		
		int res=0;
		int start=26;
		for(int i=0;i<l;i++){
			res=res+start*chNum[i];
			start--;
		}
		return String.valueOf(res);
	}

}
