Feature: Login Page functinality

  Scenario: Log in with valid credentials
    Given I enter the URL
    And I enter the user name
    And I enter the password
    And I click on Log in button
    When I click on Log in button
    Then I logged into the System
