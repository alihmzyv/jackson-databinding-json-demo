package com.luv2code.jackson.json.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -6141973723931525152L;
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private List<String> languages;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return active;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getLanguages() {
        return languages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", active=" + active +
                ", address=" + address +
                ", languages=" + languages +
                '}';
    }
}
