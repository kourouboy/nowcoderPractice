package com.kourou.jianzhiOffer.Work05_31_Day11;

/**
 * 1.
 * 原始冒泡
 */
public class Work1 {
    public static void BubbleSort(int[] array) {
        if (array.length <= 1) {
            return;
        } else {
            int n = array.length;
            //控制比较次数
            for (int i = 0; i < n; i++) {
                //两两交换比较
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}