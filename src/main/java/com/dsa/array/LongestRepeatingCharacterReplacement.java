package com.dsa.array;

//map → frequency of characters in window
//maxFreq → most frequent character count in window
//fp, sp
// ans
//If replacements needed are LESS than k → shrink window
//If replacements ≤ k → window is valid → don’t touch it
//If replacements > k → window invalid → move fp
//Expand (sp)
//While window invalid → shrink (fp)
//Measure ans

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement{
    public static void main(String[] args){
        //String s = "AABABBA";
        //String s= "AABA";
        String s= "ABAB";
        int k = 1;
        int ans = characterReplacement(s,k);
        System.out.println(ans);

    }
    private static int characterReplacement(String str,int k){
        int maxFreq=0,ans=0,fp=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int sp=0;sp<str.length();sp++){
            char ch =str.charAt(sp);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            while((sp-fp+1)-maxFreq>k){
                char left = str.charAt(fp);
                map.put(left,map.get(ch)-1);
                fp++;
            }
            ans=Math.max(ans,sp-fp+1);
        }
        return ans;
    }
}
