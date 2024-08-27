@login @regression

Feature: WebDriver University - Login Page

  Background:
    Given I asscess the webdriver university login page

  Scenario: Validate Successful Submission - Correct Data
    When I enter a correct username webdriver
    And I enter a correct password webdriver123
    And I click in the login button
    Then I should be presented with a validation success message

  Scenario: Validate Successful Submission - Incorrect Data
    When I enter a incorrect username ddd
    And I enter a inorrect password ddd
    And I click in the login button
    Then I should be presented with a validation unsuccess message

  Scenario Outline: Validate - Successful & Unsuccessful Login
    When I enter a user name <username>
    And I enter a password <password>
    And I click in the login button
    Then I should be presented with the following login validation message <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
      | joe_blogs | password     | validation failed      |