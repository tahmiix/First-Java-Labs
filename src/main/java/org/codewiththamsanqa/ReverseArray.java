package org.codewiththamsanqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
   // ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,45,23,56,12,3,16));
    int numArray[] = {1,2,3,4,5,6,7};


    void reverseArray(){
        //Collections.reverse(this.numbers);
        int right = 0;
        int left = numArray.length-1;

        while(right < left){
            int temp;

            temp = numArray[right];
            numArray[right] = numArray[left];
            numArray[left] = temp;

            left--;
            right++;


        }
      //  System.out.println(this.numbers);

        for(int i = 0; i < numArray.length; i++ ) {
            System.out.print(numArray[i] + " ");


        }
    }

}
