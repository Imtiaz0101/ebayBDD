Feature: Search bar functionality
  @chrome @smoke
  Scenario: Verify user can search items in the search bar
    Given User is at eBay homepage
    When User types toys into search bar
    And User presses search button
    Then User should only see toys
    And User closes browser


