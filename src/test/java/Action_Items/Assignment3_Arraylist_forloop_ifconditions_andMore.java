package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Assignment3_Arraylist_forloop_ifconditions_andMore {

    public static void main(String[] args) throws InterruptedException {


        //Create an array list
        ArrayList<String> Zipcodes = new ArrayList<>();
        Zipcodes.add("76105");
        Zipcodes.add("11230");
        Zipcodes.add("11234");


//call the webdrivermanager
        WebDriverManager.chromedriver().setup();
//call chromeoptions
        ChromeOptions options = new ChromeOptions();
//set incognito and maximize the driver

        options.addArguments("incognito");
//set my webdriver
        WebDriver driver = new ChromeDriver(options);

        //for loop for iterating array list

        for(int i =0; i<Zipcodes.size(); i ++ ){
            try {driver.navigate().to("https://www.weightwatchers.com");
                driver.manage().window().fullscreen();
                Thread.sleep(2000);

            }catch (Exception e){
                System.out.println("Unable to navigate to the website " + e);

            }//end of first exception

            Thread.sleep(2000);

            try {

                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            }catch (Exception e){
                System.out.println("unable to click on Attend dropdown " + e);
            }//end of second exception

            Thread.sleep(2000);

            try {

                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__3LoiE']")).click();
            }catch (Exception e) {
                System.out.println("unable to click on workshops " + e);
            }//end of third exception

            Thread.sleep(2000);

            try {

                driver.findElement(By.xpath("//*[text()='Studio']")).click();
            }catch (Exception e) {
                System.out.println("unable to click on studio link " + e);
            }//end of fourth exception

            Thread.sleep(2000);

            try {

                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(Zipcodes.get(i));
            }catch (Exception e) {
                System.out.println("unable to enter zipcode " + e);
            }//end of fifth exception

            Thread.sleep(2000);

            //Click on search arrow


            try {

                driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();
            }catch (Exception e) {
                System.out.println("unable to click on submit arrow " + e);
            }//end of sixth exception

            //put 3 seconds wait
            Thread.sleep(3000);

            //Applying if condition within single try and catch

           try {
               List<WebElement> studiolink = (List<WebElement>) driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]"));
               if (i==0){
                   //select studio link

                   studiolink.get(1).click();

               }else if (i==1){
                   //select the studio link

                   studiolink.get(2).click();

               }else if (i==2){

                   studiolink.get(0).click();
               }
           }catch(Exception e){
               System.out.println("unable to click on studio link " + e);
           }

           Thread.sleep(3000);

           //capture address

            try {

                String myStudioAddress = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();


                System.out.println("My address for " + Zipcodes.get(i) + " is " + myStudioAddress );

            }catch (Exception e){
            System.out.println("Unable to capture address " + e);

        }

            Thread.sleep(3000);

            //Scroll to the bottom
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("scroll(0,450)");

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[text()='Business hours']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on business hours" +e);
            }//End of try
            Thread.sleep(2000);

            try{
               //capture the entire table
                String myTable = driver.findElement(By.xpath("//*[@class='hoursWrapper-1KHIv show-1db4o']")).getText();

                System.out.println("my schedule for "  + Zipcodes.get(i) +  " is " + myTable );
            }catch (Exception e){
                System.out.println("unable to get schedule " + e);
            }//end of exception
        }//end of loop



    }//end of main method
}//end of java class
