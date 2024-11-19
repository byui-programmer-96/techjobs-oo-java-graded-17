package org.launchcode.techjobs.oo;

public abstract class JobField {
    private final int id;
    private static int nextId = 1;
    private final String value;

    public JobField(String value) {
        this.id = nextId;
        nextId++;
        this.value = value;
    }

    public JobField() {
        this("Default Value");
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}