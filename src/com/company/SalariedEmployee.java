package com.company;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(int empId, String name, double taxRate, double salary) {
        super(empId, name, taxRate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "_____Employee On Salary_____\n" + "\nSalary of the person: "+getName()+ "\nTotal Salary: "+calculateSalary() + "\n\n";
    }

    @Override
    public double calculateSalary()
    {
        return (getSalary()+getTaxRate()-getSalary()) ;
    }

}

