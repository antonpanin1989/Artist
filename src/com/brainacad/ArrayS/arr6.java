package com.brainacad.ArrayS;

import java.util.Scanner;

/**
 * Created by Anton on 21.11.2016.
 */
public class arr6 {
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
        for (int r = 0; r < b.length; r++) {
            float e = b[r]%2;
            if (e==0){
                sum *=b[r];
            }
        }
        System.out.println("Произведение четных элементов масива  " + sum);
    }
}
