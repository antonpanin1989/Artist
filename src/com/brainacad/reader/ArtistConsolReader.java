package com.brainacad.reader;

import com.brainacad.model.Artist;

import com.brainacad.model.Manager;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Anton on 30.11.2016.
 */
public class ArtistConsolReader {
    private final PrintStream suggestionOut;
    private final Scanner scanner;

    public ArtistConsolReader() {
        suggestionOut = System.out;
        scanner = new Scanner(System.in);
    }

    public Artist read() {
        suggestionOut.println("Enter Name: ");
        Artist artist = new Artist();
        artist.setName(scanner.nextLine());

        suggestionOut.println("Enter information about: ");
        artist.setAbout(scanner.nextLine());

        suggestionOut.println("Enter Manager: ");
        Manager manager = new Manager();
        manager.setName(scanner.nextLine());
        artist.setManager(manager);

        return artist;


    }
}

