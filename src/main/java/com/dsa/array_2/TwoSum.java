package com.dsa.array_2;

import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args){
        //int[] nums={2,7,9,11};
        int[] nums={1, 3, 4, 6, 8};
        int target =10;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    private static int[] twoSum(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=0;
            sum = nums[left]+nums[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else {
                return new int[]{left,right};
            }
        }
        return new int[]{-1,-1};

    }
}
