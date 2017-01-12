package practice;

import java.util.Scanner;

public class OneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toBinaryString(num);
        num=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                num++;
            }
        }
        System.out.println(num);
        sc.close();
    }
}
