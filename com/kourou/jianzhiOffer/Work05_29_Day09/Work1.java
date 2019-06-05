package com.kourou.jianzhiOffer.Work05_29_Day09;

import java.util.Scanner;

/**
 * 末尾0的个数
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for (int i = n; i >= 5; i--) {
            int temp = i;
            while (temp % 5 == 0){
                result++;
                temp /= 5;
            }
        }
        System.out.println(result);
    }
}
