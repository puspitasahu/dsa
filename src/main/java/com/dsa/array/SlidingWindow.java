package com.dsa.array;

public class SlidingWindow{
    public static void main(String[] args){
        int[] nums = {10,2,7,8,11,13};
        int k=3;
        slideWindow(nums,k);
    }
    private static void slideWindow(int[] nums,int k){
        int sum=0;
        //O(K)
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
        //O(N)
        for(int i=1;i<=nums.length-k;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            System.out.println(sum);
        }
    }
}
