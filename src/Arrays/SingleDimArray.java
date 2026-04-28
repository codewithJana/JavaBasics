package Arrays;

import java.util.Arrays;

public class SingleDimArray {

    static void main(String[] args) {

        /*Arrays--> store multiple values of same datatype |It is a data structure to store collection of elements(variables)
        of same datatype
        * */

        int num = 889479822;

        //Initialize without memory allocated --> Static Array Ini
        int [] numbers = {1,2,3,4,5,'a'} ;
        String [] animals = {"dog","cat","cow","lion"};

        //Access the Array Element
        System.out.println(animals[2]);
        System.out.println(numbers[5]);

        //change the array element
        System.out.println("Before changing Array element:" + animals[2]);
        animals[2] = "buffallo";
        System.out.println("After changing Array element:" + animals[2]);

        //Get the length of Array
        System.out.println("size of the array is: " + animals.length);

        //for loop
        for(int i=0;i<animals.length;i++){
            System.out.println("Animal is: "+animals[i]);
        }

        //for-each
        for(String animal : animals){
            System.out.println(animal);
        }

        System.out.println("-----------------------------------------");

        //With memory --> Dynamic Array Ini
        String [] vehicles = new String[5];  //allocate memory, initialization vehicle[0]..vehicle[4]
        vehicles[0] = "volvo";
        vehicles[1] = "Benz";
        vehicles[2] = "BMW";
        vehicles[3] = "FORD";


        //int [][] a = new int[3][4];  //12 elements

        //print entire Array
        System.out.println(Arrays.toString(animals));


    }

}
