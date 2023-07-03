package com.cydeo.tests.avengers.week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class IframePractice {

//Task 1:  Iframe
//
// - Open "https://demoqa.com/frames"
// - Verify child frames texts are equal : "This is a sample page"

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // 1- Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void iframe_test(){

        // - Open "https://demoqa.com/frames"
        driver.get("https://demoqa.com/frames");

       // - Verify child frames texts are equal : "This is a sample page"

        driver.switchTo().frame(2);

        WebElement header = driver.findElement(By.id("sampleHeading"));

        String actualHeader = header.getText();
        String expectedHeader = "This is a sample page";

        Assert.assertEquals(actualHeader,expectedHeader,"Header text verification failed!");


    }

}
