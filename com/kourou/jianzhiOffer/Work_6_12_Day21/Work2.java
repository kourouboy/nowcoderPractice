package com.kourou.jianzhiOffer.Work_6_12_Day21;

import java.util.Scanner;

/**
 *最难的问题
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String n = in.nextLine();
            char[] chars = n.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if ('A' <= c){
                    c = (char) ('E' < c ? (c - 5) : (c + 21));
                    chars[i] = c;
                }
            }
            System.out.println(new String(chars));
        }
    }
}
