@contact-us @regression

Feature: WebDriver University - Contact Us Page

  Background:
    Given I asscess the webdriver university contact us page

  Scenario: Validate Successful Submission - Unique Data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comments
    And I click in the submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate Successful Submission - Specific Data
    When I enter a specific first name joe
    And I enter a specific last name blogs
    And I enter a specific email address joe_blogs123@mail.com
    And I enter a specific comments "How are you?"
    And I click in the submit button
    Then I should be presented with a successful contact us submission message