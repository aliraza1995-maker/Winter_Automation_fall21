package Day2_120521;

public class forloop_forArray {
    public static void main(String[] args) {

        //iterate through all borough defined by dynamic array using for loop

        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";

        for(int i =0; i< boroughs.length; i ++){

            //print statement

            System.out.println("my current borough is " + boroughs[i]);


        } // end of loop



    }//end of main method






}//end of java class