package org.codewiththamsanqa;

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

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 0; i < evenOdd.length; i++){
            if(evenOdd[i] % 2 == 0){

                even[evenIndex] = evenOdd[i];
                evenIndex++;

            }else{

                odd[oddIndex] = evenOdd[i];
                oddIndex++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount +
                            "\n Number of odd numbers: " + oddCount );

        for(int i = 0; i < even.length; i++){
            System.out.print(even[i] + " ");
        }

        System.out.println("");

        for(int i = 0; i < odd.length; i++){
            System.out.print(odd[i] + " ");
        }

    }
}
