package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_practiceTool {
    public static void main(String[] args) {
        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium Webdriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //1 Make our page fullscreen
        driver.manage().window().maximize();

        //2 Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com ");

       //3 Verify URL contains
       // Expected: cydeo
        String expectedUrl="";
        boolean urlContains = expectedUrl.contains("cydeo");

        //actual url comes from the browser
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("cydeo")){
            System.out.println("Url is as expected. Verification PASSED!");
        }else{
            System.out.println("URL is NOT as expected. Verification NOT Passed!");
        }

        //4 Verify title:
       String expectedTitle = "Practice";

        //actual title comes from the browser
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected. Verification Failed!");
        }
        driver.close();
    }
}
