package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Fama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int N=Integer.parseInt(in.nextLine());
			String str1=in.nextLine();
			String str2=in.nextLine();
			int number=processing(N,str1,str2);
			System.out.println(number);
		}
		in.close();
	}

	private static int processing(int n, String str1, String str2) {

		int[] weights=new int[n];
		int[] nums=new int[n];
		String[] strWeight=str1.split(" ");
		String[] strnum=str2.split(" ");
		
		for(int i=0;i<n;i++){
			weights[i]=Integer.parseInt(strWeight[i]);
			nums[i]=Integer.parseInt(strnum[i]);
		}
		
		Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<=nums[0];i++)
            set.add(i*weights[0]);
        for(int i=1;i<n;i++){             //从第二个砝码开始
            List<Integer>list =new ArrayList<Integer>(set);
            for(int j=1;j<=nums[i];j++){              //遍历砝码的个数
                for(int k=0;k<list.size();k++)
                    set.add(list.get(k)+j*weights[i]);
            }
        }
        return set.size();
	}

}
