Feature: Check add to cart item

  @chrome
  Scenario: User should able to add iteam to cart
    Given user is on ebay search area 
    And user  write iteam name in search box
    When user see the iteam
    And user click the iteam
    And user click add to cart button
    And user click go to cart button
    Then user able to see the iteam in cart
