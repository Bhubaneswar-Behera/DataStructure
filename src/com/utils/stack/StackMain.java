package com.utils.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();

        //Pushing elements
        stack.push(10);
        stack.push(50);
        //peek stack
        System.out.println("Peek into the stack : "+stack.peek());

        stack.push(20);
        //display the contents
        System.out.println("After pushing : \\n");
        stack.show();

        //Popping an element
        System.out.println("Popped element is : "+stack.pop());
        //display the contents
        System.out.println("After popping : ");
        stack.show();

    }
}
