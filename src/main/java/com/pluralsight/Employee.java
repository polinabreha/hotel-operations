package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;

    public Employee(int employeeId, String firstName, String lastName, String department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payRate = 0.0;
        this.hoursWorked = 0.0;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getOvertimeHours(){
        if (hoursWorked > 40){
        return hoursWorked - 40;
        }
        return 0.00;
    }

    public double getRegularHours(){
        if (hoursWorked > 40){
            return 40;
        }
        return hoursWorked;
    }

    public double getTotalPay(){
        if(hoursWorked > 40){
            return (getOvertimeHours() * (payRate * 1.5)) + getRegularHours() * payRate ;
        } else {
            return (hoursWorked * payRate);
        }
    }

    public void punchIn(int time){
        startTime = time;
    }
    public void punchOut (int time){
        hoursWorked += time - startTime;
    }
}
