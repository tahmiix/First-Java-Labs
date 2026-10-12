package org.codewiththamsanqa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Naledi";
        int age = 20;
        double avgMark = 76.6;
        boolean isRegisterd = true;

        studentDetails st = new studentDetails(name,age,avgMark,isRegisterd);

        System.out.println(st.toString());
        }
    }
