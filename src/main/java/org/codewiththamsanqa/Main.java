package org.codewiththamsanqa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double student1[] = {5,33,56};
        double student2[] = {88,67,100};
        double student3[] = {12,56,47};


        StudentMCalculator stu1 = new StudentMCalculator(222203082,"Thamsanqa",student1);
        StudentMCalculator stu2 = new StudentMCalculator(222267890,"Gift",student2);
        StudentMCalculator stu3 = new StudentMCalculator(222789088,"Ayanda",student3);

        StudentMCalculator smc = new StudentMCalculator();

        StudentMCalculator[] studentList = {stu1,stu2,stu3};

        //Averages
       double avg1 = stu1.calculateAverage(student1);
        double avg2 = stu2.calculateAverage(student2);
        double avg3 = stu1.calculateAverage(student3);

        //passOrFail
        stu1.passOrFail(avg1);
        stu2.passOrFail(avg2);
        stu3.passOrFail(avg3);

        //display
        stu1.displaySummary();
        stu2.displaySummary();
        stu3.displaySummary();

        smc.HighestAvg(studentList);

        //Highest student information
        String name  = smc.HighestAvg(studentList).name;
        int stuNum = smc.HighestAvg(studentList).studentNum;

        System.out.println("Student with highest average is: " + name);



        }
    }


