package com.kourou.jianzhiOffer.Work7_22_Day43;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 求和
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayList.add(i);
                count(m,n,i,arrayList);
                arrayList.remove(i);
            }
        }
    }
    public static void count(int m,int n,int sum,ArrayList arrayList){
        if (n > m){
            return;
        }else if (n == m){

        }
    }
}
