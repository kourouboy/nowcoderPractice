package com.kourou.jianzhiOffer.Work6_6_Day16;

import java.util.Scanner;

/**
 * 统计同成绩学生人数
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();//人数
            int[] num = new int[n];//保存分数
            if (n == 0){
                return;
            }
            for (int i = 0; i <num.length ; i++) {
                num[i] = in.nextInt();
            }
            int x = in.nextInt();//目标分数
            int count = 0;//出现次数
            for (int i = 0; i <num.length ; i++) {
                if (x == num[i])
                    count++;
            }
            System.out.println(count);
        }
    }
}
