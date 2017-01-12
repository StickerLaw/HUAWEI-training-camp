package practice;

import java.util.Scanner;

public class Continumax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.nextLine();
			processing(str);
		}
		in.close();
	}

	private static void processing(String str) {
		
		String[] strs=str.split("[^0-9]+");
		if(str.length()>0&&strs.length>0){
			int max=0;
			String res="";
			for(int i=0;i<strs.length;i++){
				if(max<strs[i].length()){
					res=strs[i];
					max=strs[i].length();
				}
			}
			System.out.println(res+","+max);
		}else {
			System.out.println(0);
		}
	}

}
