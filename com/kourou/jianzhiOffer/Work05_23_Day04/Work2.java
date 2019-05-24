package com.kourou.jianzhiOffer.Work05_23_Day04;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Scanner;

/**
 * 删除公共字符
 */

public class Work2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        for (int i = 0; i < str2.length(); i++) {
            String temp = String.valueOf(str2.charAt(i));
            str1 = str1.replaceAll(temp,"");
        }
        System.out.println(str1);
    }
}
