
Feature: Login Functionality

  Scenario: Login to site Saucedemo
    Given I open the Saucedemo url
    Then I enter username and password
    And I click on login button
    And I validate login is successfully done

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I open the Saucedemo url
    Given I have entered invalid "<username>" and "<password>"
    And I click on login button

    Examples:
      | username          | password        |
      | invalid@email.com | invalidPassword |
      | abcccc            | validPassword   |
      | valid@email.com   | abccc           |



 
