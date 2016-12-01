package com.brainacad.ArrayS;

import java.util.Scanner;

/**
 * Created by Anton on 21.11.2016.
 */
public class arr3 {

    public static void main(String[] arg) {
        float[] b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение длины массива   ");
        int n = sc.nextInt();
        b = new float[n];
        for (int i = 0; i < b.length; i++) {
            System.out.println("a[" + i + "] = ");
            b[i] = sc.nextFloat();
        }

        for (int i = 0; i < b.length; i++) {
            int e = i % 2;
            if (e == 0) {
                System.out.println(b[i]);
            }
        }
    }
}

