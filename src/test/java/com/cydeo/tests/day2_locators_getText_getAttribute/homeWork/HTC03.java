package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTC03 {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.

        WebElement gmailIconTopRight = driver.findElement(By.linkText("Gmail"));
        gmailIconTopRight.click();

        //4- Verify title contains:
        //  Expected: Gmail
        String expectedPartialTitle ="Gmail";
        String actualPartialTitle= driver.getTitle();

        if(actualPartialTitle.contains(expectedPartialTitle)){
            System.out.println("Title contains Gmail. Verification Passed!");
        }else{
            System.out.println("Title doesn't contain Gmail. Verification Failed!");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google
        String expectedTitleWhenBack = "Google";
        String actualTitleWhenBack = driver.getTitle();
        if (actualTitleWhenBack.equals(expectedTitleWhenBack)) {
            System.out.println("Title after returning back is Google.Verification Passed!");
        }else{
            System.out.println("Title after returning back is NOT Google.Verification Failed!");
        }
        driver.close();
    }
}
