package com.dsa.array_2;

public class ValidPalindrome{
    public static void main(String[] args){
        String str="A man, a plan, a canal: Panama";
        boolean flag = validPalindrome(str);
        System.out.println(flag);
    }
    private static boolean validPalindrome(String str){
       int left = 0;
       int right=str.length()-1;

       while(left<right){

           if(!Character.isLetterOrDigit(str.charAt(left))){
               left++;
               continue;
           }

           if(!Character.isLetterOrDigit(str.charAt(right))){
               right--;
               continue;
           }

           if(Character.toLowerCase(str.charAt(left)) !=Character.toLowerCase(str.charAt(right))){
               return false;
           }
           left++;
           right--;
       }
     return true;
    }
}
