package com.brainacad.ControlFlowStatements;

import java.util.*;

/**
 * Created by Anton on 15.11.2016.
 */
public class abc {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        int a = sc.nextInt();
        System.out.println("Введите любое число  ");
        int b = sc.nextInt();
        System.out.println("Введите любое число  ");
        int c = sc.nextInt();
        int s = a + b;
        String i = (s == c) ? "yes" : "no";
        System.out.println(i);
    }
}


