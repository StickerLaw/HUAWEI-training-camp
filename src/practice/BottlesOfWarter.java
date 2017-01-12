package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BottlesOfWarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System .in);
		List<Integer> resList=new ArrayList<Integer>();
		while(in.hasNext()){
			int n=in.nextInt();
			if(n!=0){
				resList.add(n);
			}else {
				break;
			}
		}
		int len=resList.size();
		for(int i=0;i<len;i++){
			int result=(resList.get(i))/2;
			System.out.println(result);
		}
		in.close();
	}

}
