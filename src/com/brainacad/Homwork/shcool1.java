package com.brainacad.Homwork;

import java.util.Scanner;

/**
 * Created by Anton on 15.11.2016.
 */
class shool1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество школьников   ");
        int n = sc.nextInt();
        System.out.println("Введите количество яблок   ");
        int k = sc.nextInt();
        int x = k / n;
        int y = k % n;
        System.out.println("Каждому школьнику достанется яблок  " + x);
        System.out.println("В Корзине осталось " + y);
    }
}