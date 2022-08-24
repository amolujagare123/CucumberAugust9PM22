Feature: All login scenarios

  Scenario: to test the functionality of login button for valid input
    Given Login page should be opened
    When I enter correct username and correct password
    And I Click on login button
    Then I should land on home page
