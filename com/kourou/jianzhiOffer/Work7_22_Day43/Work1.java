package com.kourou.jianzhiOffer.Work7_22_Day43;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Work1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.next();
            }
            Set<String> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(Change(arr[i]));
            }
            for (String str : set) {
                System.out.println(str);
            }
            System.out.println();
        }
        in.close();
    }

    public static String Change(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            if (value == '-') {
                continue;
            }if (value == 'A' || value == 'B' || value == 'C') {
                value = '2';
            } else if (value == 'D' || value == 'E' || value == 'F') {
                value = '3';
            } else if (value == 'G' || value == 'H' || value == 'I') {
                value = '4';
            } else if (value == 'J' || value == 'K' || value == 'L') {
                value = '5';
            } else if (value == 'M' || value == 'N' || value == 'O') {
                value = '6';
            } else if (value == 'P' || value == 'Q' || value == 'R' || value == 'S') {
                value = '7';
            } else if (value == 'T' || value == 'U' || value == 'V') {
                value = '8';
            } else if (value == 'W' || value == 'X' || value == 'Y' || value == 'Z') {
                value = '9';
            }
            stringBuilder.append(value);
        }
        return stringBuilder.substring(0,3) + "-" + stringBuilder.substring(3);
    }
}
