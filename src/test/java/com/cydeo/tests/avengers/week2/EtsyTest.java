package com.cydeo.tests.avengers.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EtsyTest {

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
    public void etsy_search_result_test(){

        //TC: Etsy checkbox and radio button
        //		1. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //		2. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.cssSelector("input#global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon");



        //		3. Click on filters
        //		4. Select free shipping, on sale
        //		5. Select under $25 Click on apply filters
        //		6. Print count of results
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
