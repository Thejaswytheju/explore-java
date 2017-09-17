package com.theja.java.study.explorejava.hashcode;

public class Employee6 extends Employee4 {


    public Employee6() {
    }

    public Employee6(String name) {
        super(name);
    }

    public Employee6(String name, Long id) {
        super(name, id);
    }

    public Employee6(String name1, Long id, String dept) {
        super(name1, id, dept);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        if (other.id.longValue() == this.id.longValue()) {
            return true;
        }

        return false;

    }

    @Override
    public int hashCode() {
        if(id == null) {
            return 0;
        }
        return id.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
