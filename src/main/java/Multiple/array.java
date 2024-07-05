package Multiple;

import java.util.Arrays;  ////////only for the to string array
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //////////////////////for loop array
        int[] numbers={11,22,27,33,23};

        for (int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    //////////////////////////////for loop simple method

        int[]number =new int[5];
        numbers[1]=26;
        numbers[3]=58;

        for (int i=0;i< number.length;i++) {
            System.out.println(numbers[i]);
        }

        /////////////////////////////to string array

        int[]myarray={72,34,32,23};
        System.out.println("the array:"+Arrays.toString(myarray));


        //////////////for each loop

        String[] id ={"manoj","mouli","basha",};
        for(String c1: id){
            System.out.println(c1);
    }
//////////////scanner array

        Scanner scan =new Scanner(System.in);
        int[]array =new int[6];
        System.out.println("enter the values=");
        for (int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
    ///////////////to string using scanner
        for (int c2: array){
            System.out.println(c2);
        }


        ///////////update array methods
        


    }


}




