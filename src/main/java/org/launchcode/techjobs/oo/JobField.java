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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (!(obj instanceof JobField other)) return false; // Check type and cast
        return this.getId() == other.getId(); // Compare ids for equality
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(this.getId());
    }
}