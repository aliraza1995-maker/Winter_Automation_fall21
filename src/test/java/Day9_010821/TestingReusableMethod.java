package Day9_010821;

import org.openqa.selenium.WebDriver;

public class TestingReusableMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to ups website
        driver.navigate().to("https://www.ups.com/us");

        Thread.sleep(3000);

        //Click on track
        Reusable_Actions.clickMethod(driver,"//*[text()='Tracking']", "Tracking");


        //Click on track a package
        Reusable_Actions.clickMethod(driver, "//*[text()='Track a Package']","Track a package");

        //enter any tracking number
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","1111111111111","Enter any tracking number");

        //Click on track button
        Reusable_Actions.clickMethod(driver,"//*[@id='stApp_btnTrack']","Track button");

        //capture the error message and print out only we could not locate the shipment'
        String resultvalue = Reusable_Actions.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error message");

        //declare array and split
        String[] arrayResult = resultvalue.split("details");
        System.out.println("my error info is " + arrayResult[0]);

    }//end of main
}//end of java
