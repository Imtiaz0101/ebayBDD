Feature: Registration functionality

  @sanity @chrome
  Scenario: The user should not be able to register for an account using invalid data
    Given User is on  page ebay registration page
    When the User inputs first name
    And inserts last name
    And User inserts an used email address
    And Inserts a password
    And Click on the Create Account button
    Then User should receive an error message regarding used email
