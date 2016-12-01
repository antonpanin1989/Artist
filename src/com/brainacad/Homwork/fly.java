package com.brainacad.Homwork;

import java.util.*;
/**
 * Created by Anton on 15.11.2016.
 */
public class fly {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Начальная скорость палета V");
        double V = sc.nextInt();
        System.out.println("Начальное время полета тела T");
        double T = sc.nextInt();
        double g = 9.8;
        double a = Math.asin((g*T)/(2*V));
        System.out.println(a);


    }

}
