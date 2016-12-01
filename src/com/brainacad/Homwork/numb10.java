package com.brainacad.Homwork;

import java.util.*;

/**
 * Created by Anton on 15.11.2016.
 */
public class numb10 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое четырехзначное число  ");
        int x = sc.nextInt();
        int p = (x / 1000);
        int t = (x / 100) % 10;
        int y = (x % 100) / 10;
        int i = x % 10;
        int q = p + t;
        int w = y + i;

        if (q != w) {
            System.out.println("Не семетричное число");
        } else if (t == y) {
            System.out.println("Симетричное число");
        } else if (p == i) {
            System.out.println("Симетричное число");
        } else if (t != y) {
            System.out.println("Не семетричное число");
        } else if (p != i) {
            System.out.println("Не семетричное число");
        }
    }
}
//        if (p == 0) {
//            System.out.println(1);
//        } else {
//            System.out.println("не целое число");
//        }
//        System.out.println("Повторно введите значения");
//        Scanner ca = new Scanner(System.in);
//        System.out.println("Введите любое число  ");
//        double c = ca.nextInt();
//        System.out.println("Введите любое число  ");
//        double v = ca.nextInt();
//        double t = (v % c);
//        if (t == 0) {
//            System.out.println(1);
//        } else {
//            System.out.println("не целое число");
//
//
//        }
//    }
//}
