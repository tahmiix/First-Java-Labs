package org.codewiththamsanqa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    BankAccount ba = new BankAccount("Thamsanqa",12345678,0);

    ba.getBalance();

    ba.deposit(0);

    ba.getBalance();

    ba.withdraw(300);

    ba.getBalance();



        }
    }
