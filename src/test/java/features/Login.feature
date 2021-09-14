Feature: Application Login

  Scenario: Home page default login
    Given user is on NetBanking landing page
    When user login into application with username and password
    Then home page is populated
    And all the cards are displayed
