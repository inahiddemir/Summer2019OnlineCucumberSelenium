package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before //it should come from io.cucumber NOT JUnit  - if you get Junit before method its not working properly
    public void setup(){
        System.out.println("#####################################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }

    @After  ////it should come from io.cucumber NOT JUnit  - if you get Junit after method its not working properly
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            System.out.println("Cleanup");
            System.out.println("Test completed");
        }
        System.out.println("#####################################");
        //After every test we are gonna close the browser
        Driver.close();
    }
}
