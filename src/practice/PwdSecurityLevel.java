package practice;

import java.util.Scanner;

public class PwdSecurityLevel {
	
	private static int upLetter;
	private static int lowLetter;
	private static int numlen;
	private static int sym;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String strPassword=in.nextLine();
			String level=GetPwdSecurityLevel(strPassword);
			System.out.println(level);
		}
		in.close();
	}


	private static String GetPwdSecurityLevel(String strPassword) {
		int length=LengthAdd(strPassword);
		int letter=LetterAdd(strPassword);
		int integer=IntegerAdd(strPassword);
		int symbol=SymbolAdd(strPassword);
		int award=AwardAdd(strPassword);
		
		int sum=0;
		sum=length+letter+integer+symbol+award;
		if(sum>=90)
            return "VERY_SECURE";
        else if(sum>=80)
            return " SECURE";
        else if(sum>=70)
            return "VERY_STRONG";
        else if(sum>=60)
            return "STRONG";
        else if(sum>=50)
            return "AVERAGE";
        else if(sum>=25)
            return "WEAK";
        return "VERY_WEAK";
	}


	private static int AwardAdd(String strPassword) {

		if(upLetter>0&&lowLetter>0&&numlen>0&&sym>0){
			return 5;
		}else if((upLetter>0||lowLetter>0)&&numlen>0&&sym>0){
			return 3;
		}else if((upLetter>0||lowLetter>0)&&numlen>0){
			return 2;
		}
		return 0;
	}


	private static int SymbolAdd(String strPassword) {
		sym=0;
		for(int i=0;i<strPassword.length();i++){
			char ch=strPassword.charAt(i);
			if((ch>=0x21&&ch<=0x2F)||(ch>=0x3A&&ch<=0x40)||(ch>=0x5B&&ch<=0x60)||(ch>=0x7B&&ch<=0x7E)){
				sym++;
			}
		}
		if(sym>1){
			return 25;
		}else if(sym==1){
			return 10;
		}
		return 0;
	}


	private static int IntegerAdd(String strPassword) {
		numlen=0;
		for(int i=0;i<strPassword.length();i++){
			char ch=strPassword.charAt(i);
			if(ch>='0'&&ch<='9'){
				numlen++;
			}
		}
		if(numlen>1){
			return 20;
		}else if(numlen==1){
			return 10;
		}
		return 0;
	}


	private static int LetterAdd(String strPassword) {
		upLetter=0;
		lowLetter=0;
		for(int i=0;i<strPassword.length();i++){
			char ch=strPassword.charAt(i);
			if(ch>='a'&&ch<='z'){
				lowLetter++;
			}
			if(ch>='A'&&ch<='Z'){
				upLetter++;
			}
		}
		if(upLetter>0&&lowLetter>0){
			return 20;
		}else if(upLetter>0||lowLetter>0) {
			return 10;
		}
		return 0;
	}


	private static int LengthAdd(String strPassword) {
		if(strPassword.length()<=4){
			return 5;
		}else if(strPassword.length()<=7) {
			return 10;
		}
		return 25;
	}

}
