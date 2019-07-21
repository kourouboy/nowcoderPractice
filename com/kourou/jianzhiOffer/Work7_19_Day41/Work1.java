package com.kourou.jianzhiOffer.Work7_19_Day41;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int max = arr[0];
            int sum = arr[0];
            for (int i = 0; i < n; i++) {
                if (sum >= 0){
                    sum += arr[i];
                }else {
                    sum = arr[i];
                }
                if (sum > max)
                    max = sum;
            }
            System.out.println(max);
        }
    }
}
