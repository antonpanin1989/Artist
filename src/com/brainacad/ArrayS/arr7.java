package com.brainacad.ArrayS;

import java.util.Scanner;

/**
 * Created by Anton on 21.11.2016.
 */
public class arr7 {
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
        System.out.println("Введите число х, которое нужно найти среди элементов масива");
        int x = sc.nextInt();
        for (int r = 0; r < b.length; r++) {
            String u = (b[r] == x) ? "Искомое число х встречается в масиве" : "";
            System.out.println(u);

        }
    }
}





