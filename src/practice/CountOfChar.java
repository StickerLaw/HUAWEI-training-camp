package practice;

import java.util.Scanner;

public class CountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String strIn=in.nextLine();
			int[] intOut=processing(strIn);
			for(int i=0;i<intOut.length;i++){
				System.out.println(intOut[i]);
			}
			
		}
		in.close();

	}

	private static int[] processing(String strIn) {
		int[] res=new int[4];
		for(int i=0;i<strIn.length();i++){
			char ch=strIn.charAt(i);
			if((int)ch==32 ){
				res[1]++;
			}else if((int)ch>=48&&(int)ch<=57) {
				res[2]++;
			}else if(((int)ch>=97&&(int)ch<=122)||((int)ch>=65&&(int)ch<=90)){
				res[0]++;
			}else {
				res[3]++;
			}
		}
		return res;
	}

}
