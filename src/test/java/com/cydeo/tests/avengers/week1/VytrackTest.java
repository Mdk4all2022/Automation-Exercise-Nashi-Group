package com.cydeo.tests.avengers.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VytrackTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1- Setup the "browser driver"
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- Go to "https://vytrack.com/"
        driver.get("https://vytrack.com/");

    }


    @Test
    public void vytrack_aboutus_link_test(){

        // 3- Click "About us" link
        WebElement aboutusLink = driver.findElement(By.xpath("(//a[@href='https://vytrack.com/about-us/'])[1]"));
        aboutusLink.click();

        // 4- Verify the url contains "about-us"
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl= "about-us";

        Assert.assertTrue(actualUrl.contains(expectedUrl),"About us link url verification failed!");

    }


}
