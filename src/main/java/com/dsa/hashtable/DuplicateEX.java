package com.dsa.hashtable;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEX{
    public static void main(String[] args){
        int[] nums ={1,3,2};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(list.contains(num)){
                return true;
            }
            list.add(num);
        }
        return false;
    }
}
