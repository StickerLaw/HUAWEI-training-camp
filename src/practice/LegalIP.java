package practice;

import java.util.Scanner;

public class LegalIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String ipstring=in.nextLine();
			String res=judgeIP(ipstring);
			System.out.println(res);
		}
		in.close();
	}
	private static String judgeIP(String ipstring) {
		String[] strs=ipstring.split("\\.");
		int len=strs.length;
		if(len!=4){
			return "NO";
		}
		
		for(int i=0;i<len;i++){
			try{
				int a=Integer.parseInt(strs[i]);
				if(a<=0||a>255){
					return "NO";
				}
			}catch (Exception e) {
				return "NO";
			}
		}
		return "YES";
	}

}

	