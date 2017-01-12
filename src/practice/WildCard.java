package practice;

import java.util.Scanner;

/*
 * 自己写的，比较麻烦，但结果是对的
 */
public class WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str1=in.nextLine();
			String str2=in.nextLine();
			boolean res=processing(str1,str2);
			System.out.println(res);
		}
		in.close();
	}

	private static boolean processing(String str1, String str2) {
		
		char[] chArray1=str1.toCharArray();
		char[] chArray2=str2.toCharArray();
		int len1=chArray1.length;
		int len2=chArray2.length;
		int i=0;
		int j=0;
		while(i<len1&&j<len2){
			if(chArray1[i]!=chArray2[j]&&chArray1[i]!='?'&&chArray1[i]!='*'){
				return false;
			}

			if(chArray1[i]==chArray2[j]||chArray1[i]=='?'){
				i++;
				j++;
			}else if(chArray1[i]=='*'){
				if(i==len1-1){
					return true;
				}
				i++;
				if(chArray1[i]=='*'||chArray1[i]=='?'){
					i++;
				}
				for(int m=j;m<len2;m++){
					if(chArray1[i]==chArray2[m]){
						if(processing(String.valueOf(chArray1, i, len1-i), String.valueOf(chArray2, m, len2-m))){
							return true;
						}
					}					
				}
			}else {
				return false;
			}
		}
		if(i==len1&&j==len2){
			return true;
		}else {
			return false;
		}
	}

}
