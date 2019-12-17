package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//src/test/resources/features
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",    //path to features
        glue = "com\\vytrack\\step_definitions", //path to step definitions
        dryRun = false  //if you make it true, it will not run your test, just check you have code for each test step
)
public class CucumberRunner {
}
