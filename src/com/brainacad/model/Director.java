package com.brainacad.model;

/**
 * Created by Anton on 24.11.2016.
 */
public class Director extends User{


    public Director() {
        super("Direktor");
    }

    public String toString() {
        return "Director: " + name + ", " + phone + ", " + email;

    }
}