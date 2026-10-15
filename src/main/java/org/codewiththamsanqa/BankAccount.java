package org.codewiththamsanqa;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Please deposit an amount greater than R1");
        }else{

        this.balance = this.balance + amount;

        }
    }

    void withdraw(double amount){
        if(amount < 0){
            System.out.println("Amount entered is invalid");
        }
        else if(this.balance < amount){
            System.out.println("Insufficient funds ");
        }else{
          this.balance =  this.balance - amount;
        }
    }
    void getBalance(){
        System.out.println(this.balance);
    }

    void setAmount(double amount){
        this.balance = amount;

    }
}
