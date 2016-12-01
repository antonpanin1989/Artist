package com.brainacad.ArrayS;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Anton on 15.11.2016.
 */
public class arr1 {

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
        for (int r = 0; r < b.length; r++) {
            if (2 <= b[r]) {
                float e = b[r];
                double d = Math.pow(e, 2);
                sum += d;
            }
        }
        System.out.println(sum);
    }

}





