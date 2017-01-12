package practice;

import java.util.Scanner;

/**
 * 合唱队形
 * @author Administrator
 *
 */
public class OutStudents{
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int cnt = in.nextInt();
            int[] height = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                height[i] = in.nextInt();
            }
            System.out.println(processChorusFormation(height, cnt));
        }
        in.close();
    }
 
    private static int processChorusFormation(int[] height, int len) {
        // TODO Auto-generated method stub
        int res = 0;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
        	left[i]=1;
            for (int k =0; k<i; k++) {
                if (height[i] > height[k]) {
                    left[i] = Math.max(left[i], left[k] + 1);
                }
            }
        }
        for (int i = len - 2; i >= 0; i--) {
        	right[i]=1;
            for (int k = len - 1; k > i; k--) {
                if (height[i] > height[k]) {
                    right[i] = Math.max(right[i], right[ k] + 1);
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (left[i] + right[i] - 1 > res) {
                res = left[i] + right[i] - 1;
            }
        }
        return len-res;
    }
 
}