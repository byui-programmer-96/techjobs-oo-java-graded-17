package org.launchcode.techjobs.oo;

public abstract class JobField {
    private static int nextId = 1;
    private final int id;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}