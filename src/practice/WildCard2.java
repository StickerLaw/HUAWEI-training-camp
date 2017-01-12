package practice;

import java.util.Scanner;

/*
 * 这是利用正则表达式实现的，非常简洁。
 */

public class WildCard2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            System.out.println(match(sc.nextLine(), sc.nextLine()));
        sc.close();
    }
 
    private static boolean match(String regex, String str) {
        return str.matches(regex.replaceAll("\\*", "[a-zA-Z0-9]{0,}").replaceAll("\\?",
                "[a-zA-Z0-9]"));
    }
 
}