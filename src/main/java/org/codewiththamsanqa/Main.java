package org.codewiththamsanqa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Student st1 = new Student("Thamsanqa","222203082",49);
     Student st2 = new Student("Gift","227303078",67);

        st1.displayDetails();
        System.out.println(st1.hasPassed());

        st2.displayDetails();
        System.out.println(st2.hasPassed());




        }
    }
