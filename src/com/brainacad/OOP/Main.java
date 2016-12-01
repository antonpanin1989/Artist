//package com.brainacad.OOP;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
//
///**
// * Created by Anton on 24.11.2016.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] Artist;
//        Artist = new String[6];
//        System.out.println("Введите имена артистов ");
//        for (int i = 0; i <= 5; i++) {
//            Artist[i] = sc.nextLine();
//            System.out.println("Введите имя артиста № " + (i + 1) + "  " + (Artist[i]));
//        }
//
//        Artist a1 = new Artist();
//        a1.setName(Artist[0]);
//
//        Artist a2 = new Artist();
//        a2.setName(Artist[1]);
//
//        Artist a3 = new Artist();
//        a3.setName(Artist[2]);
//
//        Artist a4 = new Artist();
//        a4.setName(Artist[3]);
//
//        Artist a5 = new Artist();
//        a5.setName(Artist[4]);
//
//        Artist a6 = new Artist();
//        a6.setName(Artist[5]);
//
//        Director d1 = new Director();
//        d1.setName("Директор 1");
//        Director d2 = new Director();
//        d2.setName("Директор 2");
//
//        a1.setDirector(d1);
//        a2.setDirector(d1);
//        a3.setDirector(d1);
//        a4.setDirector(d2);
//        a5.setDirector(d2);
//        a6.setDirector(d2);
//
//        System.out.println("Введите артиста для поиска" + "\n");
//        String i = sc.nextLine();
//        String name = i;
////тут можно было через for(){if (a[i].getname().equals(name)sout a[i]
//        if (a1.getName().equals(name)) {
//            System.out.println(a1);
//        } else if (a2.getName().equals(name)) {
//            System.out.println(a2);
//        } else if (a3.getName().equals(name)) {
//            System.out.println(a3);
//        } else if (a4.getName().equals(name)) {
//            System.out.println(a4);
//        } else if (a5.getName().equals(name)) {
//            System.out.println(a5);
//        } else if (a6.getName().equals(name)) {
//            System.out.println(a5);
//        }
//        System.out.println("Список Всех АРТИСТОВ" + "\n");
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(a5);
//        System.out.println(a6);
//
//        System.out.println("Введите директора для поиска Артиста" + "\n");
//        String a = sc.nextLine();
//        String w = a;
//        if (d1.getName().equals(w)) {
//            System.out.println(a1);
//            System.out.println(a2);
//            System.out.println(a3);
//
//        } else if (d2.getName().equals(w)) {
//            System.out.println(a4);
//            System.out.println(a5);
//            System.out.println(a6);
//        }
//
//        System.out.println("Все Артисты в Алфавитном порядке" + "\n");
//
//        Arrays.sort(Artist, String.CASE_INSENSITIVE_ORDER);
//        for (int q = 0; q < Artist.length; q++) {
//
//            if (Artist[q] == a1.getName()) {
//                System.out.println(a1);
//            } else if (Artist[q] == a2.getName()) {
//                System.out.println(a2);
//            } else if (Artist[q] == a3.getName()) {
//                System.out.println(a3);
//            } else if (Artist[q] == a4.getName()) {
//                System.out.println(a4);
//            } else if (Artist[q] == a5.getName()) {
//                System.out.println(a5);
//            } else if (Artist[q] == a6.getName()) {
//                System.out.println(a6);
//
//            }
//
//        }
//    }
//}
//}
//    String name = "Smith";
//    Artist artist = new Artist();
//      artist.setName("John");
//              if(artist.getName().equals(name)){
//              System.out.println(artist);
//              }
//
//
//            Artist a1 = new Artist();
//            a1.setName("Jon");
//            Artist a2 = new Artist();
//            a2.setName("ACDC");
//            Artist a3 = new Artist();
//            a3.setName("UDO");
//
//            Album album1 = new Album();
//            album1.setTitle("al1");
//            album1.setReleaseAt(new Date());
//            album1.setReleaseAt("24/11/2016");
//
//            Album album2 = new Album();
//            album2.setTitle("al2");
//            album2.setReleaseAt(new Date());
//
//            Album album3 = new Album();
//            album3.setTitle("al3");
//            album3.setReleaseAt(new Date());
//
//
//            a1.setAlbum(album1, album2);
//            a2.setAlbum(album2, album3);
//            a3.setAlbum(album3, album1);
//
//            Director d1 = new Director();
//            d1.setName("Ben");
//            d1.setEmail("@ben");
//            d1.setPhone("7");
//
//            a1.setDirector(d1);
//            a2.setDirector(d1);
//            a3.setDirector(d1);
//
//            Director director = a1.getDirector();
//            director.setName("Kolya");
//
//            System.out.println(a1);
//            System.out.println(a2);
//            System.out.println(a3);
//
//        }
//    }
//}