package Day2_120521;

import java.security.SecureRandom;

public class Dynamic_Array {
    public static void main(String[] args) {
        //create a string dynamic array for countries
        String[] countries = new String[6]; //you set the boundary for array
        //now define your values by the variables indexing
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Bangladesh";
        countries[3] = "India";
        countries[4] = "Pakistan";
        countries[5] = "Russia";

       // System.out.println("my country is " + countries[5]);

        //integer dynamic array
        int[] houseNumber = new int[4];
        houseNumber[0] = 200;
        houseNumber[1] = 400;
        houseNumber[2] = 500;
        houseNumber[3] = 600;
        System.out.println("my house number is " + houseNumber[3] + " and country is " + countries[5]);
    } //end of main method
} // end of java class
