package practice;

import java.util.Scanner;

public class MarkNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String strIn=in.nextLine();
			String strOut=processing(strIn);
			System.out.println(strOut);
		}
		in.close();
	}

	private static String processing(String str) {
		char[] chs=str.toCharArray();
		int len=chs.length;
		StringBuilder sb=new StringBuilder();
		boolean flag=false;
		if(chs[0]>='0'&&chs[0]<='9'){     // 判断第一个字符是否是数字
			sb.append("*");
			flag=true;			
		}
		sb.append(chs[0]);            // 将第一个字符加到stringBuilder中
		for(int i=1;i<len;i++){
			if(flag&&(chs[i]<'0'||chs[i]>'9')){
				sb.append("*");
				flag=false;
			}else if((!flag)&&(chs[i]>='0'&&chs[i]<='9')){
				sb.append("*");
				flag=true;
			}
			sb.append(chs[i]);
		}
		if(chs[len-1]>='0'&&chs[len-1]<='9'){     // 判断最后一个字符是否是数字
			sb.append("*");
		}
		return sb.toString().trim();
	}
}
