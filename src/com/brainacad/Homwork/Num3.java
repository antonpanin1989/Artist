package com.brainacad.Homwork;

import java.util.*;
/**
 * Created by Anton on 15.11.2016.
 */
public class Num3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите трехзначное число");
        int x = sc.nextInt();
        int y = x / 100;
        int r = (x%100)/10;
        int p = x%10;
        int o = y + r + p;
        System.out.println(y);
        System.out.println(r);
        System.out.println(p);
        System.out.println("Сумма всех цифр в составе введенного числа  " + o);

    }
}