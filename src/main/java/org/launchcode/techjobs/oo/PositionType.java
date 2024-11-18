package org.launchcode.techjobs.oo;

public class PositionType extends JobField {
    private static int nextId = 1;
    private final int id;

    public PositionType(String value) {
        super(value);
        this.id = nextId++;
    }

    public int getId() {
        return this.id;
    }
}
