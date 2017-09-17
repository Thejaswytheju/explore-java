package com.theja.java.study.explorejava.hashcode;

public class Employee2 extends Employee {

    public Employee2() {
    }

    public Employee2(String name) {
        super(name);
    }

    public Employee2(String name, Long id) {
        super(name, id);
    }

    public Employee2(String name1, Long id, String dept) {
        super(name1, id, dept);
        System.out.println("In side Employee2");
    }


    @Override
    public int hashCode() {
        int superHash = super.hashCode();
        superHash = super.id.hashCode() + superHash;
        return 100 + superHash;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}