package com.brainacad.ControlFlowStatements;
import java.util.*;
/**
 * Created by Anton on 20.11.2016.
 */

public class cikl {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение числа  ");
        Integer x = sc.nextInt();
        System.out.println("Введите значение степени  ");
        Integer y = sc.nextInt();
        double a = Math.pow(x, y);
        for (int r = 1; r <= y; r++) {
            double b = Math.pow(x, r);
            System.out.println(b);

        }
    }
}