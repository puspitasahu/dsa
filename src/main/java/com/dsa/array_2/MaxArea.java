package com.dsa.array_2;

public class MaxArea{

    public static void main(String[] args){
        //int[] heights ={1,3,2,4};
        // int[] heights ={5, 4, 3, 2, 1};
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int results = maxArea(heights);
        System.out.println(results);
    }

    private static int maxArea(int[] heights){
        int left = 0;
        int right = heights.length - 1;
        int ans = 0;

        while(left < right){//0<4//0<3//0<2//0<1
            int width = right - left;//4//3//2//1
            int height = Math.min(heights[left], heights[right]);//(1,1)=1//(5,2)=2//(3,3)=3//(5,4)=4
            int area = height * width;//4//6//6//4
            ans = Math.max(area, ans);//4//6//6//4
            if(heights[left] < heights[right]){//5<1//5<2//5<3//5<4
                left++;
            }else{
                right--;//right=3//right=2//right=1//right=0
            }
        }
        return ans;
    }
}
