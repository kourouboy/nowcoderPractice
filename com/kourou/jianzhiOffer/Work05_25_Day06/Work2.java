package com.kourou.jianzhiOffer.Work05_25_Day06;

import java.util.Scanner;

/**
 * n个数里出现次数大于等于n/2的数
 */
public class Work2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] strings = str.split(" ");
            int[] arr = new int[str.length()];
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = Integer.valueOf(strings[i]);
            }
            int num = arr[0];
            int count = 0;
            for (int j = 1;j < arr.length;j++){
                if (arr[j] == num){
                    count++;
                }else if (count > 0){
                    count--;
                }else {
                    num = arr[j];
                }
            }
            System.out.println(num);
        }
    }
}
