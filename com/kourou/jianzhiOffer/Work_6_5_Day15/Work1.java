package com.kourou.jianzhiOffer.Work_6_5_Day15;

import java.util.Scanner;

/**
 * 另类加法
 */
public class Work1{
    public int addAB(int A, int B) {
        // write code here
          A ^= B;
          B ^= A;
          A ^= B;

        return A + B;
    }

    public static void main(String[] args) {

    }
}
