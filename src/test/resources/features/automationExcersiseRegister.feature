@wip
Feature: Test Case 1 : Register User feature
  User Story:
  As a user,
  I should be able to sign/up with providing name and  email. And sign/up page should be displayed.
  and user should be able to enter all the required field to register his/her account.
  then User should be able to Delete the account successfully.

  @click
  Scenario:Testing User Register functionality and Deletion of the account
    Given user navigate the automation exercise page
    #(https://www.automationexercise.com/test_cases.)
    And user sees home page is visible successfully
    When user clicks on Signup_Login button on the top
    Then user sees the New User Signup! text visible
  @signin
    Given user go to the name input box and enter a name
    And user go to the email input box and enter a valid
    When user clicks on Signup button
    Then user should see the ENTER ACCOUNT INFORMATION

@create
    And user enters all the required Account Information Title, Name, Email, Password, Date of birth
    And user select checkbox Sign up for our newsletter! and Receive special offers from our partners!
    And user enters all the required Address information First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    When user clicks on Create Account button
    Then user should see the ACCOUNT CREATED! message is visible

@delete
    Given user clicks on Continue button
    And user sees that Logged in as username is visible
    When user clicks on Delete Account button
    Then user should see the message ACCOUNT DELETED! is visible and click Continue button





