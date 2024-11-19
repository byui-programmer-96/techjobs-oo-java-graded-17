package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return this.getValue();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.getId());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (!(obj instanceof PositionType other)) return false; // Check type and cast
        return this.getId() == other.getId(); // Compare ids for equality
    }
}
