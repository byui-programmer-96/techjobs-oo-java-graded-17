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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PositionType other)) return false;
        return this.getId() == other.getId();
    }
}

