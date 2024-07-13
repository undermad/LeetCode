package org.example.string_arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        
        // https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
        
        
        
        
    }

    public static String longestCommonPrefix(String[] strs) {
        int shortestWord = Integer.MAX_VALUE;
        for (String word : strs) {
            if(shortestWord > word.length()) shortestWord = word.length();
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < shortestWord; i++) {
            char c = strs[0].charAt(i);
            boolean isEqual = true;
            
            for(int j = 1; j < strs.length; j++) {
               if(strs[j].charAt(i) != c) {
                   isEqual = false;
                   break;
               }
            }
            
            if(isEqual) {
                stringBuilder.append(c);
            } else {
                break;
            }
            
        }
        
        return stringBuilder.toString();
    }
}
