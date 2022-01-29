package Action_Items;

import Day9_010821.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Optional_ActionItem_Amazon {


    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();

    }//end of preconditions

    @Test(priority = 1)
    public void Amazon(){
        //Navigate to Amazon
        driver.navigate().to("https://www.amazon.com");
        //click on login button
        Reusable_Actions.clickMethod(driver,"//*[@id='nav-link-accountList-nav-line-1']","clicking on log in button");
        //enter email
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='email']","nice.ali17@gmail.com","entering email");
        //click on continue button
        Reusable_Actions.clickMethod(driver,"//*[@id='continue']","click on continue");
        //enter password
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='password']","Karmanla1","entering password");
        //click on sign in button
        Reusable_Actions.clickMethod(driver,"//*[@id='signInSubmit']","Signing In");
        //verify that youare logged in by printing the username
        String Username = Reusable_Actions.getTextMethod(driver,"//*[text()='Hello, Ali']","Print username");
        System.out.println("the username is " + Username);
        //Search for pinch collar for dogs
        Reusable_Actions.sendKeysMethod(driver,"//*[@aria-label='Search']","pinch collar for dogs","entering search key word");
        //click on search button
        Reusable_Actions.clickMethod(driver,"//*[@id='nav-search-submit-button']","clicking on search button");
        //scroll down to the bestseller
        Reusable_Actions.scrollMethod(driver,"0","600","scroll");
        //click on the bestseller
        Reusable_Actions.clickMethod(driver,"//*[@data-asin='B07S3HP16M']","clicking on bestseller");
        //click on Add to cart
        Reusable_Actions.clickMethod(driver,"//*[@id='add-to-cart-button']","Adding to cart");
        //Add protection
        Reusable_Actions.clickMethod(driver,"//*[@data-asin='B07Q44XSYX']","Add protection");
        //Proceed to checkout
        Reusable_Actions.clickMethod(driver,"//*[@aria-labelledby='attach-sidesheet-checkout-button-announce']", "Proceed to checkout");
        //Enter phone number
        //Reusable_Actions.sendKeysMethod(driver,"//*[@name='address-ui-widgets-enterAddressPhoneNumber']","3152944467","enter address");
        //enter street
       // Reusable_Actions.sendKeysMethod(driver,"//*[@placeholder='Street address or P.O. Box']","19522 sagamore avenue","enter address");
        //enter city
        //Reusable_Actions.sendKeysMethod(driver,"//*[@id='address-ui-widgets-enterAddressCity']","Queens","enter address");
        //click on Add
        Reusable_Actions.clickMethod(driver,"//*[text()='Set up Amazon PayCode']","click on setup paycode");
        // enter name to setup paycode
        Reusable_Actions.sendKeysMethod(driver,"//*[@class='a-input-text a-form-normal pmts_portal_payer_name']","Ali Raza","enetering Nmae");
        //select month from drop down
       Reusable_Actions.clickMethod(driver,"//span[text()='Month']","click on dropdown");
       Reusable_Actions.clickMethod(driver,"//a[@data-value='11'","select");





    }//end of test













}//end of java class
