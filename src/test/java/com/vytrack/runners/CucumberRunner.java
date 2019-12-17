package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//src/test/resources/features
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",    //path to features
        glue = "com\\vytrack\\step_definitions", //path to step definitions
        dryRun = false,  //if you make it true, it will not run your test, just check you have code for each test step
        tags = "",//whatever you put inside tags, only that test cases will run with has that tag
        plugin = {"html:target/default-cucumber-reports"} //default report from cucumber
        )
public class CucumberRunner {
}
//DO NOT FORGET TO DOWNLOAD CLASS NOTES !!!!!!!!!!!!!