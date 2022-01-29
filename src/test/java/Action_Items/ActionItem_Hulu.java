package Action_Items;

import Day9_010821.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ActionItem_Hulu {


    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
    } //end of pre-conditions

    @Test(priority = 1)
    public void Hulu() {
        ArrayList<String> email = new ArrayList<>();

        email.add("tipulabnbukbl@gmail.com");
        email.add("lalamuhbnb34@gmail.com");


        ArrayList<String> password = new ArrayList<>();

        password.add("Cover1?");
        password.add("Pakistan123");

        ArrayList<String> name = new ArrayList<>();

        name.add("Ali Raza");
        name.add("Mohsin Raza");

        ArrayList<String> birthmonth = new ArrayList<>();

        birthmonth.add("Nov");
        birthmonth.add("Dec");

        ArrayList<String> Birthday = new ArrayList<>();

        Birthday.add("11");
        Birthday.add("12");

        ArrayList<String> Birthyear = new ArrayList<>();

        Birthyear.add("1990");
        Birthyear.add("1991");

        ArrayList<String> Gender = new ArrayList<>();

        Gender.add("Male");
        Gender.add("Female");


        for (int i = 0; i < email.size(); i++) {

            //navigating to google
            driver.navigate().to("https://www.hulu.com");


            //verify the title says 'Stream TV and Movies'
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies'")) {
                System.out.println("Title matches as 'Stream TV and Movies''");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }
            //end of title capture

            //Scroll to the bottom using scroll by pixel method
            Reusable_Actions.scrollMethod(driver, "0", "3250", "scroll");


            //JavascriptExecutor jse = (JavascriptExecutor) driver;

            //scroll to the view by pixels
            //jse.executeScript("scroll(0,3250)");

            //Reusable_Actions.scrollByPixelMethod(driver, "0","3250");

            //click on select button
            Reusable_Actions.clickMethod(driver, "//*[@aria-label='Get Hulu plan']", "click on select button");

            //enter email address

            Reusable_Actions.sendKeysMethod(driver, "//*[@id='email']", email.get(i), "enter email");

            //enter password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password']", password.get(i), "enter password");

            //enter name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='firstName']", name.get(i), "enter name");


            //enter birth month

            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "click on birth month");
            Reusable_Actions.SendKey2Method(driver, "//*[@id='birthdayMonth-menu']", birthmonth.get(i), "select birth month");


            //enter birth day
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "click on birth day");
            Reusable_Actions.SendKey2Method(driver, "//*[@id='birthdayDay-menu']", Birthday.get(i), "select day");

            //enter birth year
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "click on birth year");
            Reusable_Actions.SendKey2Method(driver, "//*[@id='birthdayYear-menu']", Birthyear.get(i), "select Year");

            //Select Gender
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "click on Gender");
            Reusable_Actions.SendKey2Method(driver, "//*[@id='gender-menu']", Gender.get(i), "select Year");

            //click on continue button
            Reusable_Actions.submitMethod(driver, "//*[text()='CONTINUE']", "Click on continue button");

            //capture subscription amount
            String result = Reusable_Actions.getTextMethod(driver, "//*[@class='ledger__item']", "capture subcription amount");
            System.out.println("My subscription amount " + result);

            //capture total amount due
            String results = Reusable_Actions.getTextMethod(driver, "//*[@class='summary__price']", "capture total amount due");
            System.out.println("My total amount due " + results);

            //Clear history
            driver.manage().deleteAllCookies();


        }
    }//end of loop

    //end of test user case 1


    @Test(dependsOnMethods = "Hulu")
    public void Login() {

        driver.navigate().to("https://www.hulu.com");

        //click on login
        Reusable_Actions.clickMethod(driver, "//*[text()='Log In']", "click Login");

        //enter email
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='email_id']", "lalamusakharian234@gmail.com", "entering email");

        //enter password
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='password_id']", "Pakistan123", "enetring password");

        //click in login button
        Reusable_Actions.clickMethod(driver, "//*[@class='jsx-4282396490 button-dark login-button']", "clicking on login button");

        //verify login by getting user name text on home page
        String username = Reusable_Actions.getTextMethod(driver, "//*[text()='Mohsin Raza']", "get user name text");
        System.out.println("The user name is " + username);
    }//end of @test user case 2


    @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite
}









