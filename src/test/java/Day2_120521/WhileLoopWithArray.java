package Day2_120521;

public class WhileLoopWithArray {
    public static void main(String[] args) {


        //iterate through all borough defined by dynamic array using for loop

        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";

        //define while loop with start point

        int i =1;

        //define while loop with end point

        while(i< boroughs.length){

            System.out.println("my current borough is " + boroughs[i]);

            i = i+1; // without end point loop runs infinite
        } // end of loop






        } // end of main method







}// end of java class
