package com.cydeo.tests.avengers.week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WindowHandlePractice {

    //Task 3:  Window Handles
    //
    //   - Navigate to "https://testpages.herokuapp.com/styled/windows-test.html"
    //   - Click Basic Ajax in new page
    //   - Click Attributes in new page
    //   - Click Alerts In A New Window From JavaScript
    //   - Switch to "Element Attributes Examples" window
    //   - Assert header is Element Attributes Examples

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
    public void window_handle_test(){
        //   - Navigate to "https://testpages.herokuapp.com/styled/windows-test.html"


        //   - Click Basic Ajax in new page


        //   - Click Attributes in new page


        //   - Click Alerts In A New Window From JavaScript
        //   - Switch to "Element Attributes Examples" window
        //   - Assert header is Element Attributes Examples

    }
}
