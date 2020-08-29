package com.company;

public class Employee {

    private int empId;
    private String name;
    private double taxRate;
    public Employee()
    {
        setEmpId(10013);
        setName("Asfand");
        setTaxRate(25.89);


    }
    public Employee(int empId, String name, double taxRate) {
        this.empId = empId;
        this.name = name;
        this.taxRate = taxRate;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateSalary(){
        return 0.0;
    }
    @Override
    public String toString() {
        return "_______Employee:______ \n" + "\nEmployee ID= " + empId + "\nName= " + name  + "\nTaxRate= " + taxRate + "\nSalary= " +calculateSalary() +"\n\n";
    }
}

