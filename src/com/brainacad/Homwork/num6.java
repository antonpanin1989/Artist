package com.brainacad.Homwork;

import java.util.*;

/**
 * Created by Anton on 15.11.2016.
 */
public class num6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        double x = sc.nextInt();
        System.out.println("Введите любое число  ");
        double y = sc.nextInt();
        double p = (x % y);
        if (p == 0) {
            System.out.println(1);
        } else {
            System.out.println("не целое число");
        }
        System.out.println("Повторно введите значения");
        Scanner ca = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        double c = ca.nextInt();
        System.out.println("Введите любое число  ");
        double v = ca.nextInt();
        double t = (v % c);
        if (t == 0) {
            System.out.println(1);
        } else {
            System.out.println("не целое число");


        }
    }
}