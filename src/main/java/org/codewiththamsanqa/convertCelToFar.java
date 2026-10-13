package org.codewiththamsanqa;

public class convertCelToFar {
    double celsius = 23.4;
    double fahrenheit = 150.4;

    void convertCel(){
    double fahrenheit;

    fahrenheit = (this.celsius * 9 / 5) + 32;

    System.out.println("Answer: " + fahrenheit +  " fahrenheit");
}

public void convertFar(){
    double celsius;

    celsius = (this.fahrenheit -32) * 5/9;

    System.out.println("Answer: " + celsius +  " celsius");

}
}
