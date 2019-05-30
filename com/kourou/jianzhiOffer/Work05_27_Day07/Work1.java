package com.kourou.jianzhiOffer.Work05_27_Day07;

/**
 * 不要二（网格蛋糕问题）
 */

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int count = 0;
            if (W%4==0 || H%4==0){
                count = W*H/2;
            }else if (W%2==0 && H%2==0){
                count = (W*H/4+1)*2;
            }else {
                count = W*H/2+1;
            }
            System.out.println(count);
    }
}
