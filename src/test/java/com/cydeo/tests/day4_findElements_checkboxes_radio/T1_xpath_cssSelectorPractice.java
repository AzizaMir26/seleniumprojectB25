package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelectorPractice {
    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver  =WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //locate  Home link using cssSelector
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
                //syntax2 //Locate Home lInk using css Selector class
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));
                //Locate Home lInk using css Slector href
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //Locate Header using cssSelector:locate parent and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));

        //Locate Header using xpath, and using element text
        // WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));  2nd opt
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text relative xpath
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box relative xpath
        WebElement emailInputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        //locate E-mail input box relative xpath contains method

        // //tagName[contains(@attribute,'value')]
        WebElement emailInputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@type='submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoTxt  = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible




    }
}
