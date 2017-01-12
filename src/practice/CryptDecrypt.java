package practice;

import java.util.Scanner;

public class CryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2=in.nextLine();
		String str=str1+" "+str2;
		String[] res=Process(str);
		System.out.println(res[0]);
		System.out.println(res[1]);
		in.close();

	}

	private static String[] Process(String str) {
		
		String[] temp=str.split(" ");
		String str1=temp[0];
		String str2=temp[1];
		String res1=jiami(str1);
		String res2=jimi(str2);
		temp[0]=res1;
		temp[1]=res2;
		return temp;
	}

	private static String jimi(String str2) {
		int len=str2.length();
		char[] ch2=new char[len];
		int[] num=new int[len];
		for(int i=0;i<len;i++){
			num[i]=(int)(str2.charAt(i));
		}
		
		for(int i=0;i<len;i++){
			if(num[i]==97){
				num[i]=90;
			}else if(num[i]==65){
				num[i]=122;
			}else if(num[i]==0){
				num[i]=57;
			}else {
				if(num[i]>97&&num[i]<=122){
					num[i]=num[i]-33;
				}else if(num[i]>65&&num[i]<=90) {
					num[i]=num[i]+31;
				}else if(num[i]>48&&num[i]<=57){
					num[i]=num[i]-1;
				}
			}
		}
		for(int i=0;i<len;i++){
			ch2[i]=(char)num[i];
		}
		return String.valueOf(ch2);
	}


	private static String jiami(String str1) {

		int len=str1.length();
		char[] ch1=new char[len];
		int[] num=new int[len];
		for(int i=0;i<len;i++){
			num[i]=(int)(str1.charAt(i));
		}
		
		for(int i=0;i<len;i++){
			if(num[i]==122){
				num[i]=65;
			}else if(num[i]==90){
				num[i]=97;
			}else if(num[i]==57){
				num[i]=48;
			}else {
				if(num[i]>=97&&num[i]<122){
					num[i]=num[i]-31;
				}else if(num[i]>=65&&num[i]<90) {
					num[i]=num[i]+33;
				}else if(num[i]>=48&&num[i]<57){
					num[i]=num[i]+1;
				}
			}
		}
		for(int i=0;i<len;i++){
			ch1[i]=(char)num[i];
		}
		return String.valueOf(ch1);
	}

}
