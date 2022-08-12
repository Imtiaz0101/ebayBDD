Feature: End to end testing
@chrome
  Scenario: Verify a guest can checkout an item from start to finish
    Given User is on eBay homepage
    When User clicks on electronics 
    And User clicks on Apple
    And User clicks on Apple product
    And User clicks on Add to Bag button
    And User clicks on cart button
    And User clicks on Checkout button
    And User clicks on Continue as Guest button
    Then User should be able to checkout their item
    
    

  
