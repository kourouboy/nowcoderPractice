package com.kourou.to_360;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/8/11 20:05
 * @Description： 城市修建
 * 到x轴最小和最大值的差，得到y轴最小和最大值的差
 * 比较两者，得到最大的那个，用它平方即可
 */
public class CityBulid {
    public static long Way(long x[],long y[]){
        Arrays.sort(x);
        Arrays.sort(y);
        if (x.length < 2 || y.length < 2)
            return 0;
        long x_length = Math.abs(x[x.length - 1] - x[0]);
        long y_length = Math.abs(y[y.length - 1] - y[0]);
        return Math.max(x_length,y_length);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            long x[] = new long[N];
            long y[] = new long[N];
        for (int i = 0; i < N; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        long res = Way(x,y);
        System.out.println(res*res);
    }
}
