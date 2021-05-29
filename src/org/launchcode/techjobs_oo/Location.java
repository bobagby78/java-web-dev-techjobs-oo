package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{
    private int id;
    private static int nextId = 1;
    private String value = "Data not available";

    public Location() {
        id = nextId;
        nextId++;
    }

    public Location(String value){
        super(value);
    }

}
