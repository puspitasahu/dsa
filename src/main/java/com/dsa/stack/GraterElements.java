package com.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class GraterElements{
    public static void main(String[] args){
        int[] nums={1,2,1};
        int[] result = findGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findGreaterElements(int[] nums){
        int n= nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res =new int[n];
        Arrays.fill(res,-1);
        // Traverse twice to handle circular array
        for(int i=0;i<2*n;i++){
            int currentIndex=i%n;
            int currentValue=nums[currentIndex];
            // Pop elements smaller than current value
            while(!stack.isEmpty()&& nums[stack.peek()]<currentValue){
                res[stack.pop()]=currentValue;
            }
            // Only push indices during first pass
            if(i<n){
                stack.push(currentIndex);
            }
        }
        return res;
    }
}
