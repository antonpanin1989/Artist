package com.brainacad.OOP;

import com.brainacad.dao.ArtistDao;
import com.brainacad.dao.DirectorDao;
import com.brainacad.model.Artist;
import com.brainacad.model.Director;
import com.brainacad.model.Manager;
import com.brainacad.reader.ArtistConsolReader;
import com.brainacad.reader.DirectorConsoleReader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static final String[] data = {
            "3",
            "Анастасия Драпеко", "123-45-67", "drapeko@yandex.ru",
            "Денис Орлов", "873-12-23", "pr.orlov@gmail.com",
            "Лиза Феофановаs", "542-78-67", "liza_velvet@mail.ru",

            "5",
            "Маша Гойя", "1",
            "Вера Брежнева", "2",
            "Ёлка", "1",
            "Группа КЛЮЧИ", "3",
            "Альбина Джанабаева", "1",

            "Маша Гойя",
            ""
    };


    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();


    }
}


//region
//        InputStream in = System.in;
//
////        InputStream in = new ByteArrayInputStream(String.join("\n", data).getBytes());
////        PrintStream suggestionOut = new PrintStream(new ByteArrayOutputStream(1024));
//
//        Scanner scanner = new Scanner(in);
//
//        System.out.print("Total directors: ");
//        int totalDirectors = scanner.nextInt();
//        scanner.nextLine();
////
////        Director[] directors = new Director[totalDirectors];
////        for (int i = 0; i < directors.length; i++) {
////            suggestionOut.println("Input director № " + i);
////
////            directors[i] = director;
////        }
//        DirectorDao directorDao = new DirectorDao();
//        DirectorConsoleReader directorConsoleReader = new DirectorConsoleReader();
//        for (int i = 0; i < totalDirectors; i++) {
//            Director director = directorConsoleReader.read();
//            directorDao.add(director);
//        }
//        System.out.println(Arrays.toString(directorDao.getAll()));
//
//
//        System.out.println("Total artists: ");
//        int totalArtists = scanner.nextInt();
//        scanner.nextLine();
//
//        ArtistDao artistDao = new ArtistDao();
//        ArtistConsolReader artistConsolReader = new ArtistConsolReader();
//        for (int i = 0; i < totalArtists; i++) {
//            Artist artist = artistConsolReader.read();
//            artistDao.add(artist);
//        }
//        System.out.println(Arrays.toString(artistDao.getAll()));
//
//    }
//
//}
////        Artist[] artists = new Artist[totalArtists];
////        for (int i = 0; i < artists.length; i++) {
////            Artist artist = new Artist();
////
////            suggestionOut.println("Input artists № " + i);
////            suggestionOut.println("Enter Name: ");
////            artist.setName(scanner.nextLine());
//
////            suggestionOut.println("Choose Director: ");
////            for (int j = 0; j < directors.length; j++) {
////                suggestionOut.println((j + 1) + ". " + directors[j]);
////            }
////            int k = scanner.nextInt() - 1;
////            scanner.nextLine();
////
////            artist.setDirector(directors[k]);
////            artists[i] = artist;
////        }
////
////
////        System.out.println("--------- Searching ----------");
////
////        suggestionOut.print("Search: ");
////        String name = scanner.nextLine();
////
////        for (int i = 0; i < artists.length; i++) {
////            if(artists[i].getName().equals(name)) {
////                System.out.println(artists[i]);
////            }
////        }
////
////        System.out.println("--------- Sorting ----------");
////
////        String max;
////        int maxIndex;
////        for (int i = 0; i < artists.length; i++) {
////            max = artists[i].getName();
////            maxIndex = i;
////
////            for (int j = i; j < artists.length; j++) {
////                if (max.compareTo(artists[j].getName()) > 0) {
////                    max = artists[j].getName();
////                    maxIndex = j;
////                }
////            }
////
////            Artist tmp = artists[i];
////            artists[i] = artists[maxIndex];
////            artists[maxIndex] = tmp;
////        }
////
////        for (int i = 0; i < artists.length; i++) {
////            System.out.println(artists[i]);
////        }
////    }
//endregion
