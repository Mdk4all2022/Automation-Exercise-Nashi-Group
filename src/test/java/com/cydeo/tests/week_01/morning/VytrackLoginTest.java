package com.cydeo.tests.week_01.morning;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class VytrackLoginTest {

    //TC002 As a user I should be able to see the login page
    // 1- Setup the "browser driver"
    // 2- Go to "https://vytrack.com"
    // 3- Click Login label
    // 3- Verify the title contains "Login"


    @Test
    public void vytrack_title_verification_test(){
        // 1- Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");

        // 3- Click Login label
        WebElement loginLink = driver.findElement(By.xpath("(//a[.='LOGIN'])[1]"));
        loginLink.click();


        // 3- Verify the title contains "Login"

    }


}
