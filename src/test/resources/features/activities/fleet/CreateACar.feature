Feature: Create new car

  Scenario: Write info to blanks
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Fleet" then to "Vehicles"
    And user click on "Create Car" button
    Then user adds new car information
    | License Plate  |  Driver      | Location          | Model Year  | Color |
    | Test Plates    |  Test Driver | Washington D.C.   | 2020        | Black |
