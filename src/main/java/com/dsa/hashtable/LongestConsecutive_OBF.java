package com.dsa.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive_OBF{
    public static void main(String[] args){
        int[] num = {4,2,7,8,3,6,10};//{2,3,4},{6,7,8}
        int ans = longestSubsequentNo(num);
        System.out.println(ans);
    }
    private static int longestSubsequentNo(int[] num){
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            map.put(num[i],true);
        }
        int ans=1;
        for(int i=0;i<num.length;i++){
            int count=1;
            int next = num[i]+1;
            while(map.containsKey(next)){
                count++;
                next ++;
            }
            if(count> ans){
                ans = count;
            }
        }
        return ans;
    }

}
