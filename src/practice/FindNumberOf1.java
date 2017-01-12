package practice;

import java.util.Scanner;

public class FindNumberOf1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int number = findNumberOf1(scanner.nextInt());
		System.out.println(number);

	}

	public static int findNumberOf1(int num) {
		
		int count = Integer.bitCount(num);
		
		return count;
	}
}