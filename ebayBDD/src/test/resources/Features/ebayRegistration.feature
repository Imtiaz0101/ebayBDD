Feature: Ebay Rehistration

  @chrome
  Scenario: user can not registration by using used email
    Given user is on ebay home page
    When user click register link
    Then user nevigated to register page
    And user input first name
    And user input last name
    And user input used email
    And user create password
    Then user click create button
