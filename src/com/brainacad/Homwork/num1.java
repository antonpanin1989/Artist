package com.brainacad.Homwork;

import java.util.*;
/**
 * Created by Anton on 15.11.2016.
 */
public class num1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int x = sc.nextInt();
        int y = x % 10;
        System.out.println("Последняя цифра   " + y);
    }
}