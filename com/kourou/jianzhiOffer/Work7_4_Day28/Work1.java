package com.kourou.jianzhiOffer.Work7_4_Day28;

import java.util.Scanner;

/**
 * 守形数
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n * n;
        while (in.hasNext()) {
            if (n < 10) {
                if (m % 10 == n)
                    System.out.println("Yes!");
                else
                    System.out.println("No!");
            } else {
                if (m % 100 == n)
                    System.out.println("Yes!");
                else
                    System.out.println("No!");
            }
        }
    }
}
