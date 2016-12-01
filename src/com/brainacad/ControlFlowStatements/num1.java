package com.brainacad.ControlFlowStatements;

import java.util.Scanner;

/**
 * Created by Anton on 19.11.2016.
 */
public class num1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое двузначное число  ");
        int a = sc.nextInt();
        int x = a / 10;
        int y = a % 10;
        if (x > y) {
            System.out.println("Большее число " + x);
            System.out.println("Меньшее число " + y);
        } else if (x == y) {
            System.out.println("Значения цифр в составе числа равны");
        } else {
            System.out.println("Большее число " + y);
            System.out.println("Меньшее число " + x);
        }
    }

}