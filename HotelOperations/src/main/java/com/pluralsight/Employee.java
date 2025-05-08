package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = -1;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return 0;
        }
    }

    public double getOverTimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getHoursWorked() * payRate;

        double overTimePay = getHoursWorked() * payRate * 1.5;

        return regularPay + overTimePay;
    }
    public void punchIn(double time) {
        if (startTime == -1) {
            startTime = time;
        }
    }
    public void punchIn() {
        LocalTime now = LocalTime.now();

        if (startTime == -1) {
            startTime = now.getHour();
        }
    }
    public void punchOut(double time) {
        if (startTime != -1) {
            double worked = time - startTime;
            hoursWorked = hoursWorked + worked;
            startTime = -1;
        }
    }
    public void punchOut() {
        LocalTime now = LocalTime.now();

        if (startTime != -1) {
            double endTime = now.getHour();
            double worked = endTime - startTime;
            hoursWorked = hoursWorked + worked;
            startTime = -1;
        }
    }
}
