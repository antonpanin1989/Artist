package com.brainacad.ControlFlowStatements;

import java.util.*;

/**
 * Created by Anton on 20.11.2016.
 */

public class dayweek {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение числа дня недели");
        int x = sc.nextInt();
                switch (x){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
            case 7:
                System.out.println("Воскресенье");

        }

    }
}
