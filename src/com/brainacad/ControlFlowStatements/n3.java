package com.brainacad.ControlFlowStatements;

import java.util.*;

/**
 * Created by Anton on 15.11.2016.
 */
public class n3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое трехзначное число  ");
        int x = sc.nextInt();
        int p = (x / 100);
        int y = (x / 10) % 10;
        int r = (x % 10);
        if (p == y) {
            System.out.println("Числа   " + p + "  " + y + "  Одинаковые");
        } else if (p == r) {
            System.out.println("Числа   " + p + "  " + r + "  Одинаковые");
        } else if (y == p) {
            System.out.println("Числа   " + y + "  " + p + "  Одинаковые");
        } else if (y == r) {
            System.out.println("Числа   " + y + "  " + r + "  Одинаковые");
        } else if (r == p) {
            System.out.println("Числа   " + r + "  " + p + "  Одинаковые");
        } else if (r == y) {
            System.out.println("Числа   " + r + "  " + y + "  Одинаковые");
        } else if (p != y) {
            System.out.println("Одинаковых чисел нет");
        } else if (p != r) {
            System.out.println("Одинаковых чисел нет");
        } else if (y != r) {
            System.out.println("Одинаковых чисел нет");
        } else if (y != p) {
            System.out.println("Одинаковых чисел нет");
        } else if (r != p) {
            System.out.println("Одинаковых чисел нет");
        } else if (r != y) {
            System.out.println("Одинаковых чисел нет");
        }
    }
}
