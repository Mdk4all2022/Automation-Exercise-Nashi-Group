package com.cydeo.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends ParentPage {
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement accountInformationMessage;

    @FindBy(id = "id_gender1")
    public WebElement radioMrInputBox1;
    @FindBy(id = "id_gender2")
    public WebElement radioMrsInputBox2;
    @FindBy(name = "name")
    public WebElement nameBox;
    @FindBy(name = "email")
    public WebElement emailBox;
    @FindBy(name = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement dayDropDownList;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthDropDownList;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearDropDownList;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsLetterCheckInputBox1;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement specialOffersCheckInputBox2;

    @FindBy(id = "first_name")
    public WebElement firstNameBox;
    @FindBy(id = "last_name")
    public WebElement lastNameBox;
    @FindBy(id = "company")
    public WebElement companyBox;
    @FindBy(name = "address1")
    public WebElement addressBox;
    @FindBy(name = "address2")
    public WebElement address2Box;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropDown;
    @FindBy(id = "state")
    public WebElement stateBox;

    @FindBy(id = "city")
    public WebElement cityBox;

    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;
    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement creatAccountBox;
}
