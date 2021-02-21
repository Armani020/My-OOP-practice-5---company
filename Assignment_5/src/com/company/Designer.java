package com.company;

public class Designer extends Employee{
    public int numberOfDesigner;
    public int salary;

    public void setNumberOfDesigner(int numberOfDesigner) {
        this.numberOfDesigner = numberOfDesigner;
    }

    public int getNumberOfDesigner() {
        return numberOfDesigner;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}