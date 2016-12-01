package com.brainacad.dao;

import com.brainacad.model.Director;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by Anton on 29.11.2016.
 */
public class DirectorDao {
    private Director[] directors = new Director[0];

    /**
     * назначить директора
     *
     * @param director
     */
    public void add(Director director) {
        int idx = indexOf(director);
        if (idx == -1) {
            Director[] tmp = new Director[directors.length + 1];
            tmp[0] = director;
            for (int i = 1; i < tmp.length; i++) {
                tmp[i] = directors[i - 1];

            }
            directors = tmp;
        } else {
            update(director);

        }
    }

    public int indexOf(Director director) {
        int idx = -1;
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getName().equals(director.getName())) {
                idx = i;
                break;
            }
        }
        return idx;
    }


    public Director[] getAll() {
        return directors;

    }

    /**
     * удаление
     *
     * @param direktor
     */
    public void remove(Director direktor) {
        int del = indexOf(direktor);
        if (del == -1) {
            Director[] tmp = new Director[directors.length - 1];
            int k = 0;
            for (int i = 0; i < directors.length; i++) {
                if (i == del) {
                    continue;
                }
                tmp[k] = directors[i];
                k++;


            }
            directors = tmp;
        }

    }

    /**
     * ищем директора по именни
     *
     * @param name
     * @return
     */
    public Director findByName(String name) {
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getName().equals(name)) {
                return directors[i];
            }

        }
        return null;


    }


    public void update(Director director) {
        int idx = indexOf(director);
        if (idx != -1) {
            directors[idx].setEmail(director.getEmail());
            directors[idx].setPhone(director.getPhone());
        }
    }
}