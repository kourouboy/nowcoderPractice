package com.kourou.jianzhiOffer.Work_6_12_Day21;

import java.util.Scanner;

/**
 * 统计每个月兔子的总数
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(getTotalCount(n));
        }
        in.close();
    }

    /**
     *统计兔子的总数
     * @param mouthCount  第几个月
     * @return  兔子总数
     */
    public static int getTotalCount(int mouthCount){
        if (mouthCount < 3){
            return 1;
        }else {
            return getTotalCount(mouthCount - 1) + getTotalCount(mouthCount - 2);
        }
    }

}
