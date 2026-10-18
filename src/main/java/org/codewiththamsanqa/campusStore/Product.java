package org.codewiththamsanqa.campusStore;

public class Product {
    private String  productID;
    private String productName;
    private double productPrice;
    private int productQuantity;

    Product(){

    }

    Product(String productID,String productName,double productPrice,int productQuantity){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    double calSubTotal(Product[] products){
        double subtotal = 0;

        for(Product p : products){
            subtotal = subtotal + p.getProductPrice();
        }

        return subtotal;
    }

    //add product list and choose discount percentage together with exceeded amount to get discount
    double calDiscount(Product[] products){
        final double discount = 0.10;


        if(calSubTotal(products) > 200){
           return (int) calSubTotal(products) *  discount;
        }else{
            return 0.00;
        }
    }

    void displayProductAndSubtotal(Product[] products){
       for(Product p : products) {

           System.out.println("Item Name: " + p.getProductName() +
                                "\nPrice: " + p.getProductPrice() +
                                "\nQuantity: " + p.getProductQuantity()+
                                "\n   ========================   ");
       }

        System.out.println("Subtotal: R" + calSubTotal(products));

       if(calDiscount(products) > 0) {
           System.out.println("Discount: R" + calDiscount(products));
       }

    }

    String searchProduct(Product[] products, String userInput){
        String foundOrNot = "Not Found";
        for(Product p : products){
            if(userInput.equals(p.getProductID()) || userInput.equals(p.getProductName())){
                foundOrNot =  "Product Found" +
                        "\nQuantity in stock: "+ p.getProductQuantity() +
                        "\nPrice : R" + p.getProductPrice();

            }
        }

        return foundOrNot;
    }

    void finalReciept(Product[] products){
        double finalAmount = 0;

        finalAmount = calSubTotal(products) - calDiscount(products);

        System.out.println("Mecer inter-ed Spaza \n======================");
        displayProductAndSubtotal(products);
        System.out.println("Amount Due: R" + finalAmount);



    }
}
