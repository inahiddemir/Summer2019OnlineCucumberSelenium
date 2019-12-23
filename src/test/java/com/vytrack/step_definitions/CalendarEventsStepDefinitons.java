package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CalendarEventsStepDefinitons {

    //if its one column use list
    //if its two columns use maps
    //if its more than 2 use table

        /*
          Scenario: Verify column names
    Given user is on the login page
    And user logs in as store manager
    Then  user navigates to "Activities" then to "Calendar Events"
    And user verifies that column names are displayed
    | TITLE               |
    | CALENDAR            |
    | START               |
    | END                 |
    | RECURRENT           |
    | RECURRENCE          |
    | INVITATION STATUS   |
         */
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


    @Then("user verifies that column names are displayed")
    public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        calendarEventsPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable , calendarEventsPage.getColumnNames());
    }
}
