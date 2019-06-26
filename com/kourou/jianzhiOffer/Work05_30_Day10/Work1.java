package com.kourou.jianzhiOffer.Work05_30_Day10;

import java.util.Scanner;

/**
 * Fibonacci数列
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 0,b = 1,c = 1;
        if (in.hasNextInt()){
            n = in.nextInt();
        }
        while (c < n){
            a = b;
            b = c;
            c = a + b;
        }
        int x = n - b;
        int y = c - n;
        System.out.println(x<y?x:y);
    }
}
