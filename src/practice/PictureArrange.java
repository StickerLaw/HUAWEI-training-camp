package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PictureArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String res=Process(s);
		System.out.println(res);
		in.close();
	}

	private static String Process(String s) {
		int len=s.length();
		char[] ch=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=s.charAt(i);
		}
		// 将字符转换成ASCII码
		int[] asciis=new int[len];
		for(int i=0;i<len;i++)
		{
			asciis[i]=(int) ch[i];
		}
		// 排序
		Arrays.sort(asciis );
		// 再转换为字符
		for(int i=0;i<len;i++){
			ch[i]=(char)asciis[i];
		}
		String result=new String(ch);
		return result;
	}

}
