package com.kourou.jianzhiOffer.Work_6_10_Day19;

/**
 * 子串判断
 */
public class Work1 {
    public static void main(String[] args) {

    }
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] hasSub = new boolean[p.length];
        for (int i = 0; i < p.length; i++) {
            hasSub[i] = s.contains(p[i]);
        }
        return hasSub;
    }

}
