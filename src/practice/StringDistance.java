package practice;

import java.util.Scanner;

/*
 * 编辑代价，注意与最长公共子序列的区别
 */
public class StringDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str1=in.nextLine();
			String str2=in.nextLine();
			String  res=caculateStringDistance(str1,str2);
			System.out.println(res);
		}
		in.close();
	}

	private static String  caculateStringDistance(String str1, String str2) {
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		int len1=ch1.length;
		int len2=ch2.length;
		int[][] dp=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++){
			dp[i][0]=i;
		}
		
		for(int i=0;i<=len2;i++){
			dp[0][i]=i;
		}
		
		int temp=0;
		for(int i=1;i<=len1;i++){
			for(int j=1;j<=len2;j++){
				if(ch1[i-1]==ch2[j-1]){
					temp=0;
				}else {
					temp=1;
				}
				dp[i][j]=min(dp[i-1][j-1]+temp,dp[i][j-1]+1,dp[i-1][j]+1);
			}
		}

		return 1+"/"+(dp[len1][len2]+1);
	}

	private static int min(int i, int j, int k) {
		int a=i<j?i:j;
		
		return a<k?a:k;
	}

}
