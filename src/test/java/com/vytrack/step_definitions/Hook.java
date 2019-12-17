package com.vytrack.step_definitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before //it should come from io.cucumber NOT JUnit  - if you get Junit before method its not working properly
    public void setup(){
        System.out.println("#####################################");
        System.out.println("Test setup!");
    }

    @After  ////it should come from io.cucumber NOT JUnit  - if you get Junit after method its not working properly
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println("Test failed!");
            //we will take screenshot and add it to the report in the future
        } else {
            System.out.println("Cleanup");
            System.out.println("Test completed");
        }
        System.out.println("#####################################");
    }
}
