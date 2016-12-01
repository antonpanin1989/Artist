package com.brainacad.Homwork;

import java.util.*;
/**
 * Created by Anton on 15.11.2016.
 */
public class num5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число  ");
        int x = sc.nextInt();
        double y = x/100;
        double z = x%100;

        System.out.print(z);
        System.out.println(y);



    }
}
