package practice;

import java.util.Scanner;

/*
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1 
 * 2^3=3+5 
 * 3^3=7+9+11 
 * 4^3=13+15+17+19 
 */
public class NicoChesterTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			String str=GetSequeOddNum(n);
			System.out.println(str);
		}
		in.close();
	}

	private static String GetSequeOddNum(int n) {
		int m=n/2;
		int mid=n*n;
		StringBuilder sb=new StringBuilder();
		if(n%2==1){
			for(int i=-m;i<m;i++){
				sb.append(mid+i*2);
				sb.append("+");
			}
			sb.append(mid+m*2);
		}else {
			
			for(int i=-m;i<0;i++){
				sb.append(mid+i*2+1);
				sb.append("+");
			}
			for(int i=1;i<m;i++){
				sb.append(mid+i*2-1);
				sb.append("+");
			}
			sb.append(mid+m*2-1);
		}
		return sb.toString().trim();
	}

}
