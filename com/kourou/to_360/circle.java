package com.kourou.to_360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/8/11 20:31
 * @Description：圈地运动
 * 假设有n条边，只需要其他n-1条边之和大于最长的那条边就可以构成多边形。
 * 从头到尾统计前n条边之和，与最长边比较即可。没有答案输出-1
 */
public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n < 3)
            System.out.println(-1);
        List<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int length = in.nextInt();
            lengths.add(length);
        }
        for (int i = 2; i < lengths.size(); i++) {
            int sum = 0;
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (lengths.get(j) > max){
                    sum += max;
                    max = lengths.get(j);
                }else {
                    sum += lengths.get(j);
                }
            }
            if (max < sum){
                System.out.println(i + 1);
                break;
            }else if (i == lengths.size() - 1){
                System.out.println(-1);
            }
        }
    }
}
