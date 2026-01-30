package com.dsa.array;

public class SlidingWindowBF{
    public static void main(String[] args){
        int[] nums = {2,1,5,8,9,4,6};
        int k=3;
        slideWindow(nums,k);
    }
    //TC = O(N_K)*K = O(NK - K*k)=O(NK)
    private static void slideWindow(int[] nums,int k){
        int m = nums.length-k;//7-3=4
        for(int i=0;i<=m;i++){
            int sum =0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            System.out.println(sum);
        }
    }
}
