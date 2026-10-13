package org.codewiththamsanqa;

public class studentDetails {
    String name = "Thamsanqa";
    int age = 20;
    double avgMark = 78.9;
    boolean isRegistered = true;

    studentDetails(){


    }
    studentDetails(String name, int age, double avgMark, boolean isRegisterd){
        this.name = name;
        this.age = age;
        this.avgMark = avgMark;
        this.isRegistered = isRegisterd;

    }

    @Override
    public String toString() {
        return ("Student Name: " + name +
                "\n Age: " + age +
                "\n Average Mark: " + avgMark +
                "\n Registered: " + isRegistered);
    }
}
