package org.codewiththamsanqa;

public class StudentMarks {
    int stuMarks[] = {56,67,89,45,35};
    int avgMark;
    int markTotal = 0;

void printMarks(){
    for(int i = 0; i < stuMarks.length; i++){
        System.out.println("Mark: " + i + " "+ stuMarks[i]);
        markTotal = markTotal + stuMarks[i];
    }

    avgMark = markTotal / stuMarks.length;

    System.out.println("Total: " + markTotal);
    System.out.println("Average: " + avgMark);
}
}
