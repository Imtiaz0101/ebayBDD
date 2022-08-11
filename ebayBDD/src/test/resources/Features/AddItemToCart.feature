Feature: Add Item to cart functionaliy

@chrome

  Scenario: User able to add item in the cart
 
    Given User is on ebay page
    When User search Java book inside search botton
    And User click on search
    And User click on  java book
    And User click on view and add a cart
    Then User should be able to see the add item in the  cart
