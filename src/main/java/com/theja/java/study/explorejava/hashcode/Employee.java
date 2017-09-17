package com.theja.java.study.explorejava.hashcode;

public class Employee {
    protected String name;
    Long id;
    private String dept;

    private Employee manager;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name1, Long id, String dept) {
        super();
        System.out.println("In side Employee");
        name = name1;
        this.id = id;
        this.dept = dept;
       // manager.name = "xyz";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}