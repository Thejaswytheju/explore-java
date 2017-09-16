package com.theja.java.study.explorejava.hashcode;

public class Employee4 extends Employee3{

    public Employee4() {
    }

    public Employee4(String name) {
        this.name = name;
    }

    public Employee4(String name, Long id) {
        super();
        this.name = name;
        this.id = id;
    }

    public Employee4(String name1, Long id, String dept) {
        super(name1, id, dept);
        System.out.println("In side Employee4");
    }

}
