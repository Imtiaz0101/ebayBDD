Feature: Top Menu Bar functionality


@chrome
Scenario: verify usre should be able to find their desired item via the top menu bar.

Given User is on eBay home page 
When User click on electronics
And User clicks on cell phones,smart watches & accessories
And User clicks on cell phone & smartphone
And User click on Apple
Then User successfully see Apple related items.