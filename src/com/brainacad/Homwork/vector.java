package com.brainacad.Homwork;

import java.util.*;
/**
 * Created by Anton on 15.11.2016.
 */
public class vector {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение первого вектора x  ");
        Integer x = sc.nextInt();
        System.out.println("Введите значение первого вектора y  ");
        Integer y = sc.nextInt();
        System.out.println("Введите значение первого вектора z  ");
        Integer z = sc.nextInt();
        double ZZ = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        System.out.println(ZZ);

    }
}
