package org.codewiththamsanqa;

public class shoppingTotal {
    String productName;
    double price = 100;
    int quantity = 2;

 public void amountDue(){
     double amountDue;
     amountDue = this.price  * this.quantity ;

     System.out.println("Amount Due: " + amountDue);
 }

 public void pAmountDue(){
     double discountAmount;
     double finalAmount;
     final double discount = 0.14;

     discountAmount = (this.price  * this.quantity) * discount ;

    finalAmount = (this.price  * this.quantity) - discountAmount ;

     System.out.println("Amount Due: " + finalAmount);
 }
}

