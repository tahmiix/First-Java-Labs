package org.codewiththamsanqa;

public class Product {
   String productID;
   String name;
   double price;
   int stockQuantity;

   Product(String productID, String name, double price, int stockQuantity  ){

       this.productID = productID;
       this.name = name;
       this.price = price;
       this.stockQuantity = stockQuantity;
   }
    void displayDetails(){
        System.out.println("Product ID: " + this.productID +
                            "\n Product Name: " + this.name +
                            "\n Price: " + this.price +
                            "\n Stock on hand: " + this.stockQuantity);
    }

    void addStock(String productID, int stockQuantity){
        this.stockQuantity = this.stockQuantity + stockQuantity;
    }
    void reduceStock(String productID, int stockQuantity){

        if(this.stockQuantity < stockQuantity){

            System.out.println("Stock Unavailable \n Stock left in store: " + this.stockQuantity);

        }else{

            this.stockQuantity = this.stockQuantity - stockQuantity;
        }
    }
    void calStockValue(){
        double stockValue;

        stockValue = this.stockQuantity * this.price;

        System.out.println("Stock Value: " + stockValue);
    }
}
