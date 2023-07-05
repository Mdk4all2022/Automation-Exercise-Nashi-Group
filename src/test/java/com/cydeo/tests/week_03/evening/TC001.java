package com.cydeo.tests.week_03.evening;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class TC001 extends TestBase {
    /*
    command+N ---> MAc
    Alt+insert ---> Windows
     */


    @Test
    public void test001() {

     //   Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target

     //   Test Scenario:

    //    Step 1- Go to the above URL.
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    //    Step 2- Get the current window’s handle and write to the console window. It must be the first window handle.
        System.out.println(driver.getWindowHandle());

        //    Step 3- Locate the “Visit W3Schools.com!” link and click it.
      //  driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='iframe']//iframe")));
        driver.findElement(By.xpath("//a[normalize-space()='Visit W3Schools.com!']")).click();
    //    Step 4- Get all window handles and hold them in a list.
        Set<String> windowHandles = driver.getWindowHandles();
        //    Step 5- Write to total window handle number to the console. It must be 2.
        System.out.println(windowHandles);
        String secondwindowHandle = new ArrayList<String>(windowHandles).get(1);
        System.out.println();
        System.out.println(windowHandles.size());
        //    Step 6- Switch to the second window.
        driver.switchTo().window(secondwindowHandle);
/*
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

 */


    //    Step 7- Get the current window’s handle and write to the console window. It must be a second window handle.
    //    Step 8- Check the upper left side logo in the second window.
    //    Step 9- Go back (Switch) to the first window.
    //    Step 10- Get the current window’s handle and write to the console window. It must be the first window handle.
    //    Step 11- Check the See Run Button Text. It must contain “Run >” text.

    }
}
