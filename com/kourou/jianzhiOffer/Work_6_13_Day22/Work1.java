package com.kourou.jianzhiOffer.Work_6_13_Day22;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 到底买不买
 */
 //ArrayList保存摊主有的珠子，然后在循环查询小红想买的珠子，如果该摊主的珠串上有该颜色
 //则将ArrayList中该下标的颜色珠子移除，再查找剩余颜色的珠子。
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.next();
            String str2 = in.next();
            LinkedList<Character> list = new LinkedList<Character>();
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                list.add(ch);
            }
            int count = 0;
            for (int i = 0; i <str2.length() ; i++) {
                char ch = str2.charAt(i);
                for (int j = 0; j < list.size(); j++) {
                    if (ch == list.get(j)){
                        list.remove(j);
                        count++;
                        break;
                    }
                }
            }
            if (count == str2.length()) {
                System.out.println("Yes" + " " + (str1.length() - count));
            }else {
                System.out.println("No" + " " + (str2.length() - count));
            }
        }
        in.close();
    }
}
