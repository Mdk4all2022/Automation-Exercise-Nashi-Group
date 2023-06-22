package com.cydeo.tests.week_02.evening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001 {

    /*
    Mac     -->  command+N : creating methods
    Windows -->  Alt+insert : creating methods
     */

    @Test
    public void test001() {
    //    **  TC001 As a user I should be able to click checkboxes

    //    1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    //    2-goto https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");
    //    3-click Checkboxes

      //  WebElement element = driver.findElement(By.xpath("//ul[@class='list-group']/li/a[.='Checkboxes']"));
       // element.click();
          clickElementForPractice(driver,"Autocomplete");
    //    4-verify title equals Checkboxes
        Assert.assertEquals(driver.getTitle(),"Checkboxes");
    //    5-click Checkbox 1

        WebElement checkbox1 = driver.findElement(By.xpath("//form/input[@id='box1']"));
        checkbox1.click();
        //    6-verify the Checkbox 1 is selected
        Assert.assertTrue(checkbox1.isSelected());

    //    7-click Checkbox 2


    //    8-verify the Checkbox 2 is not selected



    }


    public static void clickElementForPractice(WebDriver driver,String elementName){
        String locator="//ul[@class='list-group']/li/a[.='"+elementName+"']";
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }
}
