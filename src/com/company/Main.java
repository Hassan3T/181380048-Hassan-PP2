package com.company;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[6];
        emp[0] = new SalariedEmployee(1, "Sufyan", 20.0, 30.0);
        emp[1] = new SalariedEmployee(2, "Qaiser", 20.0, 30.0);
        emp[2] = new HourlyEmployee(3, "Areeba", 20.0, 30.0, 100.34);
        emp[3] = new HourlyEmployee(1, "Mahnoor", 20.0, 30.0, 1000.77);
        emp[4] = new CommissionedEmployee(1, "Waseem", 20.0, 30.00, 5000.65);
        emp[5] = new CommissionedEmployee(1, "Areej", 20.0, 30.00, 3000.09);
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());


        }
    }
}

