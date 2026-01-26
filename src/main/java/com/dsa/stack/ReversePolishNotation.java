package com.dsa.stack;

import java.util.Stack;

public class ReversePolishNotation{
    public static void main(String[] args){
         String[] tokens={"2", "1", "+", "3", "*"};
        //String[] tokens = {"5", "3", "-"};
        int result = reversePolishNotation(tokens);
        System.out.println(result);

    }
    private static  int reversePolishNotation(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(isOperator(token)){
                Integer operand2 = stack.pop();//3
                Integer operand1=  stack.pop();//5
                int result= evaluateValues(token,operand1,operand2);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token){
        return token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-");
    }
    private static int evaluateValues(String operator,Integer operand1,Integer operand2){
        switch(operator){
            case "*" : return operand1 * operand2;
            case "/" : return operand1/operand2;
            case "+" : return operand1 + operand2;
            case "-" : return  operand1-operand2;
            default: throw new IllegalArgumentException("Invalid opeartor"+operator);
        }
    }
}
