package com.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring{
    public static void main(String[] args){
        String str="abcabcbb";//first pointer moves if string becomes invalid but second pointer moves  if string becomes valid
       //String str="bbbbbb";
       // String str="abba";
        int ans=longestSubstring(str);
        System.out.println(ans);
    }
    private static int longestSubstring(String str){
        Map<Character,Integer> map = new HashMap<>();
        int ans=1,fp=0,sp=0,n=str.length();

        while(sp<n){

            map.put(str.charAt(sp), map.getOrDefault(str.charAt(sp), 0) + 1);

            while(fp<sp && !isValid(map)){
                map.put(str.charAt(fp),map.getOrDefault(str.charAt(fp),0)-1);
                fp++;
            }
            ans = Math.max(ans,sp-fp+1);//(1,0-0) //1 //(1,1-1),(1,2-1),(1,3-2),
            sp++;
          //  ans = Math.max(ans,sp-fp+1);//(1,1-0+1) //1 //2 //(2,3-1)-2,(2,4-2)//2 ---2 (1,1-0)=1,(1,2-1)=1,(1,3-2)=1,(1,4-3)
        }

        return ans;
    }
    private static boolean isValid(Map<Character,Integer> map){
        for(Character ch : map.keySet()){//a,b,b
            if(map.get(ch)>1){
                return false;
            }
        }
        return true;
    }
}
