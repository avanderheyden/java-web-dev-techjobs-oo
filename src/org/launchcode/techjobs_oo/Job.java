package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    //  and a second to initialize the other five fields.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


//    The second constructor should also call the first in order to initialize
//     the 'id' field.
//    public Job

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

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


    public static String toString(Job jobInfo) {
        int jobId = jobInfo.getId();
        String jobName = jobInfo.getName();
        String jobEmployer = jobInfo.getEmployer().toString();
        String jobLocation = jobInfo.getLocation().toString();
        String jobPositionType = jobInfo.getPositionType().toString();
        String jobCoreCompetency = jobInfo.getCoreCompetency().toString();

        if (jobName == "") {
            jobName = "data not available";
        }
        if (jobEmployer == "") {
            jobEmployer = "data not available";
        }
        if (jobLocation == "") {
            jobLocation = "data not available";
        }
        if (jobPositionType == "") {
            jobPositionType = "data not available";
        }
        if (jobCoreCompetency == "") {
            jobCoreCompetency = "data not available";
        }

        return "\n" +
                "id: " + jobId + "\n" +
                " name: " + jobName + "\n" +
                " employer: " + jobEmployer + "\n" +
                " location: " + jobLocation + "\n" +
                " positionType: " + jobPositionType + "\n" +
                " coreCompetency: " + jobCoreCompetency + "\n"
                ;
    }
}


.

