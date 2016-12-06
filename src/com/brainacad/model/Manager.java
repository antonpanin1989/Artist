package com.brainacad.model;

/**
 * Created by Anton on 24.11.2016.
 */
public class Manager extends User {
    protected String name;

    @Override
    public void setName(String name) {
        super.name = name;
        this.name = "Some" + name;
    }

    public Manager() {
        super("manager");
        System.out.println("Manager constructor");
    }

    public String getName() {
        String name1 = super.getName();
        return "Some" + name1;
    }


    public String toString() {
        return "Manager: " + name + ", " + phone + ", " + email;
    }
}

