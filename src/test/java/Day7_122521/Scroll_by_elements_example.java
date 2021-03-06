package Day7_122521;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_by_elements_example {

    public static void main(String[] args) throws InterruptedException {
        //webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();


        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");
        driver.manage().window().fullscreen();
        Thread.sleep(2500);

        //scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by element 'Home Value' text
        //declare as webelement
        WebElement homeValueText = driver.findElement(By.xpath("//*[contains(text(),'Home Value:')]"));
        jse.executeScript("arguments[0].scrollIntoView(true);", homeValueText);



    }//end of main method



}//end of java class
