package com.cydeo.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUp_signIn_Button;

    @FindBy(xpath = "//a[text()=' Home']")
    public WebElement homeButton;
}
