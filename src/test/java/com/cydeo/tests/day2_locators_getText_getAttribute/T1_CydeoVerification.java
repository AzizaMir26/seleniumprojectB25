package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

      //  TC #1: Cydeo practice tool verifications
      //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


      //  2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

      //  3. Verify URL contains
      //  Expected: cydeo
        String expectedUrl="cydeo";
        String actualUrl= driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url Verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

      //  4. Verify title:
      //  Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle= driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification Passed!");
        }else{
            System.out.println("Title Verification Failed!");
        }

        driver.close();



    }
}
