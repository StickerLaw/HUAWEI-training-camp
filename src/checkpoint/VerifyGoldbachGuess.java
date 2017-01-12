package checkpoint;

import java.util.Scanner;

public class VerifyGoldbachGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int res=processing(N);
		System.out.println(res);
		in.close();

	}

	private static int processing(int n) {
		if(n%2==0){
			return 1;
		}else {
			return 0;
		}
		
	}

}
