package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int start=Integer.parseInt(in.nextLine());
			int end=Integer.parseInt(in.nextLine());
			List<Integer> res=GetMaxArray(start,end);
			for(int a:res){
				System.out.println(a);
			}
			
		}
		in.close();
	}

	private static List<Integer> GetMaxArray(int s, int e) {
		
		List<Integer> list=new ArrayList<Integer>();
		for(int i=s;i<=e;i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		
		List<Integer> resList=new ArrayList<>();
		List<Integer> tempList=new ArrayList<>();
		List<Integer> tempList1=new ArrayList<>();
		int max=0;
		int start=0;
		int end=0;
		int dif=0;
		for(int i=0;i<list.size();i++){
			tempList.clear();
			start=list.get(i);
			tempList.add(start);
			for(int j=i+1;j<list.size()-1;j++){
				tempList1.clear();
				tempList1.add(list.get(j));
				dif=list.get(j)-list.get(i);
				end=list.get(j);
				while(list.contains(end+dif)){
					end=end+dif;
					tempList1.add(end);
				}
				
				if(tempList1.size()+1>=max){
					tempList.clear();
					tempList.add(start);
					
					tempList.addAll(tempList1);					
					resList=new ArrayList<>(tempList);
					max=resList.size();
				}
			}			
		}
		
		return resList;
	}

	private static boolean isPrime(int i) {

		if(i<2){
			return false;
		}else if(i==2) {
			return true;
		}else {
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					return false;
				}
			}
		}
		return true;
	}

}
