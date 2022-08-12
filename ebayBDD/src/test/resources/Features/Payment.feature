Feature: Payment options functionality
@chrome
 Scenario: Verify user cannot checkout with invalid payment information
    Given User is on ebay gamecube controller item page
    When User clicks on add to cart
    And User clicks on "No" for protection plan
    And User clicks on checkout now
    And User clicks on continue as guest
    And User enters valid shipping credentials
    And User clicks on done
    And User clicks on the shipping suggestion
    And User clicks on Add new card
    And User enters invalid card number 
    And user clicks on done again
    Then User will see the message "Looks like something wasn't correct. Please enter the payment details again."
  