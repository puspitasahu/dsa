package com.dsa.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum{
    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

    }
    private static int[] maxSlidingWindow(int[] nums,int k){
        if(nums== null || nums.length==0 || k==0){
            return new int[0];
        }
        int n =nums.length;
        int[] answers = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            int windowStart =i-k+1;

            if(!deque.isEmpty() && deque.peekFirst() <windowStart){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }

            deque.offerLast(i);
            if(i>=k-1){
                answers[windowStart] =nums[deque.peekFirst()];
            }

        }
        return answers;
    }
}
