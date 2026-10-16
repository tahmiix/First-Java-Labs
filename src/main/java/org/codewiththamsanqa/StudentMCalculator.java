package org.codewiththamsanqa;

import java.util.ArrayList;

public class StudentMCalculator {
    int studentNum;
    String name;
    int[] marks = new int[3];

    StudentMCalculator(){

    }

    StudentMCalculator(int studentNum, String name, int[] marks){
        this.studentNum = studentNum;
        this.name = name;
        this.marks = marks;

    }

    String getName(){

        return  this.name;
    }

    int getStudentNum(){
        return this.studentNum;
    }

    int[] getMarks(){
        return this.marks;
    }

    void setStudentNum(int setStudentNum) {
        this.studentNum = setStudentNum;
    }

    void setName(String name){
        this.name = name;
    }

    void setMarks(int[] marks){
        this.marks = marks;
    }


    int calculateAvg(StudentMCalculator student){
        int marksSum = 0;
        int average;

        for(int i = 0; i < student.marks.length; i++){
            marksSum = marksSum + student.marks[i];
        }

        average = marksSum/student.marks.length;

        return average;
    }

    String passOrFail(int avg){
        if(avg >= 50){
            return "Passed";
        }else{

            return "Failed";
        }
    }

    void displayStuSummary(StudentMCalculator student){
        ArrayList<Integer> marks = new ArrayList<>();

        for (int mark : student.marks) {
            marks.add(mark);
        }

        System.out.println(" Student Name: " + student.getName()  +
                "\n Student Number: " + student.getStudentNum() +
                "\n Average: " + calculateAvg(student) +
                "\n Result: " + passOrFail(calculateAvg(student)));
    }

    StudentMCalculator highestStudent(StudentMCalculator[] students){
        StudentMCalculator highest = students[0];

        for(int i = 0; i < students.length; i++){

            if(students[i].calculateAvg(students[i]) > highest.calculateAvg(highest)){
                highest = students[i];
            }
        }

        return highest;
    }
}
