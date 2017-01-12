package practice;

import java.util.Scanner;

public class ConvertRealFractToEgpytFract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			String res=processing(str);
			System.out.println(res);
		}
		in.close();
	}

	private static String processing(String str) {
		
		String[] strs=str.split("/");
		int a=Integer.parseInt(strs[0]);        //分子
		int b=Integer.parseInt(strs[1]);        //分母
		StringBuilder sb=new StringBuilder();
		int c;
		while(a!=1){
			if(b%(a-1)==0){				
				sb.append("1/"+b/(a-1)+"+");
				a=1;
			}else {
				c=b/a+1;
				a=c*a-b;
				b=c*b;
				sb.append("1/").append(c).append('+');
				if(b%a==0){					
					b=b/a;
					a=1;
				}
			}
		}
		sb.append("1/"+b);
		return sb.toString().trim();
	}

}
