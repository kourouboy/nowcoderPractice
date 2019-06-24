package com.kourou.jianzhiOffer.Work05_30_Day10;

import java.util.Scanner;

/**
 * 机器人走方格
 */
public class Work2 {
    public int Robot(int x,int y){
        if (x == 1 || y == 1)
            return 1;
        return Robot(x - 1,y) + Robot(x,y - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();


    }
}
