package com.kourou.jianzhiOffer.Work05_24_Day05;

import java.util.Stack;

public class Work2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);
    }

    public int pop() {

        if (stack2.size() <= 0){
            while (stack1.size() > 0){
                int data = stack1.peek();
                stack1.pop();
                stack2.push(data);
            }
        }
        int head = stack2.peek();
        stack2.pop();
        return head;
    }
}
