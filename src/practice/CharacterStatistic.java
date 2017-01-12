package practice;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class CharacterStatistic {
	 
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        while (in.hasNext()) {
	            String line = in.nextLine();
	            char[] cArray = line.toCharArray();
	            Map<Character, Integer> map = new TreeMap<Character, Integer>();
	            for (Character c : cArray) {
	                if (map.containsKey(c)) {
	                    int temp = map.get(c);
	                    map.remove(c);
	                    map.put(c, temp + 1);
	                } else {
	                    map.put(c, 1);
	                }
	            }
	 
	            List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
	 
	            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
	                @Override
	                public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
	                    // TODO Auto-generated method stub
	                    int result = o2.getValue().compareTo(o1.getValue());
	                    if (result == 0) {
	                        int oo1 = o1.getKey();
	                        int oo2 = o2.getKey();
	                        result = oo1 < oo2 ? -1 : (oo1 == oo2 ? 0 : 1);
	                    }
	                    return result;
	                }
	            });
	 
	            for (Map.Entry<Character, Integer> entry : list) {
	                System.out.print(entry.getKey());
	            }
	        }
	        in.close();
	    }
	}