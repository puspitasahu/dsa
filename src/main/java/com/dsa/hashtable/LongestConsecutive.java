package com.dsa.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive{
    public static void main(String[] args){
        int[] num = {4,2,7,8,3,6,10};//{2,3,4},{6,7,8}
        int ans = longestConsecutive(num);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] nums){

        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer,Boolean> map = new HashMap<>();
        for(int num : nums){
          map.put(num,true);
        }
        System.out.println(map);
        int ans =1;
        for(int num: nums){
            if(map.containsKey(num-1)){
                continue;
            }

            int next = num+1;
            int count=1;
            while(map.containsKey(next)){
                count++;
                next++;
            }
            if(count>ans){
                ans = count;
            }

        }
        return ans;

    }
}
