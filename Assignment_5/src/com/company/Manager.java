package com.company;

public class Manager extends Employee{
    public int numberOfManager;
    public int salary;

    public void setNumberOfManager(int numberOfManager1) {
        this.numberOfManager = numberOfManager1;
    }

    public int getNumberOfManager() {
        return numberOfManager;
    }

    public void setSalary(int salary1) {
        this.salary = salary1;
    }

    public int getSalary() {
        return salary;
    }
}
