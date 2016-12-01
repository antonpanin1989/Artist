package com.brainacad.Homwork;

import java.util.*;
/**
 * Created by Anton on 15.11.2016.
 */
public class in5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number in range");
        int x = sc.nextInt();
        int y = x/10000;
        int z = (x/1000) % 10;
        int u = (x%1000)/100;
        int p = (x%100)/10;
        int n = x%10;
        System.out.println(y);
        System.out.println(z);
        System.out.println(u);
        System.out.println(p);
        System.out.println(n);
        }
}
