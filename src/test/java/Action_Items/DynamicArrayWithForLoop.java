package Action_Items;

public class DynamicArrayWithForLoop {

    public static void main(String[] args) {


        //iterate through all borough defined by dynamic array using for loop

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



        for (int i = 0;i<Zipcodes.length;i++) {

            System.out.println("my current zipcode is " + Zipcodes[i] + " my current street number is " + streetNumber[i]);


        } // end of loop


    }//end of main method

}//end of java class

