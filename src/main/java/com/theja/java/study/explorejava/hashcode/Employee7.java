package com.theja.java.study.explorejava.hashcode;

public class Employee7 extends Employee6 {
    public Employee7() {
    }

    public Employee7(String name) {
        super(name);
    }

    public Employee7(String name, Long id) {
        super(name, id);
    }

    public Employee7(String name1, Long id, String dept) {
        super(name1, id, dept);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        if (other.name != null && !other.name.equals(this.name)) {
            return false;
        }
        if (other.id.longValue() != this.id.longValue()) {
            return false;
        }
        if (other.getDept() != null && !other.getDept().equals(this.getDept())) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {
        int hashValue=0;
        if(name != null) {
            hashValue = hashValue+3 * (name.hashCode());
        }
        if(id != null) {
            hashValue = hashValue + (5 * id.hashCode());
        }
        if (getDept() !=null) {
            hashValue= hashValue+ (7*getDept().hashCode());
        }
        return hashValue;
    }
}
