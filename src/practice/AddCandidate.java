package practice;

import java.util.Scanner;

public class AddCandidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int candidates=Integer.parseInt(in.nextLine());
			String candidateName=in.nextLine();
			int voter=Integer.parseInt(in.nextLine());
			String voterSelect=in.nextLine();
			processing(candidateName,voterSelect,candidates,voter);
		}
		in.close();
	}

	private static void processing(String c, String v, int n, int m) {

		String [] cs=c.split(" ");
		String [] vs=v.split(" ");
		int[] a=new int[n];
		int valid=0;
		boolean flag=true;
		for(int i=0;i<m;i++){
			flag=true;
			String temp=vs[i];
			for(int j=0;j<n;j++){
				if(cs[j].equals(temp)){
					a[j]=a[j]+1;
					flag=false;
				}
			}
			if(flag){
				valid++;
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(cs[i]+" : "+a[i]);
		}
		System.out.println("Invalid : "+valid);
		
	}

}
