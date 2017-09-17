package com.theja.java.study.explorejava.hashcode5;

import com.theja.java.study.explorejava.hashcode.Employee4;

public class Employee5 extends Employee4 {

    public Employee5(String name1, Long id, String dept) {
        super(name1, id, dept);
        System.out.println("In side Employee");
        name = name1;
        // error
        // this.id = id;
        // this.dept = dept;
        // manager.name = "xyz";
    }

    public String printName() {
        // error
        // Long x = this.id;
        return name;
    }

}
