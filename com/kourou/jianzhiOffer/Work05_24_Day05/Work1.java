package com.kourou.jianzhiOffer.Work05_24_Day05;

import java.util.Scanner;

/**
 * 神奇的口袋
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i <= n ; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(count(a,n,40));
    }
    public static int count(int[] arr,int i,int s){
        if (s == 0){
            return 1;
        }
        else if (i == 1){
            if (arr[i] == s){
                return 1;
            }else {
                return 0;
            }
        }
        else if (arr[i] > s){
            return count(arr,i-1,s);
        }
        else {
            return count(arr,i -1,s - arr[i]) + count(arr,i -1,s);
        }
    }
}
