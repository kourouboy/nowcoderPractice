package com.kourou.jianzhiOffer.Work7_23_Day44;

import java.util.Scanner;


/**
 * created by kourou on 2019/7/25
 * 骆驼命名法
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '_'){
                    i++;
                    char ch = (char) (str.charAt(i) - 32);
                    stringBuilder.append(ch);
                }else {
                    stringBuilder.append(str.charAt(i));
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
