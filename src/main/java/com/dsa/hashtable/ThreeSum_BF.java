package com.dsa.hashtable;

import java.util.*;

public class ThreeSum_BF{
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }

    private static List<List<Integer>> threeSum(int[] num){
       Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=j+1; k<num.length;k++){
                    if(num[i]+num[j]+num[k]==0){
                        result.add(Arrays.asList(num[i],num[j],num[k]));
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
