package com.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring1{
    public static void main(String[] args){
        String str="abba";
       // String str="bbbbbb";
        int ans=longestSubString(str);
        System.out.println(ans);
    }
    private static int longestSubString(String str){
        int ans=1,fp=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int sp=0;sp<str.length();sp++){
            char ch = str.charAt(sp);
            if(map.containsKey(ch) && map.get(ch)>=fp){
                fp=map.get(ch)+1;
            }
            map.put(ch,sp);
          ans =Math.max(ans,sp-fp+1);
        }
       return ans;
    }
}
