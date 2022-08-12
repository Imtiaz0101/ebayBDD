Feature: EBay Shop By Category

  @sanity @chrome
  Scenario: The user should be able to browse different products by category
    Given User is on page ebay home page
    When User clicks on Shop By Category
    And chooses Clothing and Accessories
    And clicks on Men's Clothing
    And clicks on Men's Shirts
    Then ist should have products of "Shirts"
