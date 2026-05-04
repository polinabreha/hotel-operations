package com.pluralsight;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double payRate;
    private double hoursWorked;

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

    public boolean getOvertimeHours(){
        return hoursWorked > 40;
    }

    public double getRegularHours(){
        return hoursWorked;
    }

    public double getTotalPay(){
        if(getOvertimeHours()){
            return (hoursWorked * payRate) + (payRate * 1.5 + hoursWorked - 40 );
        } else {
            return (hoursWorked * payRate);
        }
    }
}
