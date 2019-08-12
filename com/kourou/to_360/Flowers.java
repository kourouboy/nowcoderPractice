package com.kourou.to_360;

/**
 * @Author： kourou
 * @Data： 2019/8/11 21:08
 * @Description：
 */
public class Flowers{
    public static Test t1=new Test();
    {
        System.out.println("blockA");
    }
    static{
        System.out.println("blockB");
    }
    public static void main(String[] args)
    {
        Test t2=new Test();
    }
}