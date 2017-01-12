package practice;

import java.util.Scanner;


/**
 * 动态规划求连个字符串的最长公共字串 和最长公共子序列
 * @author Administrator
 *
 */
public class CommonStrLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str1=in.next().toLowerCase();
			String str2=in.next().toLowerCase();
			int num=getLCommonStrLenght(str1,str2);
			int num2=getLCommonSubsequence(str1,str2);
			System.out.println(num);
			System.out.println(num2);
		}
		in.close();
	}

	/*
	 * 最长公共子序列
	 */
	private static int getLCommonSubsequence(String str1, String str2) {
		int len1=str1.length();
		int len2=str2.length();
		int[][] dp=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++){
			for(int j=0;j<=len2;j++){
				dp[i][j]=0;
			}
		}
		
		for(int i=1;i<len1+1;i++){
			for(int j=1;j<len2+1;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);                    // 区别在这里
				}
			}
		}
		
		return dp[len1][len2];
	}
	/*
	 * 最长公共字串
	 */
	private static int getLCommonStrLenght(String str1,String str2) {

		int len1=str1.length();
		int len2=str2.length();
		int[][] dp=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++){
			for(int j=0;j<=len2;j++){
				dp[i][j]=0;
			}
		}
		
		for(int i=1;i<len1+1;i++){
			for(int j=1;j<len2+1;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=0;                    // 区别在这里
				}
			}
		}
		
		int max=0;
		for(int i=0;i<len1+1;i++){
			for(int j=0;j<len2+1;j++){
				if(max<dp[i][j]){
					max=dp[i][j];
				}
			}
		}
		return max;
	}
}
