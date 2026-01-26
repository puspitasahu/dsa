package com.dsa.stack;

import java.util.Stack;

public class MinStack{
    Stack<Integer> mainStack,auxStack;

    public MinStack(){
        this.mainStack = new Stack<>();
        this.auxStack = new Stack<>();
    }

    public  static  void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(4);//mainStack - 4,2,5,1     auxStack-4,2,1
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        System.out.println(minStack.getMin());//1
        System.out.println(minStack);


        minStack.pop();//4
        System.out.println(minStack.getMin());//1

    }

    private void push(int val){
        this.mainStack.push(val);
        if(auxStack.isEmpty() || val<= this.auxStack.peek()){
            this.auxStack.push(val);
        }
    }

    private void pop(){
        if(!auxStack.isEmpty() && this.auxStack.peek().equals(getTop())){
            auxStack.pop();
        }
        mainStack.pop();
    }

    private int getMin(){
       return this.auxStack.peek();
    }

    private int getTop(){
        return this.mainStack.peek();
    }


}
