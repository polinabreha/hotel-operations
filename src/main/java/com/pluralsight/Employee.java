package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private final int employeeId;
    private final String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean isClockedIn;

    public Employee(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = 0.0;
        this.hoursWorked = 0.0;
        this.isClockedIn = false;
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
        } else {
            return 0.00;
        }
    }

    public double getRegularHours(){
        if (hoursWorked > 40){
            return 40;
        }
        return hoursWorked;
    }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }



    public void punchIn(int time){
       startTime = time;
    }

    public void punchIn(){
        LocalTime now = LocalTime.now();
        startTime = now.getHour() + (now.getMinute() / 60.0);

    }

    public void punchOut (int time){
       hoursWorked += time - startTime;
    }
    public void punchOut(){
        LocalTime now = LocalTime.now();
        hoursWorked += (now.getHour() + (now.getMinute() / 60.0)) - startTime;
    }

    public void punchTimeCard(int time){
        if(!isClockedIn){
            startTime = time;
            this.isClockedIn = true;
        }else  {
            hoursWorked += time - startTime;
            this.isClockedIn = false;
            startTime = 0;
        }
    }
}
