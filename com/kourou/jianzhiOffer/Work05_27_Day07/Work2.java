package com.kourou.jianzhiOffer.Work05_27_Day07;

import java.util.Scanner;

/**
 * 求最小公倍数
 */
public class Work2 {
    public static int lcm(int m ,int n){
        return (m * n) / gcd(m,n);
    }
    private static int gcd(int a ,int b){
        if (b == 0){
            return a;
        }else {
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println(lcm(A,B));
    }
}
