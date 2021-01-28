package com.viz.interview.modules.patients.entities;

import javax.persistence.*;

@Entity(name = "patients")
public class PatientEntity {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    public PatientEntity() {
    }

    public PatientEntity(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
