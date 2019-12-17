package com.vytrack.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinitons {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the login page");
    }

    @Then("user logs is as store manager")
    public void user_logs_is_as_store_manager() {
        System.out.println("Login as store manager");
    }

    //any string in "word" will become a parameter for step definition method
    //  And user verifies that "Dashboard" page subtitle is displayed
    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verifying page subtitle: "+string);
    }

    @Then("user logs is as driver")
    public void user_logs_is_as_driver() {
        System.out.println("Login as driver");
    }

    @Then("user logs is as sales manager")
    public void user_logs_is_as_sales_manager() {
        System.out.println("Login as sales manager");
    }

}
