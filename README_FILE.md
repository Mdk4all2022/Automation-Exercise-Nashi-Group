Automation Task
Automated Scenario in BDD approach written in Gherkin Language  , in JAVA code Selenium automations tool  with Cucumber/Junit.


This test automation framework is created as a solution for the QA Automation For Automation Exercise website.
Test scenarios are written in Gherkin language according to the task. The codes are written in Java programming language
with the implementations of object-oriented-programming (OOP) concepts. Page object model (POM)
and Singleton design  pattern are also implemented in the framework, and it can be run in Parallel using DriverPool .

Application under test still have issues with automated the dynamic pop-ups.


Info about the framework
Codes are written as dynamic as possible to increase the readability, re-usability and maintainability of the framework. For example;

Google Chrome is default browser for now but it can be easily changed by updating configuration.properties file,
The website to navigate and window size can be updated through configuration.properties file as well,
Random class from Java is used for adding a random item each time,
The number of the items to added to cart can be decided only by providing an int value to corresponding lines of Purchase.feature file,
User details can be  generated by Java Faker library to avoid hard-coding, and it also can be retrieved from configuration.properties file,
If the tests fail, the failed one/s will be executed once again to be able to minimize synchronization problems,
Screenshot will be taken and stored under the \target\ folder for the failed scenarios,
What can be done as the next step?
More scenarios can be added.
Reporting
Reports are generated by Cucumber automatically under /target/default-html-reports package. Beside that simple reporting, more detailed
and fancy reporting is also used in the framework by adding maven-cucumber-reporting plug-in inside the pom.xml file.
Those reports can be reached under /target/cucumber-html-reports. To able to get those fancy reports, the code should be executed through maven
lifecycle or from the terminal with the command of mvn verify. In the case of test failures, a screen-shot of the related page is embedded into
the report.

Pre_requisites
Java 11 SDK should be installed
IntelliJ IDE (any IDE is fine)
Maven as buid management tool
Browser drivers are fetching automatically from bonigarcia dependency, so no need to identify the browser version
How to execute
https://github.com/ratilgan/UltraTask/
Use the following command to clone the project git clone https://github.com/ratilgan/UltraTask/
Use the following command to run the project mvn verify -D"cucumber.filter.tags"="@wip"
WebDriverManager 5.3.3
testing 7.8.0
Java 11
Maven
Cucumber 7.3.2
JUnit 7.3.2
Selenium Webdriver 4.9.1
IntelliJ 2023.1.2
GitHub
Java Faker 1.0.2
reporting-plugin 7.3.0
