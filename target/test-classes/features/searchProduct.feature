Feature: Search and Place the order for Products

Scenario: Search Experience for in Home and Offers page
Given User is on Greencart Landing page
When User searched with shortname "Tom" and extracted actual name of product
Then user searched for "Tom" shortname in offers page
And validate the product name in offers page matches with Landing page