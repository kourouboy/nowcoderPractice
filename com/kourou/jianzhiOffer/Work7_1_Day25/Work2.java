package com.kourou.jianzhiOffer.Work7_1_Day25;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 计票统计
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //候选人人数
            int n = in.nextInt();
            String[] s = new String[n];
            //记录候选人
            HashMap<String,Integer> hashMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String temp = in.next();
                hashMap.put(temp,0);
                s[i] = temp;
            }
            //投票人数
            int m = in.nextInt();
        }
    }
}
