package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentBing_automation {

    public static void main(String[] args) throws InterruptedException {
        String[] Sports = new String[6];
        Sports[0] = "Cricket";
        Sports[1] = "Soccer";
        Sports[2] = "Tennis";
        Sports[3] = "NBA";
        Sports[4] = "Football";
        Sports[5] = "Kabaddi";

        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("headless");

        //define Webdriver outside the loop

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for(int i =0; i<Sports.length; i ++ ){

            //simply open the google web site
            driver.navigate().to("https://www.Bing.com");

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for sports on Bing search field
            driver.findElement(By.xpath("//*[@class='sb_form_q']")).sendKeys(Sports[i]);

            //hit submit on Bing search button
            driver.findElement(By.xpath("//*[@name='q']")).submit();



            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);



            //capture the search results and store it as variable.
            String result = driver.findElement(By.xpath( "//*[@class='sb_count']")).getText();

            //declaring the array variable to split the results.
            String[] arrayResult = result.split(" ");
            System.out.println("My search number for Sports " + Sports[i] + " is " + arrayResult[0]);


        } //end of for loop

        //driver.quit should be outside the for loop
        driver.quit();




    }//end of main method

}//end of java class
