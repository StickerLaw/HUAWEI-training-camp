package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 比较扑克牌的大小
 * 自己设计的方法，想得太多，有点复杂
 * 
 */
public class PlayingCard {
	
	private static Map<String , Integer> cardMap=new HashMap<String, Integer>();
	static {
		for(int i=0;i<8;i++){
			cardMap.put(String.valueOf(i+3), i);
		}
		cardMap.put("J", 8);
		cardMap.put("Q", 9);
		cardMap.put("K", 10);
		cardMap.put("A", 11);
		cardMap.put("2", 12);
		cardMap.put("joker", 13);
		cardMap.put("JOKER", 14);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String strIn=in.nextLine();
		String strOut=processing(strIn);
		System.out.println(strOut);
		in.close();

	}

	private static String processing(String strIn) {

		String [] cards=strIn.split("-");
		String cardstr1=cards[0];
		String cardstr2=cards[1];
		String result;
		
		String [] card1=cardstr1.split(" ");
		String [] card2=cardstr2.split(" ");
		
		int[] type=typeJudgement(card1,card2);
		switch (type[0]) {
		case 1:
			result= "joker JOKER";
			break;
		case 2:
			if(type[1]==1){
				result=cardstr1;
			}else {
				result=cardstr2;
			}
			break;
		case 3:
			if(type[1]==1){
				result=cardstr1;
			}else {
				result=cardstr2;
			}
			break;
		case 4:
			int res=cardCompare(card1,card2);
			if(res==1){
				result=cardstr1;
			}else if(res==2) {
				result=cardstr2;
			}else {
				result="ERROR";
			}
			break;

		default:
			result="ERROR";
			break;
		}
		return result;
	}

	private static int cardCompare(String[] card1, String[] card2) {
		
		if(card1.length!=card2.length){
			return 3;
		}else {
			if(cardMap.get(card1[0])>cardMap.get(card2[0])){
				return 1;
			}else {
				return 2;
			}
		}
	}

	private static int[] typeJudgement(String [] card1, String [] card2) {
		
		int len1=card1.length;
		int len2=card2.length;
		int[] types=new int[2];
		
		// 第一手牌为对王
		if(len1==2){
			if("joker".equals(card1[0])&&"JOKER".equals(card1[1])){
				types[0]=1;
				types[1]=0;
				return types;
			}
		}
		// 第二手牌为对王
		if(len2==2){
			if("joker".equals(card2[0])&&"JOKER".equals(card2[1])){
				types[0]=1;
				types[1]=1;
				return types;
			}
		}
		
		// 两手牌都是炸弹
		if(isBomb(card1)&&isBomb(card2)){
			if(cardMap.get(card1[0])>cardMap.get(card2[0])){
				types[0]=2;
				types[1]=1;
				return types;
			}else {
				types[0]=2;
				types[1]=2;
				return types;
			}
			
		}else if(isBomb(card1)){                       // 第一手牌是炸弹
			types[0]=3;
			types[1]=1;
			return types;
		}else if(isBomb(card2)){                       // 第二手牌是炸弹
			types[0]=3;
			types[1]=2;
			return types;
		}
		else {                                         // 两手牌都不是炸弹
			types[0]=4;
			return types;
		}
	}

	private static boolean isBomb(String[] card1) {

		if(card1.length!=4){
			return false;
		}else if(card1[1].equals(card1[0])&&card1[2].equals(card1[0])&&card1[3].equals(card1[0])) {
			return true;			
		}
		return false;
	}

}
