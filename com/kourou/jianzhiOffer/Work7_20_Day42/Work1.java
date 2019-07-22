package com.kourou.jianzhiOffer.Work7_20_Day42;

import java.util.Scanner;

public class Work1 {
    public static int iConverDataToDay(int year,int mouth,int day) {
        int[] Day = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year <= 0 || mouth <= 0 || day <= 0 || mouth > 12 || day > Day[mouth - 1]){
            return -1;
            }
            if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                Day[1] = 29;
            }
            int sum = 0;
            for (int i = 0; i < mouth - 1; i++) {
                sum += Day[i];
            }
            return sum + day;
        }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year = in.nextInt();
            int mouth = in.nextInt();
            int day = in.nextInt();
            int Day = iConverDataToDay(year,mouth,day);
            System.out.println(Day);
        }
        in.close();
    }
}
