//package com.brainacad.ArrayS;
//
//import java.util.Scanner;
//
///**
// * Created by Anton on 21.11.2016.
// */
//public class arr4 {
//
//        public static void main(String[] arg) {
//            float[] b;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Введите значение длины массива   ");
//            int n = sc.nextInt();
//            System.out.println("Введите значение x   ");
//            int r = sc.nextInt();
//            b = new float[n];
//            for (int i = 0; i < b.length; i++) {
//                System.out.println("a[" + i + "] = ");
//                b[i] = sc.nextFloat();
//            }
//
//            float max = b[0];
//            for (int i = 0; i < b.length; i++) {
//                if (max < b[i]) {
//                    max = b[i];
////
////                float sum = 0;
////                for (int i = 0; i < a.length; i++) {
////                    if (Math.abs(a[i]) > 2.5) {
////                        //sum += a[i] * a[i];
////                        sum += Math.pow(a[i], 2);
////                    }
////                }
////
//////                    1.6.8 for (i = 0; i < b.length; i++) {
////                        float tmp = b[1];
////                        b[i] = b[i + 1];
////                        b[1 + 1] = tmp;
////
////                        System.out.println(Arrays.toString(b));
//                }
//                System.out.println("max" + max);
//            }
//
//        }
//
//    }public static void main(String[] args) {
//    int n = 350;
//
//    String hex = "";
//
//    while (n != 0) {
//        int num = n % 16;
//        if (num <= 9) {
//            hex = num + hex;
//        } else {
//            char c = 0;
//            switch (num) {
//                case 10:
//                    c = 'A';
//                    break;
//                case 11:
//                    c = 'B';
//                    break;
//                case 12:
//                    c = 'C';
//                    break;
//                case 13:
//                    c = 'D';
//                    break;
//                case 14:
//                    c = 'E';
//                    break;
//                case 15:
//                    c = 'F';
//                    break;
//
//            }
//            //hex = ((char) ((int) 'A' + (num - 10))) + hex;
//            hex = c + hex;
//        }
//
//        n = n / 16;
//    }
//
//    System.out.println(hex);
//    //int a[] = new int[]{ 5, 6, 3, 4, 2, 1 };
//    //print(a);
//
//}public static void main(String[] args) {
//        int n = 350;
//
//        String hex = "";
//        char[] hexs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//
//        while (n != 0) {
//        int num = n % 16;
//        char c = hexs[num];
//        hex = c + hex;
//        n = n / 16;
//        }
//
//        System.out.println(hex);
//        //int a[] = new int[]{ 5, 6, 3, 4, 2, 1 };
//        //print(a);
//
//        }
//public class Hw168 {
//    public static void main(String[] args) {
//        int[] a = {2, 5, 4, 2, 2, 7, 8, 5, 1,};
//        int c = 0;
//        int x = 2;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == x) {
//
//                c = c + 1;
//
//
//            }
//        }
//        System.out.println("Число x встречается в массиве " + c + " раз");
//    }
//}
//1 Comment Collapse
//        168
//
