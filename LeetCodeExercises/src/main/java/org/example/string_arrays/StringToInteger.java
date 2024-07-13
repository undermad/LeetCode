package org.example.string_arrays;

import java.math.BigInteger;

public class StringToInteger {


    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/

    public static void main(String[] args) {

        
        String test = "   -42";

//        System.out.println(myAtoi(test));


        
        
    }

    public static int myAtoi(String s) {

        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        boolean isFirstDigitReached = false;
        int startingIndex = 0;
        
        int sign = 1;
        for(int i = 0; i < chars.length; i++) {
            if(Character.isSpaceChar(chars[i]) || chars[i] == 0) continue;
            if(Character.isDigit(chars[i])) {
                isFirstDigitReached = true;
                startingIndex = i;
                sb.append(chars[i]);
                break;
            }
            if(chars[i] == '-') {
                sign = -1;
                startingIndex = i;
                break;
            }
            
            if(chars[i] == '+') {
                startingIndex = i;
                break;
            }
            
            if (!Character.isDigit(chars[i]) && !Character.isSpaceChar(chars[i]) && chars[i] != '-' && chars[i] != '+') {
                return 0;
            }
        }




        for (int i = startingIndex + 1; i < chars.length; i++) {
            if(!Character.isDigit(chars[i])) break;
            sb.append(chars[i]);
        }
        
        
        String sbResult = sb.toString();
        
        if(sbResult.isEmpty()) return 0;

        BigInteger bigInteger = new BigInteger(sb.toString());
        BigInteger result = bigInteger.multiply(new BigInteger(String.valueOf(sign)));
        
        
        if(result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        }
        
        if(result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        }
        
        return result.intValue();
        
        
    }


}
