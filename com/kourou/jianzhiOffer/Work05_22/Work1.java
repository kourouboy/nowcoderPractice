package com.kourou.jianzhiOffer.Work05_22;

import java.util.Scanner;

/**
 *汽水瓶
 */
public class Work1 {
    public static int drink(int n){
        int sum = 0;//能换的饮料总数
        //当大于两个空瓶的时候才可以换饮料
        while(n > 2){
            //当前能够换来饮料的个数 》n/3
            sum += n/3;
            //新的空瓶个数 》n%3可能会不能整除
            n = n/3 + n%3;
        }
        //如果n==2，说明有两个空瓶可以向商家借一瓶，喝完了刚好换一瓶
        if(n == 2){
            sum += 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()){
            n = in.nextInt();
            System.out.println(drink(n));
        }

    }
}
