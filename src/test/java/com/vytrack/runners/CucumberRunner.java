package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//src/test/resources/features
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features"
)
public class CucumberRunner {
}
