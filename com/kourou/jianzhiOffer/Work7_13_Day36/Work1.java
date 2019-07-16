package com.kourou.jianzhiOffer.Work7_13_Day36;

import java.util.HashMap;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] chars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < chars.length; i++) {
            hashMap.put(chars[i],0);
        }
        for (int i = 0; i < ch.length; i++) {
            if (hashMap.containsKey(ch[i])){
                count = hashMap.get(ch[i]);
                hashMap.put(ch[i],count + 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + ":" + hashMap.get(chars[i]));
        }
    }
}
