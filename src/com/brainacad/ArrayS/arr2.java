package com.brainacad.ArrayS;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Anton on 15.11.2016.
 */
public class arr2 {

    public static void main(String[] arg) {
        float[] b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение длины массива   ");
        int n = sc.nextInt();
        b = new float[n];
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            System.out.println("a[" + i + "] = ");
            b[i] = sc.nextFloat();
        }
        for (int e = 0; e < b.length; e++) {
            sum += b[e];
        }
        System.out.println("среднее арифметическое  " + sum/n);
    }
}








