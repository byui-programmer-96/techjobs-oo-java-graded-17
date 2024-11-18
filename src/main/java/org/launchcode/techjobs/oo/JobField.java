package org.launchcode.techjobs.oo;

public abstract class JobField {
    private static int idCounter = 0;
    private final int id;
    private final String value;

    public JobField(String value) {
        this.value = value;
        this.id = idCounter++;
    }

    public JobField() {
        this("Default Value");
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}