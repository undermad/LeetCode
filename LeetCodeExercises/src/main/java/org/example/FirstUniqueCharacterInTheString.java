package org.example;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInTheString {
    
    public static void main(String[] args) {

        String x = "leetcode";
        System.out.println(firstUniqChar(x));

    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> counter = new HashMap<>();


        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            boolean exist = counter.containsKey(chars[i]);
            if(exist) counter.computeIfPresent(chars[i], (key, oldValue) -> oldValue + 1);
            else counter.put(chars[i], 1);
        }
        
        int index = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if(entry.getValue() == 1) {
                int currentIndex = s.indexOf(entry.getKey());
                if(currentIndex < index) {
                    index = currentIndex;
                }
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

}
