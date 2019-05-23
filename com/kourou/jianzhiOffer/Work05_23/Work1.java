package com.kourou.jianzhiOffer.Work05_23;

import java.util.Scanner;

/**
 * 字符串中找出连续最长的数字串
 */
public class Work1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            //经过数字长度的最大值
            int max = 0;
            //数字计数器,当遇到字母时重置为0
            int count = 0;
            //数字尾部
            int end = 0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    count++;
                    if (max<count){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }

}
