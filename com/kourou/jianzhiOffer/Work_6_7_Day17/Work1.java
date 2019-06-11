package com.kourou.jianzhiOffer.Work_6_7_Day17;

import java.util.*;

/**
 *火车进站
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //火车数量
            int n = in.nextInt();
            //火车编号
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = in.nextInt();
            }
            int start = 0;
            //计算N个火车的出站的编号的排列组合
            ArrayList<int[]> result = new ArrayList<>();
            Permutation(A, start, n, result);
            //出栈的结果，一个元素一个记录，
            Set<String> sortresult = new TreeSet<>();
            //循环排列组合
            for (int[] out : result) {
                //判断是否满足出栈要求（现金先出）
                if (isegal(A, out, n)) {
                    //满足的组合，输入结果，每个编号用空格分开
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < n - 1; i++) {
                        sb.append(out[i] + " ");
                    }
                    sb.append(out[n - 1]);
                    sortresult.add(sb.toString());
                }
            }
            //输出所有符合要求的组合
            for (String list : sortresult) {
                System.out.println(list);
            }
        }
        in.close();
    }
    /**
     *
     * @param in 火车编号数组
     * @param out 火车出站顺序
     * @param n 火车数量
     * @return
     */
    private static boolean isegal(int[] in,int[] out, int n){
        //栈：存储进站的火车编号
        LinkedList<Integer> stack = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < n){//in 还有元素的时候都需要判断
            if (in[i] == out[j]){//相等的时候就不用入栈，直接后移
                i++;
                j++;
            }else {
                if (stack.isEmpty()){//空stack，就只有入栈
                    stack.push(in[i]);
                    i++;
                }else {
                    int top = stack.peek();//栈顶元素相等，进行出栈
                    if (top == out[j]){
                        j++;
                        stack.pop();
                    }else if(i < n){//不相等的时候入栈，说明还有待进站的车
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while (!stack.isEmpty() && j < n){
            int top = stack.pop();
            if (top == out[j])
                j++;
            return false;
        }
        return true;
    }

    /**
     * 求出所有排列
     * @param A
     * @param start
     * @param n
     * @param result
     */
    private static void Permutation(int[] A,int start,int n,ArrayList<int[]> result){
        if (start == n){
            return;
        }
        if (start == n - 1){
            int[] B = A.clone();
            result.add(B);
            return;
        }
        for (int i = start; i <n; i++) {
            swap(A,start,i);
            Permutation(A,start+1,n,result);
            swap(A,start,i);
        }
    }
    private static void swap(int[] A,int i,int j){
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}
