package com.dsa.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static void main(String[] args){
        int[] num ={2,7,11,15};
         int target =9;
         int[] index = twoSums(num,target);
         System.out.println(Arrays.toString(index));

    }
    private static int[] twoSums(int[] num ,int target){
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<num.length;i++){
            int key = target - num[i];
            if(map.containsKey(key)){
                return new int[]{map.get(key),i};
            }else{
                map.put(num[i],i);//[2,0]
            }
        }
        return null;
    }
}
