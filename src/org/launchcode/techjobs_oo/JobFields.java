package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobFields {
    private String value;
    private int id;
    private static int nextId = 1;

    public JobFields() {
        id = nextId;
        nextId++;
    }

    public JobFields(String value) {
        this();
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return value;
    }
}
