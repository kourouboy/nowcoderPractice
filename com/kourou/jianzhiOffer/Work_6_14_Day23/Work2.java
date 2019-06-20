package com.kourou.jianzhiOffer.Work_6_14_Day23;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 数字分类
 */
public class Work2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num[] = new int[N];
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        double A4 = 0.0f;
        int A5 = 0;
        int count = 0;
        int j = 0;
        for (int i = 0; i < N; i++) {
            num[i] = in.nextInt();
            //A1
            if (num[i] % 5 == 0){
                if(num[i] % 2 == 0)
                    A1 += num[i];
            }
            //A2
            if (num[i] % 5 == 1){
                A2 += (int) (num[i] * Math.pow(-1,j));
                j++;
            }
            //A3
            if (num[i] % 5 == 2){
                A3++;
            }
            //A4
            if (num[i] % 5 == 3){
                A4 += num[i];
                count++;
            }
            //A5
            if (num[i] % 5 == 4){
//                if (num[i] > A5);
//                A5 = num[i];
                A5 = num[i] > A5 ? num[i] : A5;
            }
        }
        if (A1 != 0){
            System.out.print(A1 + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A2 != 0){
            System.out.print(A2 + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A3 != 0){
            System.out.print(A3 + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A4 != 0){
            DecimalFormat df =new java.text.DecimalFormat("#.0");
            System.out.print(df.format(A4/count) + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A5 != 0){
            System.out.print(A5);
        }else {
            System.out.print('N');
        }
    }
}
