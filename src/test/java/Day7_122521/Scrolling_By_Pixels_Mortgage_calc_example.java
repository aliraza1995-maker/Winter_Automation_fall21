package Day7_122521;

import Day6_191221.ChromeOptions_Google;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling_By_Pixels_Mortgage_calc_example {

    public static void main(String[] args) throws InterruptedException {

        //Webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        //Add Chrome options
        ChromeOptions options = new ChromeOptions();



        //set the driver
        WebDriver driver = new ChromeDriver(options);


        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");


        //start maximized
        driver.manage().window().fullscreen();

        Thread.sleep(2500);

        //scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        //scroll to the view by pixels
        jse.executeScript("scroll(0,450)");




    }//end of main method





}//end of java class
