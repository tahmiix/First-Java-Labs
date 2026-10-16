package org.codewiththamsanqa;

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


    double calculateLineTotal(StoreProduct[] product){
        double lineTotal = 0;

        for(StoreProduct products : product){
            lineTotal = lineTotal + products.price;
        }

        return lineTotal;
    }
}
