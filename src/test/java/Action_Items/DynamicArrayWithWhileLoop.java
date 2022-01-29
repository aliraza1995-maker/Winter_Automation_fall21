package Action_Items;

public class DynamicArrayWithWhileLoop {

    public static void main(String[] args) {

         //iterate through all borough defined by dynamic array using while loop

        String[] Zipcodes = new String[4];

        Zipcodes[0] = "11230";
        Zipcodes[1] = "11221";
        Zipcodes[2] = "11423";
        Zipcodes[3] = "11231";

        //Dynamic array using integer

        int[] streetNumber = new int[4];

        streetNumber[0] = 111;
        streetNumber[1] = 222;
        streetNumber[2] = 333;
        streetNumber[3] = 444;


        //Define while loop start point
        int i = 0;

        //define while loop end point

        while (i<Zipcodes.length) {

            System.out.println( "my current zipcode is "  + Zipcodes [i]  +  " my current street number is "  +  streetNumber[i]);

            i = i+1;

        } // end of loop





    } //end of main method









} //end of java class
