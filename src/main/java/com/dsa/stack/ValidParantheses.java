package com.dsa.stack;

import java.util.Stack;

public class ValidParantheses{
    public static void main(String[] args){
        String s = "()[]{}";
        boolean isValid = isValidParenthesis(s);
        System.out.println(isValid);
    }

    private static boolean isValidParenthesis(String s){
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : chs){
            if(isOpen(ch)){
                stack.push(ch);
            }else{
                if(!stack.isEmpty() && isSameType(stack.peek(),ch)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isSameType(Character open,Character close){
        return (open=='{' && close == '}') || (open=='(' && close ==')') || (open == '[' && close == ']');
    }

    private static boolean isOpen(Character c){
        return c=='{' || c== '(' || c== '[';
    }

}
