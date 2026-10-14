package org.codewiththamsanqa;

import java.util.ArrayList;

public class EvenOddArray {
    int evenOdd[] = {2,24,27,13,78,45,87};

    int oddCount;
    int evenCount;


    void SortAndCount(){

        for(int i = 0; i < evenOdd.length; i++){

            if(evenOdd[i] % 2==0){

                evenCount = evenCount + 1;

            }else{

                oddCount = oddCount + 1;

            }

        }

       // int[] even = new int[evenCount];
       // int[] odd = new int[oddCount];

      //  int oddIndex = 0;
      //  int evenIndex = 0;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < evenOdd.length; i++){
            if(evenOdd[i] % 2 == 0){

             //   even[evenIndex] = evenOdd[i];
              //  evenIndex++;

                even.add(evenOdd[i]);
            }else{

               // odd[oddIndex] = evenOdd[i];
               // oddIndex++;

                odd.add(evenOdd[i]);
            }
        }

        System.out.println("Number of even numbers: " + evenCount +
                            "\n Number of odd numbers: " + oddCount );

       /* for(int i = 0; i < even.length; i++){
            System.out.print(even + " ");
        }

        System.out.println("");

        for(int i = 0; i < odd.length; i++){
            System.out.print(odd + " ");
        } */

        System.out.print(odd + "\n");
        System.out.println("==================");
        System.out.print(even);
    }
}
