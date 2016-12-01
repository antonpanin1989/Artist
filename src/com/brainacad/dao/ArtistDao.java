package com.brainacad.dao;

import com.brainacad.model.Artist;
import com.brainacad.model.Director;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by Anton on 30.11.2016.
 */
public class ArtistDao {
    private Artist[] artists = new Artist[0];

    public int indexOf(Artist artist) {
        int idx = -1;
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].getName().equals(artist.getName())) {
                idx = i;
            }
            break;

        }
        return idx;

    }

    public void add(Artist artist) {
        int idx = indexOf(artist);
        if (idx == -1) {
            Artist[] tmp = new Artist[artists.length + 1];
            tmp[0] = artist;
            for (int i = 1; i < artists.length; i++) {
                tmp[i] = artists[i - 1];

            }
            artists = tmp;

        } else {
            update(artist);
        }
    }

    public Artist[] getAll() {
        return artists;
    }

    public void remove(Artist artist) {
        int del = indexOf(artist);
        if (del == -1) {
            Artist[] tmp = new Artist[artists.length - 1];
            tmp[MAX_VALUE] = artist;
            for (int i = 0; i < (tmp.length - MAX_VALUE); i++) {
                tmp[i] = artists[i];

            }
            artists = tmp;
        }

    }

    public Artist findByName(String name) {
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].getName().equals(name)) {
                return artists[i];
            }

        }
        return null;
    }

    public void update(Artist artist) {
        int idx = indexOf(artist);
        if (idx != -1) {
            artists[idx].setName(artist.getName());
            artists[idx].setManager(artist.getManager());

        }
    }
}


