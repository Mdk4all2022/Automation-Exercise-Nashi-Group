package com.cydeo.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends ParentPage{
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedMessage;

    @FindBy(xpath = "//a[text()[normalize-space() =  'Delete Account']]")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButtonAfterCreate;
//span[text()='Close']
@FindBy(xpath = "//span[text()='Close']")
public WebElement popUpsCloseButton;

    @FindBy(xpath = "//b")
    public WebElement loggedInAsUser;
@FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement accountDeleteMessage;
@FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButtonAfterDelete;
}
