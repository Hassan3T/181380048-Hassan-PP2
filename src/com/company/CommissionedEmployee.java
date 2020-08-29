package com.company;

public class CommissionedEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionedEmployee(int empId, String name, double taxRate, double sales, double commissionRate) {
        super(empId, name, taxRate);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString() {
        return "_____Employee On Commission_____ \n" + "\nSalary of the person: "+getName()+ "\nTotal Salary: "+calculateSalary() + "\n\n";
    }


    public double calculateHourlyate()
    {
        double grossRate=getSales()+getCommissionRate();
        double tax=grossRate+getTaxRate();
        return tax=grossRate;
    }
}

