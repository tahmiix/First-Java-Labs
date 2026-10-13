package org.codewiththamsanqa;

public class shoppingTotal {
    String productName;
    double price = 100;
    int quantity = 2;

 public double amountDue(){
     double amountDue;
     amountDue = this.price  * this.quantity ;

     return amountDue;
 }

 public double pAmountDue(){
     double discountAmount;
     double finalAmount;
     final double discount = 0.14;

     discountAmount = (this.price  * this.quantity) * discount ;

    finalAmount = (this.price  * this.quantity) - discountAmount ;

    return finalAmount;
 }
}

