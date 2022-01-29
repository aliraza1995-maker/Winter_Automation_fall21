package Day4_121221;

public class Split_Command {

    public static void main(String[] args) {
        //create a single string

        String statement = "My name is john";

        //declare string array to split the message and print out only john

        String[] arrayMessage = statement.split(" ");
         //print out john

        System.out.println(" the result is " + arrayMessage[3]);


    }//end of main
}//end of java class
