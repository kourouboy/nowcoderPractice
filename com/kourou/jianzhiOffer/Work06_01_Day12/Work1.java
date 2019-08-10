package com.kourou.jianzhiOffer.Work06_01_Day12;
import java.util.*;
/**
 * @Author： kourou
 * @Data： 2019/8/10 23:35
 * @Description：
 */
public class Work1{
    public int[] exchangeAB(int[] AB) {
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }
}