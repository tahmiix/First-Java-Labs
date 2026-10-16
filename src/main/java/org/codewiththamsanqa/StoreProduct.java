package org.codewiththamsanqa;

import java.util.Date;

public class StoreProduct {
    String name;
    double price;
    int quantity;

    StoreProduct() {

    }

    StoreProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    double calculateLineTotal(StoreProduct product){

          double  lineTotal = product.quantity * product.price;

        return lineTotal;
    }

    double calSubTotal(StoreProduct[] products){
        double subTotal = 0;

        for(int i = 0;i < products.length; i++){
            subTotal = subTotal + products[i].getPrice();
        }

        return subTotal;
    }

    double discountAmount(double subTotal){
        double discountPrice = 0;
        final double discount = 0.10;

        if(subTotal > 1000){
           return discountPrice = subTotal * discount;
        }else{
            return discountPrice;
        }
    }

    double finalAmount(double subTotal, double discount){
        double finalPrice;

        return finalPrice = subTotal - discount;
    }

    void displaySlip(StoreProduct[] products){
        System.out.println( "ABC Computers"+
                            "\nReciept of purchase" +
                            "\n" +new Date() +
                            "\n==========================");
       for(StoreProduct p : products) {

           System.out.println("Product: " + p.getName() +
                                "\nPrice: R" + p.getPrice() +
                                "\nQuantity: " + p.getQuantity() +
                                "\nTotal Price: R" + calculateLineTotal(p)+
                                 "\n==========================");


       }

        System.out.println("Subtotal: R" + calSubTotal(products)+
                            "\nDiscount: R" + discountAmount(calSubTotal(products))+
                            "\nAmount Due: R" + finalAmount(calSubTotal(products),discountAmount(calSubTotal(products))));

    }
}
