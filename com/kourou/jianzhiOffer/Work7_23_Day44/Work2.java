package com.kourou.jianzhiOffer.Work7_23_Day44;

import java.util.Scanner;

/**
 * created by kourou on 2019/7/25
 * 单词倒排（中级）
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 'A' || str.charAt(i) < 'a' || str.charAt(i) > 'Z' || str.charAt(i) > 'z') {
                    str.replace(str.charAt(i), ' ');
                }
            }
            String[] str1 = str.split(" ");
            for (int j = str1.length - 1; j >= 0; j--) {
                System.out.print(str1[j] + " ");
            }
        }
    }
}
