package com.utils.stack;


import java.util.Arrays;

/**
 * Custom Stack with basic operation
 *
 * push()
 * pop()
 * peek()
 *
 */
public class Stack {
    int[] stack = new int[5];
    int top = 0;

    /**
     * This method is used tp push element to the stack
     *
     *
     * @param data
     */
    public void push(int data){
        stack[top] = data;
        top++;
    }

    /**
     * This methods will delete an element from the Stack
     *
     * @return
     */
    public int pop(){
        int data ;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    /**
     * This method will peek the top element bu wont delete the element from the Stack
     *
     * @return
     */
    public int peek(){
        return stack[top-1];
    }

    public void show(){
        System.out.println(" "+ Arrays.toString(stack));
    }

}
