package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField {
    private String value;

    public CoreCompetency(String value) {
        super(value);
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}