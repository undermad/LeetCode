package org.example.string_arrays;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
    
    // Time complexity is 0(2n) where n is length of the word
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> counter = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer newValue = counter.getOrDefault(c, 0) + 1;
            counter.put(c, newValue);
        }
        
        for(int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            Integer value = counter.get(c);
            if(value == null || value < 1) return false;
            counter.put(c, value - 1);
        }
        
        return true;
    }

}
