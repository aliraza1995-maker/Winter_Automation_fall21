package Day2_120521;

public class Linear_Array {
    public static void main(String[] args) {


        //create a linear string array for cities
        //declare the variables first
        String[] cities,zipcodes;
        //define the linear array for cities
        cities = new String[]{"Brooklyn","Queens","Manhattan","Staten Island","Bronx"};
        zipcodes = new String[]{"11218","22222","33333","44444","100001"};


        //declare int variables
        int[] streetNumber;
        // define integer array for street number
        streetNumber = new int[]{22,44,55,66,77,88};


        //print the first city and first streetNumber
        System.out.println("my first city is "+cities[0] + "my zipcode is " +zipcodes[0] + " and street number is " + streetNumber[0]);
    }
} //end of method