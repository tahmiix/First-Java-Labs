package org.codewiththamsanqa;

public class Employee {
    String empNumber;
    String empName;
    double empSalary;

    Employee(){

    }

    Employee(String empNumber, String empName, double empSalary ){
        this.empNumber = empNumber;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    void displayEmpDetails(Employee[] employee){
        for(Employee emp : employee){
            System.out.println("Employee Number: " + emp.getEmpNumber() +
                                "\n Name: " + emp.getEmpName() +
                                "\n Salary: " + emp.empSalary +
                                "\n=============================");

        }
    }

    Employee empHighestSalary(Employee[] employees){
        Employee highest = employees[0];

        for(int i = 0; i < employees.length; i++){
            if(employees[i].empSalary > highest.empSalary ){
                highest = employees[i];
            }
        }

        return highest;
    }

    double averageSalary(Employee[] employees){
        double salarySum = 0;
        double averageSalary;
        for(Employee emp : employees){
            salarySum = salarySum + emp.getEmpSalary();
        }

        averageSalary = salarySum/employees.length;

        return averageSalary;
    }
}
