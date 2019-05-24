package com.kourou.jianzhiOffer.Work05_23;

import java.util.Stack;

/**
 * 合法括号序列判断
 */
public class Work2 {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<Character>();
        if (A == null || A.length() != n){
            return false;
        }
        for (int i = 0; i < n ; i++) {
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else if (A.charAt(i) == ')'){
                if (stack.empty()){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if (!stack.empty()){
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[] args) {

        Work2 work2 = new Work2();
        System.out.println(work2.chkParenthesis("()()",4));

    }
}
