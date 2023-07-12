package com.cydeo.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserMessage;


    @FindBy(name = "name")
    public WebElement nameInputBox;
    @FindBy(xpath = "//form[@action='/signup']/input[@placeholder='Email Address']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpButton;

}
