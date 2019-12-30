package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//src/test/resources/features
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",    //path to features
        glue = "com\\vytrack\\step_definitions", //path to step definitions
        dryRun = true,  //if you make it true, it will not run your test, just check you have code for each test step
        tags = "@login_with_roles_ddt_2",        //whatever you put inside tags, only that test cases will run with has that tag
        plugin = {"html:target/default-cucumber-reports", "json:target/cucumber.json"} //default report from cucumber
        )
public class CucumberRunner {
}