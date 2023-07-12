package com.cydeo.tests.step_definitions;

import com.cydeo.tests.pages.HomePage;
import com.cydeo.tests.pages.LandingPage;
import com.cydeo.tests.pages.LoginPage;
import com.cydeo.tests.pages.SignUpPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestCase1_Step_Definition {
    HomePage homePage=new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    String expectedData;
    String actualData;
    @Given("user navigate the automation exercise page")
    public void user_navigate_the_automation_exercise_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("automationURL"));
    }
    @Given("user sees home page is visible successfully")
    public void user_sees_home_page_is_visible_successfully() {
        expectedData="Home";
        actualData=homePage.homeButton.getText();
        Assert.assertEquals(expectedData,actualData);
    }
    @When("user clicks on Signup_Login button on the top")
    public void user_clicks_on_signup_login_button_on_the_top() {
        homePage.signUp_signIn_Button.click();
    }
    @Then("user sees the New User Signup! text visible")
    public void user_sees_the_new_user_signup_text_visible() {
    expectedData="New User Signup!";
    actualData=loginPage.newUserMessage.getText();
    Assert.assertEquals(expectedData,actualData);
    }

    @Given("user go to the name input box and enter a name")
    public void user_go_to_the_name_input_box_and_enter_a_name() {
        loginPage.nameInputBox.sendKeys(ConfigurationReader.getProperty("name"));
    }
    @Given("user go to the email input box and enter a valid")
    public void user_go_to_the_email_input_box_and_enter_a_valid() {
        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
    }
    @When("user clicks on Signup button")
    public void user_clicks_on_signup_button() {
        loginPage.signUpButton.click();

    }
    @Then("user should see the ENTER ACCOUNT INFORMATION")
    public void user_should_see_the_enter_account_information() {

        Assert.assertTrue(signUpPage.accountInformationMessage.isDisplayed());
    }
    Select selectDay;
    Select selectMonth;
    Select selectYear;
    Select selectCountry;

    @Given("user enters all the required Account Information Title, Name, Email, Password, Date of birth")
    public void user_enters_all_the_required_account_information_title_name_email_password_date_of_birth() {
        signUpPage.radioMrInputBox1.click();
      //  signUpPage.nameBox.sendKeys(ConfigurationReader.getProperty("name"));
       // signUpPage.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        signUpPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        selectDay=new Select(signUpPage.dayDropDownList);
        selectDay.selectByValue("1");
        selectMonth=new Select(signUpPage.monthDropDownList);
        selectMonth.selectByIndex(1);
        selectYear=new Select(signUpPage.yearDropDownList);
        selectYear.selectByVisibleText("2000");


       }

    @Given("user select checkbox Sign up for our newsletter! and Receive special offers from our partners!")
    public void user_select_checkbox() {
        signUpPage.newsLetterCheckInputBox1.click();
        signUpPage.specialOffersCheckInputBox2.click();
       }

    @Given("user enters all the required Address information First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void user_enters_all_the_required_address_information_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        signUpPage.firstNameBox.sendKeys(ConfigurationReader.getProperty("name"));
        signUpPage.lastNameBox.sendKeys(ConfigurationReader.getProperty("lastName"));
        signUpPage.companyBox.sendKeys(ConfigurationReader.getProperty("company"));
        signUpPage.addressBox.sendKeys(ConfigurationReader.getProperty("address1"));
        signUpPage.address2Box.sendKeys(ConfigurationReader.getProperty("address2"));
        selectCountry=new Select(signUpPage.countryDropDown);
        selectCountry.selectByVisibleText("United States");

        signUpPage.stateBox.sendKeys(ConfigurationReader.getProperty("state"));
        signUpPage.cityBox.sendKeys(ConfigurationReader.getProperty("city"));
        signUpPage.zipcodeBox.sendKeys(ConfigurationReader.getProperty("zipcode"));
        signUpPage.mobileNumberBox.sendKeys(ConfigurationReader.getProperty("phone"));






    }

    @When("user clicks on Create Account button")
    public void user_clicks_on_create_account_button() {
        signUpPage.creatAccountBox.click();
    }
    LandingPage landingPage = new LandingPage();

    @Then("user should see the ACCOUNT CREATED! message is visible")
    public void user_should_see_the_account_created_message_is_visible() {
    Assert.assertTrue(landingPage.accountCreatedMessage.isDisplayed());
    }
    @Given("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
    landingPage.continueButtonAfterCreate.click();

        try {
            WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
          if (wait.until(ExpectedConditions.alertIsPresent())==null){
              System.out.println("Alert not Displayed");
             // Driver.getDriver().switchTo().frame(//iframe)
            //  landingPage.popUpsCloseButton.click();
          }else{
              Driver.getDriver().switchTo().alert().dismiss();

          }

        }catch (Exception e){
            e.printStackTrace();

        }

    }
    @Given("user sees that Logged in as username is visible")
    public void user_sees_that_is_visible() {
      Assert.assertTrue(landingPage.loggedInAsUser.isDisplayed());
    }
    @When("user clicks on Delete Account button")
    public void user_clicks_on_button() {
    landingPage.deleteButton.click();
    }
    @Then("user should see the message ACCOUNT DELETED! is visible and click Continue button")
    public void user_should_see_the_message_is_visible_and_click_button() {
        Assert.assertTrue(landingPage.accountDeleteMessage.isDisplayed());
        landingPage.continueButtonAfterDelete.click();


    }
}