package com.dsa.hashtable;

import java.util.Arrays;

public class Anagram{
    public static void main(String[] args){
         String sArr = "cat";
         String tArr ="abt";
         System.out.println(isAnagram(sArr,tArr));

    }

    private static boolean isAnagram(String s,String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr,tArr);
    }
}
