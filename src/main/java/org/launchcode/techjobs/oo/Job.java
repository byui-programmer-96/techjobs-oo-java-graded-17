package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // First constructor - initializes unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    // Second constructor - initializes all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();  // Call the first constructor to set ID
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String emptyValue = "Data not available";

        return System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + (name == null || name.equals("") ? emptyValue : name) + System.lineSeparator() +
                "Employer: " + (employer.getValue() == null || employer.getValue().equals("") ? emptyValue : employer.getValue()) + System.lineSeparator() +
                "Location: " + (location.getValue() == null || location.getValue().equals("") ? emptyValue : location.getValue()) + System.lineSeparator() +
                "Position Type: " + (positionType.getValue() == null || positionType.getValue().equals("") ? emptyValue : positionType.getValue()) + System.lineSeparator() +
                "Core Competency: " + (coreCompetency.getValue() == null || coreCompetency.getValue().equals("") ? emptyValue : coreCompetency.getValue()) + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}