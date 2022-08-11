
Feature: Ebay Sign in functionality 

  @chrome
  Scenario: ebay sign in with valid credintials 
    Given user now on ebay home page
    And user click signin
    And user input valid email
    And user click continue
    And user input valid password
    And user click signin button
    And user click signout drop down button
    And user click sign out
    Then user close browser
    

  