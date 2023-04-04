Feature: Test and Verify end to end Buy Product flow

@Smoke1
Scenario: Add Product to card 
Given User is on homepage 
And User click on Laptop and Notebooks menu 
And User click on show all Laptop and Notebooks
When User select HP Laptopn to buy
And User click on add to cart button
And User click on shopping cart link 
And User click on checkout to add billing detials 

@Smoke2
Scenario Outline: Add Billing details to buy order 
Given User is on checkout page 
When User enter Billing Details with Firstname as "<Firstname>" ,Lastname as "<Lastname>",Address as "<Address 1>",City as "<City>",Postcode as "<Postcode>",Country as "<County>",State as "<State>" 
And User click on continue button for delivery details 
And User select delivery details 
And User click on continue button for delivery method
And User accept term and conditions for delivery 
And User click on continue for payement method
And User click on continue button for confirm order
Then User click on confirm order button 
And User verify order has been placed 

Examples: 
| Firstname | Lastname | Address 1 | City | Postcode | Country | State |
| Abhishek | Deshpande | NaviMumbai | Mumbai | 400709 | "India" | Maharahstra |