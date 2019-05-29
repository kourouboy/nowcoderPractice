package com.kourou.jianzhiOffer.Work05_25_Day06;

import java.util.Scanner;

/**
 * 计算糖果
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c;
        while (in.hasNextInt()){
            int p1 = in.nextInt();
            int p2 = in.nextInt();
            int p3 = in.nextInt();
            int p4 = in.nextInt();
            a = (p1 + p3) / 2f;
            b = (p3 - p1) / 2f;
            c = (p4 - p2) / 2f;

            if ((a -  ((p1 + p3) / 2)) != 0){
                System.out.println("不符合");
                return;
            }
            if ((b - ((p3 - p1) / 2) != 0) || (b != ((p2 + p4) / 2))){
                System.out.println("不符合");
                return;
            }
            if ((c - ((p4 - p2) / 2)) != 0){
                System.out.println("不符合");
                return;
            }
            System.out.println((int)a + "、" + (int)b + "、" + (int)c);
        }
    }
}
