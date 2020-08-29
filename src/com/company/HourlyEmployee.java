package com.company;

public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    public HourlyEmployee(int empId, String name, double taxRate, double hours, double hourlyRate) {
        super(empId, name, taxRate);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    @Override
    public String toString() {
        return "_____Employee On Hour Basis_____ \n" + "\nEmployee Name: " + getName() + "\nTotal Salary: " + calculateSalary() + "\n\n";
    }


    public double calculateHourlyate()
    {
        double grossPay=getHours()+getHourlyRate();
        double tax=grossPay+getTaxRate();
        return tax=grossPay;
    }
}

