package com.kourou.jianzhiOffer.Work05_28_Day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 删数
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int i = in.nextInt();
            if (i > 1000){
                i = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < i; j++) {
                list.add(j);
            }
            int j = 0;
            while (list.size() > 1){
                j = (j + 2) % list.size();
                list.remove(j);
            }
            System.out.println(list.get(0));
        }
    }
}
