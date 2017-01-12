package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=Integer.parseInt(in.nextLine());
			Integer[] primeArray=processing(n);
			for(int i=0;i<primeArray.length-1;i++){
				System.out.print(primeArray[i]);
				System.out.print(" ");
			}
			System.out.print(primeArray[primeArray.length-1]);
		}
		in.close();
	}

	private static Integer[] processing(int n) {
		List<Integer> list=new ArrayList<Integer>();
		Integer[] primes=caculatePrimes(n);
		
		int index=0;
		while(n>1){
			if(n%primes[index]==0){
				list.add(primes[index]);
				n=n/primes[index];
			}else {
				index++;
			}
		}
		Integer [] result=new Integer[list.size()];
		result=list.toArray(result);
		
		return result;
	}

	private static Integer[] caculatePrimes(int n) {
		List<Integer> prime=new ArrayList<>();
		for(int i=2;i<=n;i++){
			if(i==2){
				prime.add(i);
			}else {
				for(int j=2;j<=Math.sqrt(i);j++){
					if(i%j==0)
						break;
				}
				prime.add(i);
			}
		}
		Integer[] a=new Integer[prime.size()];
		a=prime.toArray(a);
		
		return a;
	}

}
