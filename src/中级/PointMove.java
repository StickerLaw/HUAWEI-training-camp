package 中级;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PointMove {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String s = scanner.nextLine().trim();
  scanner.close();
  List<String> pos = getPosition(s);
  System.out.println(calculate(pos));
 }

 // 获得坐标数组，形如A10,B20
 private static List<String> getPosition(String s) {
  // 下面一句话，将句中的空格全部去掉，
  // 并将所有的小写字母全部转换为大写，
  // 并将丰号改换成了又丰号，然后来匹配";A10;"这样的表达式，最后再去掉第一个丰号
  s = (";" + (s.replaceAll(";", ";;").replaceAll(" ", ""))).toUpperCase();
  List<String> list = new ArrayList<String>();
  String regex = ";[A,W,S,D]\\d{1,2};";
  Matcher m = Pattern.compile(regex).matcher(s);
  while (m.find()) {
   String rt = m.group().substring(1, m.group().length() - 1);// 得到形如去掉两端的丰号
   list.add(rt);
  }
  return list;
 }

 // 获得计算结果
 private static String calculate(List<String> pos) {
  int x = 0;
  int y = 0;
  for (String s : pos) {
   char direct = s.charAt(0);
   int num = Integer.parseInt(s.substring(1));
   switch (direct) {
   case 'A':
    x -= num;
    break;
   case 'D':
    x += num;
    break;
   case 'W':
    y += num;
    break;
   case 'S':
    y -= num;
    break;
   default:
    break;
   }
  }
  return "(" + x + "," + y + ")";
 }
}