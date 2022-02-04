package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1 - Set Up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //this line will maximize the browser
        driver.manage().window().maximize();


        //3-go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        //  System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current url using selenium
        String currentUrl= driver.getCurrentUrl();
        System.out.println("CurrentUrl = " + driver.getCurrentUrl());

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to();
        driver.navigate().to("https://www.google.com");

        //get the title of the page
      //  System.out.println("driver.getTitle() = " + driver.getTitle());
       currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current url using selenium
       currentUrl= driver.getCurrentUrl();

        System.out.println("CurrentUrl = " + driver.getCurrentUrl());

       //this will close the currently opened window
        driver.close();

        //this will close all the opened windows
        driver.quit();
    }
}
