package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField{
    private int id;
    private static int nextId = 1;
    private String value = "Data not available";

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        super(value);
    }

}
