package com.cydeo.tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"html:target/cucumber-reports.html",
                //"rerun:target/rerun.txt",
                //"me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/tests/step_definitions",
        dryRun = false,
        tags = "",
        publish = false  //generating a report with public link
)
public class CukesRunner {}
