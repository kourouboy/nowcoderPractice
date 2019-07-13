package com.kourou.jianzhiOffer.Work7_11_Day34;
/**
 * 球的半径和体积
 */

import java.util.Scanner;
import java.lang.Math;

public class Work1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            double x0 = in.nextFloat();
            double y0 = in.nextFloat();
            double z0 = in.nextFloat();
            double x1 = in.nextFloat();
            double y1 = in.nextFloat();
            double z1 = in.nextFloat();
            System.out.printf("%.3f",Radius(x0,y0,z0,x1,y1,z1));
            System.out.print(" ");
            System.out.printf("%.3f",Volume(x0,y0,z0,x1,y1,z1));
            System.out.println();
        }
        in.close();
    }

    public static double Radius(double x0,double y0,double z0,double x1 ,double y1, double z1){
        double radius = 0;
        double sum = (x1 - x0)*(x1 - x0) + (y1 - y0)*(y1 - y0) + (z1 - z0)*(z1 - z0);
        radius = Math.sqrt(sum);
        return radius;
    }
    public static double Volume(double x0,double y0,double z0,double x1 ,double y1, double z1){
        double volume = 0;
        double r = Radius(x0,y0,z0,x1,y1,z1);
        volume = 4*Math.acos(-1)*Math.pow(r,3)/3;
        return volume;
    }

}
