package org.codewiththamsanqa;

public class convertCelToFar {
    double celsius = 23.4;
    double fahrenheit = 150.4;

public double convertCel(){
    double fahrenheit;

    fahrenheit = (this.celsius * 9 / 5) + 32;

    return fahrenheit;
}

public double convertFar(){
    double celsius;

    celsius = (this.fahrenheit -32) * 5/9;

    return celsius;


}
}
