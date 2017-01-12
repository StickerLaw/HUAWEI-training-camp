package practice;

import java.util.Scanner;
public class PrimePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            getMinDiff(n);
        }
        sc.close();
    }
     
    public static void getMinDiff(int n) {
        if (n > 2 && (n & 1) == 0) {
            int k = n / 2;
            while (k > 1) {
                if (isPrime(k) && isPrime(n - k)) {
                    System.out.println(k);
                    System.out.println(n-k);
                    break;
                } else
                    k--;
            }
        }else {
			return;
		}
    }
     
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}