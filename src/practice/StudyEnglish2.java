package practice;

import java.io.BufferedInputStream;
import java.util.Scanner;
 
public class StudyEnglish2 {
 
    static String[] nums={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    static String[] num1s={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static String[] numos={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (scanner.hasNext()) {
            char[] chars=scanner.nextLine().toCharArray();
            if (chars.length<=3) {
                if (chars.length==1) {
                    System.out.println(nums[GetIndex(chars[0])]);
                }else if (chars.length==2) {
                    System.out.println(Get2Char(chars[0],chars[1]));
                }else {
                    System.out.println(get3char(chars[0], chars[1], chars[2]));
                }
            }else if (chars.length<=6) {
                if (chars.length==4) {
                    if (chars[1]=='0'&&chars[2]=='0'&&chars[3]=='0') {
                        System.out.println(nums[GetIndex(chars[0])]+" thousand");
                    }else {
                        System.out.println(nums[GetIndex(chars[0])]+" thousand "+get3char(chars[1], chars[2], chars[3]));
                    }
                }else if (chars.length==5) {
                    if (chars[2]=='0'&&chars[3]=='0'&&chars[4]=='0') {
                        System.out.println(Get2Char(chars[0], chars[1])+" thousand");
                    }else {
                        System.out.println(Get2Char(chars[0], chars[1])+" thousand "+get3char(chars[2], chars[3], chars[4]));
                    }
                }else if (chars.length==6) {
                    if (chars[3]=='0'&&chars[4]=='0'&&chars[5]=='0') {
                        System.out.println(get3char(chars[0], chars[1], chars[2])+" thousand");
                    }else {
                        System.out.println(get3char(chars[0], chars[1], chars[2])+" thousand "+
                                get3char(chars[3], chars[4], chars[5]));
                    }
                }
            }else if (chars.length<=9) {
                if (chars.length==7) {
                    if (chars[1]=='0'&&chars[2]=='0'&&chars[3]=='0'
                            &&chars[4]=='0'&&chars[5]=='0'&&chars[6]=='0') {
                        System.out.println(nums[GetIndex(chars[0])]+" million");
                    }else {
                        if (chars[3]=='4'&&chars[5]=='0'&&chars[6]=='0') {
                            System.out.println(get3char(chars[0], chars[1], chars[2])+" thousand");
                        }else {
                            if (chars[1]=='0'&&chars[2]=='0'&&chars[3]=='0') {
                                System.out.println(nums[GetIndex(chars[0])]+" million and "
                                        + get3char(chars[4],chars[5], chars[6]));
                            }else if(chars[4]=='0'&&chars[5]=='0'&&chars[6]=='0'){
                                System.out.println(nums[GetIndex(chars[0])]+" million "
                                        +get3char(chars[1], chars[2], chars[3])+" thousand");
                            }else {
                                System.out.println(nums[GetIndex(chars[0])]+" million "
                                        +get3char(chars[1], chars[2], chars[3])+" thousand "
                                        + get3char(chars[4],chars[5], chars[6]));
                            }
                        }
                         
                    }
                }else if (chars.length==8) {
                    if (chars[2]=='0'&&chars[3]=='0'&&chars[4]=='0'&&chars[5]=='0'&&chars[6]=='0'&&chars[7]=='0') {
                        System.out.println(Get2Char(chars[0], chars[1])+" million");
                    }else {
                        if (chars[2]=='0'&&chars[3]=='0'&&chars[4]=='0') {
                            System.out.println(Get2Char(chars[0], chars[1])+" million and "+
                                    get3char(chars[5], chars[6], chars[7]));
                        }else if (chars[5]=='0'&&chars[6]=='0'&&chars[7]=='0') {
                            System.out.println(Get2Char(chars[0], chars[1])+" million and "+
                                    get3char(chars[2], chars[3], chars[4]) +" thousand");
                        }else {
                            System.out.println(Get2Char(chars[0], chars[1])+" million "
                                    +get3char(chars[2], chars[3], chars[4]) +" thousand "
                                    +get3char(chars[5], chars[6], chars[7]));
                        }
                    }
                }else if (chars.length==9) {
                    if (chars[3]=='0'&&chars[4]=='0'&&chars[5]=='0'&&chars[6]=='0'&&chars[7]=='0'&&chars[8]=='0') {
                        System.out.println(get3char(chars[0], chars[1],chars[2])+" million");
                    }else if (chars[3]=='0'&&chars[4]=='0'&&chars[5]=='0') {
                        System.out.println(get3char(chars[0], chars[1],chars[2])+" million and "
                                +get3char(chars[6], chars[7], chars[8]));
                    }else if (chars[6]=='0'&&chars[7]=='0'&&chars[8]=='0') {
                        System.out.println(get3char(chars[0], chars[1],chars[2])+" million and "
                                +get3char(chars[3], chars[4], chars[5]) +" thousand");
                    }else {
                        System.out.println(get3char(chars[0], chars[1],chars[2])+" million "
                                +get3char(chars[3], chars[4], chars[5]) +" thousand "
                                +get3char(chars[6], chars[7], chars[8]));
                    }
                }
            }else{
                System.out.println("error");
            }
        }
        scanner.close();
    }
    //获取指定数字索引
    private static int GetIndex(char c){
        if (c=='0') {
            return 0;
        }else if (c=='1') {
            return 1;
        }else if (c=='2') {
            return 2;
        }else if (c=='3') {
            return 3;
        }else if (c=='4') {
            return 4;
        }else if (c=='5') {
            return 5;
        }else if (c=='6') {
            return 6;
        }else if (c=='7') {
            return 7;
        }else if (c=='8') {
            return 8;
        }else if (c=='9') {
            return 9;
        }else{
            System.out.println("error char");
        }
        return 0;
    }
     
    //处理两个数字组合
    private static String Get2Char(char c1,char c2){
        if (c1=='1') {
            if (c2=='0') {
                return (nums[10]);
            }else {
                return (num1s[GetIndex(c2)-1]);
            }
        }else {
            if (c1=='0'&&c2=='0') {
                return "";
            }else if (c2=='0' ) {
                return numos[GetIndex(c1)-2];
            }else if(c1=='0'){
                return nums[GetIndex(c2)];
            }else {
                return numos[GetIndex(c1)-2]+" "+nums[GetIndex(c2)];
            }
        }
    }
    //处理三个数字组合
    private static String get3char(char c1,char c2,char c3){
        StringBuilder builder=new StringBuilder();
        if (c1!='0'&&c2=='0'&&c3=='0') {
            builder.append(nums[GetIndex(c1)]+" hundred");
        }else if(c1=='0'&&c2=='0'&&c3=='0'){
            return "";
        }else if(c1=='0'){
            builder.append(Get2Char(c2, c3));
        }else if (c1!='0'&&c2=='0'&&c3!='0') {
            builder.append(nums[GetIndex(c1)]+" hundred and " +nums[GetIndex(c3)]);
        }else {
            builder.append(nums[GetIndex(c1)]+" hundred and " +Get2Char(c2, c3));
        }
         
        return (builder.toString());
    }
 
}
