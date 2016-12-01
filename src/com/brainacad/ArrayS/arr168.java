package com.brainacad.ArrayS;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anton on 22.11.2016.
 */
public class arr168 {
    public static void main(String[] arg) {
        float[] b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение длины масива  ");
        int n = sc.nextInt();
        b = new float[n];
        double sum = 1;
        for (int i = 0; i < b.length; i++) {
            System.out.println("a[" + i + "] = ");
            b[i] = sc.nextFloat();
        }
        for (int r = 0; r < b.length; r +=2) {
            float tmp = b[r];
            b[r] = b[r + 1];
            b[r + 1] = tmp;
            System.out.println(Arrays.toString(b));
        }
    }
}