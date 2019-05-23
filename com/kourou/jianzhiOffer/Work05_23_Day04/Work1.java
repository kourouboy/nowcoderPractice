package com.kourou.jianzhiOffer.Work05_23_Day04;

import java.util.Scanner;

/**
 * 买苹果
 */
public class Work1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        if(n % 2 != 0 || n == 10 || n < 6){
            System.out.println(-1);
        }else if (n % 8 == 0){
            count = n / 8;
            System.out.println(count);
        }else {
            System.out.println(1+n/8);
        }
    }
}
