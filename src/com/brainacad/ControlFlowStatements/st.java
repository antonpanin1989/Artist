package com.brainacad.ControlFlowStatements;

import java.util.Scanner;

/**
 * Created by Anton on 20.11.2016.
 */
public class st {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение числа");
        int x = sc.nextInt();
        System.out.println("Введите значение числа");
        int q = sc.nextInt();
        System.out.println("Введите значение числа");
        int w = sc.nextInt();
        System.out.println("Введите значение числа");
        int e = sc.nextInt();
        System.out.println("Введите значение степени  ");
        int y = sc.nextInt();
        double z = (Math.pow(x, y) + Math.pow(q, y) + Math.pow(w, y) + Math.pow(e, y));
        System.out.println(z);
    }
}