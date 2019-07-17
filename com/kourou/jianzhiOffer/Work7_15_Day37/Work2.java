package com.kourou.jianzhiOffer.Work7_15_Day37;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            //剩余的体力
            int p = in.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
        }
    }
    public static void find(int n ,int m ,int[][] arr){

    }
}
