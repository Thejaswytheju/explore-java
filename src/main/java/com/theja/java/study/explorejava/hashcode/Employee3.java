package com.theja.java.study.explorejava.hashcode;

public class Employee3 extends Employee2 {

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        if(other.id.longValue() !=this.id.longValue()) {
            return false;
        }

        if(other.dept!=this.dept) {
            return false;
        }
        if(other.name!=this.name){
            return false;
        }

        return true;


    }
}
