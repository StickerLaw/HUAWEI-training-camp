package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Voidencrypt {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String strIn=in.nextLine();
		strIn=strIn+" "+in.nextLine();
		String strOut=processing(strIn );
		System.out.println(strOut);
		in.close();

	}

	private static String processing(String strIn) {
		Map<Character, Character> codeMap1=new HashMap<Character, Character>();
		Map<Character, Character> codeMap2=new HashMap<Character, Character>();
		String [] strs=strIn.split(" ");
		String key=strs[0];
		String text=strs[1];
		codeMap1=buildMap1(key,1);             // 大写
		codeMap2=buildMap1(key,0);             // 小写
		
		String result=dencrypt(codeMap1,codeMap2,text);
		return result;
	}

	private static String dencrypt(Map<Character, Character> cMap1, Map<Character, Character> cMap2,
			String text) {

		Set<Character> keySet1=cMap1.keySet();    // 大写
//		Set<Character> keySet2=cMap2.keySet();    // 小写
		int len=text.length();
		StringBuilder sb=new StringBuilder();
		String resString="";
		char ch;
		for(int i=0;i<len;i++){
			ch=text.charAt(i);
			if(keySet1.contains(ch)){
				sb.append(cMap1.get(ch));
			}else {
				sb.append(cMap2.get(ch));
			}
		}
		resString=sb.toString();
		return resString;
	}

	private static Map<Character, Character> buildMap1(String key,int flag) {
		Map<Character, Character> Map1=new HashMap<Character, Character>();
		List<Character> chList=new ArrayList<Character>();
		int len=key.length();
		int start=0;
		String upLowKey="";
		
		if(flag==1){
			upLowKey=key.toUpperCase();
			start=65;
			for(int i=0;i<26;i++){
				chList.add((char)(i+start));
			}
		}else {
			upLowKey=key.toLowerCase();
			start=97;
			for(int i=0;i<26;i++){
				chList.add((char)(i+start));
			}
		}
		int i=0;
		int removeIndex=0;
		char temp;
		for(i=0;i<len;i++){
			temp=upLowKey.charAt(i);
			Map1.put((char)(start+i), temp);
			removeIndex=((int)temp)-start;
			chList.remove(removeIndex);
		}
		for(int j=0;j<26-len;j++){
			Map1.put((char)(start+i+j), chList.get(j));
		}
	
		return Map1;
	}

}
