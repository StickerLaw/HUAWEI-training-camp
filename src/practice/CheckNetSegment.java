package practice;

import java.util.Scanner;

public class CheckNetSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String masks=in.nextLine();
		String ip1=in.nextLine();
		String ip2=in.nextLine();
		int out=processing(masks,ip1,ip2);
		System.out.println(out);
		in.close();
		

	}

	private static int processing(String masks, String ip1, String ip2) {
		
		int[] intmask1=stringToInt(masks);
		int[] intIp1=stringToInt(ip1);
		int[] intIp2=stringToInt(ip2);

		int maskLen=intmask1.length;
		int[] intmask=new int[4];
		for(int i=0;i<maskLen;i++){
			intmask[i]=intmask1[i];
		}
		for(int i=maskLen;i<4;i++){
			intmask[i]=0;
		}
		if(intmask.length!=4||intIp1.length!=4||intIp2.length!=4){
			return 1;
		}else {
			String and1=andbypoint(intmask,intIp1);
			String and2=andbypoint(intmask,intIp2);
			if("no".equals(and1)||"no".equals(and2)){
				return 1;
			}
			if(and1.equals(and2)){
				return 0;
			}
			else {
				return 2;
			}
		}
	}

	private static String andbypoint(int[] intmask, int[] intIp) {

		StringBuilder sb=new StringBuilder();
		for(int i=0;i<4;i++){
			if(intmask[i]<0||intmask[i]>255||intIp[i]<0||intIp[i]>255)
			{
				return "no";
			}
			sb.append(intmask[i]&intIp[i]);
			sb.append(".");
		}
		return sb.toString();
	}

	private static int[] stringToInt(String str) {
		String[] strs=str.split("\\.");
		int len=strs.length;		
		int[] strInt=new int[len];
		for(int i=0;i<len;i++){
			strInt[i]=Integer.parseInt(strs[i]);
		}
		
		return strInt;
	}

}
