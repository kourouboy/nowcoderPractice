package com.kourou.jianzhiOffer;

import sun.text.normalizer.Replaceable;

public class replaceSpace {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("hello world");
        replaceSpace replaceSpace = new replaceSpace();
        System.out.println(replaceSpace.Replace(stringBuffer));
    }
    public String Replace (StringBuffer str){
        if(str == null){
            return null;
        }
        int len = str.length();
        int begin_index = str.indexOf(" ");
        while(begin_index != -1){
            str.replace(begin_index,begin_index +1,"%20");
            begin_index = str.indexOf(" " ,begin_index);
        }
        String s = new String(str);
        return s;
    }
}
//运行结果 ：hello%20world