package com.kourou.jianzhiOffer.Work7_26_Day47;

import java.util.Scanner;

/**
 * created by kourou on 2019/7/27
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //总人数
            int n = in.nextInt();
            //学生能力值数组，第i个人直接对应arr[i]
            int[] arr = new int[n + 1];
            //选择的学生数
            int k = in.nextInt();
            //间隔距离
            int d = in.nextInt();
            for (int i = 1; i < n; i++) {
                arr[i] = in.nextInt();
            }
            //动态规划
            long[][] f = new long[n + 1][k + 1];
            long[][] g = new long[n + 1][k + 1];
        }
    }
}
