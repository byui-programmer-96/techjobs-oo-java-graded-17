package org.launchcode.techjobs.oo;

public class JobField {

    private static int nextId = 1;
    private final int id;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
        this.value = "";
    }

    public JobField(String value) {
        this.id = nextId;
        nextId++;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

}