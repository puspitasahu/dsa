package com.dsa.hashtable;

public class LongestConsecutive_BF{
    public static void main(String[] args){
        int[] num = {4,2,7,8,3,6,10};//{2,3,4},{6,7,8}
        int ans = longestConsecutive(num);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] arr){
        int answer =1;
        for(int i=0;i<arr.length;i++){
            int count =1;
            int next = arr[i]+1;
            while(isExist(next,arr)){
                count++;
                next++;
            }
            if(count > answer){
                answer = count;
            }

        }
        return answer;
    }

    private static boolean isExist(int num,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

}
