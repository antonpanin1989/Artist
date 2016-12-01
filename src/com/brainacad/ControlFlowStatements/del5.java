package com.brainacad.ControlFlowStatements;

import java.util.Scanner;

/**
 * Created by Anton on 20.11.2016.
 */
public class del5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        int a = sc.nextInt();
        int i = 0;
        int sum =0;
        while (i <= a) {
            double x = i % 5;
            if (x == 0) {
                sum += i;
                System.out.println("Числа которые деляться на 5 без остатка  " + i);
            }
            i++;
        }
        System.out.println("Сумма всех цифр, которые делятся на 5 без остатка  " + sum);
    }
}
