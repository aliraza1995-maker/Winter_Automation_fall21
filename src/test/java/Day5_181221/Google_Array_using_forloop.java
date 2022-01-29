package Day5_181221;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Array_using_forloop {

    public static void main(String[] args) throws InterruptedException {

        String[] Cities = new String[4];
        Cities[0] = "Brooklyn";
        Cities[1] = "Queens";
        Cities[2] = "Bronx";
        Cities[3] = "yonkers";

        //define Webdriver outside the loop

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for(int i =0; i<Cities.length; i ++ ){

            //simply open the google web site
            driver.navigate().to("https://www.google.com");

            //maximize my browser
            //driver.manage().window().fullscreen(); //for mac
            driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for cars on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Cities[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();

            //another wait statement since we came to a new page (result page)
            Thread.sleep(3000);

            //capture the search results and store it as variable.
            String result = driver.findElement(By.xpath( "//*[@id='result-stats']")).getText();

            //declaring the array variable to split the results.
            String[] arrayResult = result.split(" ");
            System.out.println("My search number for city " + Cities[i] + " is " + arrayResult[1]);


        } //end of for loop

        //driver.quit should be outside the for loop
        driver.quit();

        }//end of main method

}// end of java class



