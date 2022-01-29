package Day4_121221;

public class Array_Lopp_Condition_WorkingTogether {

    public static void main(String[] args) {
        // create a dynamic array for 4 different cities and iterate through the values but only print when the
        // city is Staten Island and Brooklyn.
        String[] Cities = new String[4];
        Cities[0] = "Brooklyn";
        Cities[1] = "Staten Island";
        Cities[2] = "Manhattan";
        Cities[3] = "Queens";


        for(int i =0; i<Cities.length; i ++ ){

           //two conditions
            if(Cities[i] == "Brooklyn") {
                System.out.println("city is " + Cities[i]);
            } else if(Cities[i] == "Staten Island"){
                    System.out.println("city is " + Cities[i]);
                } // end of conditions
            } // end of loop
        }//end of main





    }//end of java class






