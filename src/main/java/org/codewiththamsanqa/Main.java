package org.codewiththamsanqa;


public class Main {
    public static void main(String[] args) {

       /* int student1[] = {23,45,67};
        int student2[] = {56,89,78};
        int student3[] = {59,67,90};

        StudentMCalculator s = new StudentMCalculator();

        StudentMCalculator st1 =  new StudentMCalculator(12345678,"Thamsanqa",student1);
        StudentMCalculator st2 =  new StudentMCalculator(87654321,"Gift",student2);
        StudentMCalculator st3 =  new StudentMCalculator(56784321,"Nosipho",student3);

        StudentMCalculator students[] = {st1,st2,st3};

        s.displayStuSummary(st1);
        s.displayStuSummary(st2);
        s.displayStuSummary(st3);

        System.out.println("Student with Highest Average: " + s.highestStudent(students).getName()); */

         /*    Employee emp = new Employee();
            Employee emp1 = new Employee("Emp1232","Thamsanqa",50000);
            Employee emp2 = new Employee("Emp2345","Gift",57000);
            Employee emp3 = new Employee("Emp3456","Nosipho",47000);
            Employee emp4 = new Employee("Emp4563","Brenda",75000);
            Employee emp5 = new Employee("Emp4783","Lwazi",47000
            );

            Employee employees[] = {emp1,emp2,emp3,emp4,emp5};

            emp.displayEmpDetails(employees);

        System.out.println("Highest salary: " +emp.empHighestSalary(employees).getEmpSalary());

        System.out.println("Average Salary: " + emp.averageSalary(employees)); */
        StoreProduct sp = new StoreProduct();

        StoreProduct[] products = {new StoreProduct("Laptop",20000,1),
                                    new StoreProduct("USB stick",150,2),
                                    new StoreProduct("External SSD",1000,1),
                                    };

        sp.displaySlip(products);
        }


    }


