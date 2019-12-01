package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer {
    private int id;
    private static int nextId = 1;
    private String value;

    /*
    first constructor accepts no arguments and assigns the value of nextId to the id field.
     Then it increments nextId.
    */

    public Employer() {
        id = nextId;
        nextId++;
    }
/*the second constructor assigns aValue to the value field.
It also initializes id for the object by calling the first constructor with this();
 */
    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
