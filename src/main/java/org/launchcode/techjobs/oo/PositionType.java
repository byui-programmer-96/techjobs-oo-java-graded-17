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

    @Override
    public String toString() {
        return this.getValue();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (!(obj instanceof PositionType other)) return false; // Check type and cast
        return this.id == other.id; // Compare ids for equality
    }
}
