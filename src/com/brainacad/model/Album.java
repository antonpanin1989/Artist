package com.brainacad.model;

import java.util.Date;

/**
 * Created by Anton on 24.11.2016.
 */
public class Album {
    private String title;
    private Date releaseAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(Date releaseAt) {
        this.releaseAt = releaseAt;
    }

    public void setReleaseAt(String releaseAt) {

    }

    public void setReleaseAt(long releaseAt) {

    }

    public String toString() {
        return " Album: " + title + ", " + releaseAt;
    }
}

