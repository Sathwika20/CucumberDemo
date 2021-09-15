Feature: Application Login

  Scenario: Home page default login
    Given user is on NetBanking landing page
    When user login into application with "jin" and "1234"
    Then home page is populated
    And all displayed cards are "true"

  Scenario: Home page default login
    Given user is on NetBanking landing page
    When user login into application with "jhon" and "4321"
    Then home page is populated
    And all displayed cards are "false"
