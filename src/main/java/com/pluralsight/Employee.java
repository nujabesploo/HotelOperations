package com.pluralsight;

public class Employee
{
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, float payRate, float hoursWorked, double totalPay, double regularHours, double overtimehours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    private double getTotalPay()
    {
        return this.payRate * this.hoursWorked;
    }

    private int getRegularHours()
    {
        return this.hoursWorked;
    }

    private int getOvertimeHours()
    {
        if(this.hoursWorked > 40)
        {
            return this.hoursWorked - 40;
        }

        return 0;
    }


}




