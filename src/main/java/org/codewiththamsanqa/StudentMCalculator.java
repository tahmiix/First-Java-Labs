package org.codewiththamsanqa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentMCalculator {
    int studentNum;
    String name;
    double[] marks = new double[3];

    StudentMCalculator(){

    }
    StudentMCalculator(int studentNum,String name, double[] marks){
        this.studentNum = studentNum;
        this.name = name;
        this.marks = marks;

    }

    double calculateAverage(double[] marks){
        double average;
        double markSum = 0;

        for(int i = 0; i < marks.length; i++){

            if(marks[i] < 0 && marks[i] > 100){
                System.out.println("Invalid Marks");
            }
        }

        for(int i = 0; i < marks.length; i++){
            markSum = markSum + marks[i];

        }

        average = markSum/marks.length;

        return average;
    }

    boolean passOrFail(double avg){
        if(avg >= 50){
            return true;

        }else{

            return false;
        }
    }

    void displaySummary(){
        ArrayList<Double>stuMarks = new ArrayList<>();

        for(double mark: this.marks){
            stuMarks.add(mark);
        }

      if(passOrFail(calculateAverage(this.marks))){
          System.out.println(" Student number: "+ this.studentNum+
                            "\n Name: " + this.name +
                            "\n Student marks: " + stuMarks +
                            "\n Result: Passed");
      }else{
          System.out.println(" Student number: "+ this.studentNum+
                  "\n Name: " + this.name +
                  "\n Student marks: " + stuMarks +
                  "\n Result: Failed");
      }
    }

    void HighestAvg(double avg1, double avg2, double avg3){
        double HighestStu = 0;
        double stuMarks[] = {avg1,avg2,avg3};

        double max = stuMarks[0];
        for(int i = 0; i < stuMarks.length; i++){
            if(stuMarks[i] > max){
                max = stuMarks[i];
            }

        }

        System.out.println("Highest Average: " + max);

    }

}
