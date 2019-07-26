package com.kourou.jianzhiOffer.Work7_25_Day46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created by kourou on 2019/7/26
 */
public class Work1 {
    /**
     * 方法一
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution1(int[] array) {
        Arrays.sort(array);
        int mid = array.length/2;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[mid])
                count++;
        }
        if (count > mid){
            return array[mid];
        }else {
            return 0;
        }
    }

    /**
     * 方法二
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution2(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i]) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()*2 > array.length){
                return entry.getKey();
            }
        }
        return 0;
    }
}
