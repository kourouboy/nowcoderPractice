package com.kourou.jianzhiOffer.Work6_4_Day14;

import java.util.Scanner;

/**
 * 尼科彻斯定理
 * 任何一个整数m的立方都可以写成m个连续奇数之和
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int input = in.nextInt();
            System.out.println(getResult(input));
        }
    }
    public static String getResult(int n){
        if (n < 1 && n > 100){
            return null;
        }
        int a = n*n - n + 1;
        int result = a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a);
        for (int i = 1; i < n; i++) {
            a = a + 2;
            stringBuffer = stringBuffer.append("+").append(a);
        }
        return stringBuffer.toString();
    }
}
