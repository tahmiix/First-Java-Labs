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
        double average = 0;
        double markSum = 0;

                for(int j = 0; j < marks.length; j++){
                    markSum = markSum + marks[j];

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

    StudentMCalculator HighestAvg(StudentMCalculator[] students){

        StudentMCalculator max = students[0];

        for(int i = 0; i < students.length; i++){
            if(students[i].calculateAverage(students[i].marks) > max.calculateAverage(max.marks)){
                max = students[i];

            }

        }

        return max;

    }



}
