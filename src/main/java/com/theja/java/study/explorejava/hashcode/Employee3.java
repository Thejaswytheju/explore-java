package com.theja.java.study.explorejava.hashcode;

public class Employee3 extends Employee2 {

    public Employee3() {}


    public Employee3(String name) {
        super(name);
    }

    public Employee3(String name, Long id) {
        super(name, id);
    }

    public Employee3(String name1, Long id, String dept) {
        super(name1, id, dept);
        System.out.println("In side Employee3");
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
        if (other.id.longValue() != this.id.longValue()) {
            return false;
        }

        if (other.dept != this.dept) {
            return false;
        }
        if (other.name != this.name) {
            return false;
        }

        return true;


    }
}
