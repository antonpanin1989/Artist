package com.brainacad.ControlFlowStatements;

import java.util.Scanner;

/**
 * Created by Anton on 20.11.2016.
 */
public class tr {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение от 1 до 6");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("  *  ");
                System.out.println(" *** ");
                System.out.println("****");
                break;
            case 2:
                System.out.println("  *      *");
                System.out.println(" ***    ***");
                System.out.println("*****  *****");
                break;
            case 3:
                System.out.println("  *      *      *");
                System.out.println(" ***    ***    ***");
                System.out.println("*****  *****  *****");
                break;
            case 4:
                System.out.println("  *      *     *      *");
                System.out.println(" ***    ***   ***    ***");
                System.out.println("*****  ***** *****  *****");
                break;
            case 5:
                System.out.println("  *      *     *      *      *");
                System.out.println(" ***    ***   ***    ***    ***");
                System.out.println("*****  ***** *****  *****  ******");
                break;
            case 6:
                System.out.println("  *      *     *      *     *      *");
                System.out.println(" ***    ***   ***    ***   ***    ***");
                System.out.println("*****  ***** *****  ***** *****  *****");
                break;

        }
    }
}