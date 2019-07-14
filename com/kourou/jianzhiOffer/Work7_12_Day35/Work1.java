package com.kourou.jianzhiOffer.Work7_12_Day35;
import java.lang.Math;
public class Work1 {
    public static void main(String[] args) {
        long rich = 0;
        long stranger = 0;
        rich =  10 * 30;
        for (int i = 1; i <= 30; i++) {
            stranger = (long) (stranger + Math.pow(2,i -1));
        }
        System.out.println(rich);
        System.out.println(stranger);

    }
}
