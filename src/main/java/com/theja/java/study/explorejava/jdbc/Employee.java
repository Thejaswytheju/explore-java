package com.theja.java.study.explorejava.jdbc;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Employee implements Comparable<Employee> {

    Long id;

    String firstName;

    String lastName;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        ToStringBuilder tsb = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        tsb.append("id", id);
        tsb.append("firstName", firstName);
        tsb.append("lastName", lastName);
        return tsb.toString();
    }

    public int compareTo(Employee o) {

        if(this.getId() == null) {
            return -1;
        }
        if(o.getId() == null) {
            return 1;
        }
        return o.getId().compareTo(o.getId());
    }
}
