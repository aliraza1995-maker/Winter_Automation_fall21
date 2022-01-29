package Action_Items;

public class Assignment2_Array_Loop_ConditionalStatements {

    public static void main(String[] args) {


        // create a dynamic array for 4 different cities and iterate through the values but only print when the
        //  New York or Virginia
        String[] Cities = new String[4];
        Cities[0] = "New York";
        Cities[1] = "Texas";
        Cities[2] = "Michigan";
        Cities[3] = "Virginia";

        for (int i = 0; i <Cities.length; i++) {
            if (Cities[i] == "New York") {
                System.out.println("The city is " + Cities[i]);
            } else if (Cities[i] == "Virginia") {
                System.out.println("The city is " + Cities[i]);


            }//end of conditions
            }// end of loop

        }//end of main method


}//end of java class
