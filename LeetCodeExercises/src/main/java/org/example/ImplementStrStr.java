package org.example;

public class ImplementStrStr {

    
    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
    //
    //      FAST SOLUTION
    //      return haystack.indexOf(needle);
    
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {

        char firstCharacter = needle.charAt(0);
        
        for(int i = 0; i < haystack.length(); i++) {
            
            while(i < haystack.length() && haystack.charAt(i) != firstCharacter ) i++;
            
            int k = i;
            
            if(haystack.length() - k < needle.length()) return -1;
            
            for (int j = 0; j < needle.length(); j++, k++) {
                boolean b = haystack.charAt(k) == needle.charAt(j);
                if(j == needle.length() - 1 && b) return i;
                if(b) continue;
                break;
            }
            
        }
        return -1;
        
    }
}
