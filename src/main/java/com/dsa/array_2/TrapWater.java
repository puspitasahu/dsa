package com.dsa.array_2;

public class TrapWater{
    public static void main(String[] args){
       int[] heights = {3, 0, 2, 0, 4};
       int result=trap(heights);
       System.out.println(result);
    }
    private static int trap(int[] heights){
        int left=0;
        int right=heights.length-1;
        int leftMax=0;
        int rightMax=0;
        int water=0;
        while(left<right){
           if(heights[left]<heights[right]){
                leftMax=Math.max(leftMax,heights[left]);
                water+=leftMax-heights[left];
                left++;
           }else{
               rightMax=Math.max(rightMax,heights[right]);
               water+=rightMax-heights[right];
               right--;
           }
        }
        return water;
    }
}
