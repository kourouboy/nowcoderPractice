package com.kourou.jianzhiOffer.Work7_2_Day26;

import java.util.Scanner;

/**
 * 数字之和
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n*n;
        System.out.print(DegitalSum(n));
        System.out.print(" " + DegitalSum(m));
    }
    public static int DegitalSum(int a){
        int sum = 0;
        while (a > 0){
            sum = sum + a%10;
            a = a / 10;
        }
        return sum;
    }
}
