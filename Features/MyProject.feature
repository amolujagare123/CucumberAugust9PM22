Feature: All login scenarios on billing page

  Background: before all scenario
    Given Open the browser
    And maximize it

  @login @valid
  Scenario: to test the functionality of login button on billing page for valid input
    Given Login on billing page should be opened
 #   When I enter correct username and correct password on billing page
    When I enter "admin" as username and "admin" as password
    And I Click on login button on billing page
    Then I should land on the dashboard

  @login @invalid
  Scenario: to test the functionality of login button on billing page for invalid input
    Given Login on billing page should be opened
 #    When I enter incorrect username and incorrect password on billing page
    When I enter "invalid-1" as username and "invalid-1" as password
    And I Click on login button on billing page
    Then I should get error

  @login  @blank
  Scenario: to test the functionality of login button on billing page for blank input
    Given Login on billing page should be opened
  #   When I enter blank username and blank password on billing page
    When I enter "" as username and "" as password
    And I Click on login button on billing page
    Then I should get another error

    @userRegistration
    Scenario: to test the functionality of submit
      Given I am on user registration page
      When I enter below Data
      | amol | ujagare | amol@gmail.com | 787878 |
      And I click on submit
      Then user should be added


      @subscription
      Scenario Outline: to test the functionality of subscribe button
        Given I am on user subscription page
        When I enter <name> , <contact> , <email>
        And I click on subscribe
        Then user should be subscribed
        Examples:
          | name        | contact  | email        |
          | Leela       | 19898998 |  l@gmail.com |
          | Nilesh      | 29898998 | n1@gmail.com |
          | Nitin       | 39898998 | n2@gmail.com |
          | Pradip      | 49898998 | p1@gmail.com |
          | Preeti      | 59898998 | p2@gmail.com |
          | Purushottam | 69898998 | p3@gmail.com |
          | Shalini     | 79898998 | s1@gmail.com |
          | Shiva       | 89898998 | s2@gmail.com |
          | Vivekanand  | 99898998 |  v@gmail.com |



