package org.codewiththamsanqa;

public class Student {
    String name;
    String studentNumber;
    double mark;

    Student(String name, String studentNumber, double mark){

        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    void displayDetails(){
        System.out.println(" Name: " + this.name +
                            "\n Student Number: " + this.studentNumber +
                            "\n Marks: " + this.mark);

    }

    Boolean hasPassed(){
        if(this.mark > 50){
            return true;
        }else{
            return false;
        }
    }
}
