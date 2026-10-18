package org.codewiththamsanqa.campusStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Product p = new Product();
        Scanner sc = new Scanner(System.in);

        Product products[] = {  new Product("123","Coffee",23.50,2),
                                new Product("456","Nik Naks",1.50,5),
                                new Product("789","Chips",250.60,1),
                                new Product("0123","Coldrink",18.00,1)};

       p.displayProductAndSubtotal(products);
        System.out.println("Enter item to search? ");
        String input = sc.nextLine();

        System.out.println(p.searchProduct(products,input));
    }
}
