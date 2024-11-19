package org.launchcode.techjobs.oo;

import java.util.logging.Logger;

public class PositionType extends JobField {

    private static final Logger logger = Logger.getLogger(PositionType.class.getName());

    private final int id;

    public PositionType(String value, int id) {
        super(value);
        this.id = id;
        logger.info("PositionType created with id: " + id);
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
        if (this == obj) return true;
        if (!(obj instanceof PositionType other)) return false;
        return this.getId() == other.getId();
    }
    public int getId() {
        return id;
    }
}