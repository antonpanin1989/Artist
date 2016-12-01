package com.brainacad.ArrayS;

import java.util.Scanner;

/**
 * Created by Anton on 21.11.2016.
 */
public class arr5 {
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

        float max = b[0];
        for (int i = 0; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        System.out.println(max);
    }
}