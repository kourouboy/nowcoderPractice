package com.kourou.jianzhiOffer.Work05_21;

import java.util.Scanner;

/**
 *统计回文
 */
public class Work1 {
    //判断是否为回文链表
    public static boolean judge(String str){
//        for (int i = 0; i <str.length()/2 ; i++) {
//            for(int j = str.length()-1;j > str.length()/2;j--){
//                if(str.charAt(i) != (str.charAt(j))){
//                    return false;
//                }
//            }
//        }
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.toUpperCase().charAt(i) != str.toUpperCase().charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int count = 0;
        for (int i = 0; i <= str1.length() ; i++) {
            StringBuilder stringBuilder = new StringBuilder(str1);
            stringBuilder.insert(i,str2);
            if(judge(stringBuilder.toString().toUpperCase()) == true){
                System.out.println(stringBuilder);
                count++;
            }
        }
        System.out.println(count);
    }
}
