package org.codewiththamsanqa;

public class ArrayStatistics {

    int values[] = {23,56,1,34,12,6};

 void Highest() {
     int value = this.values[0];

     for (int i = 0; i < values.length; i++) {
         if (values[i] > value) {
             value = values[i];
         }
     }

     System.out.println("Maximum value: " + value);
 }

    void Lowest() {
        int value = this.values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < value) {
                value = values[i];
            }
        }

        System.out.println("Minimum value: " + value);
    }
}
