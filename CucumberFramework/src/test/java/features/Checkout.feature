Feature: Place the order of Products

@PlaceOrder
Scenario Outline: Seach Experience for product search in both home and other page

Given User is on GreenCart Landing page
When user searched with shortname <Name> and extracted actual name pf product 
And added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And  Verify the user has ability to enter the promo code and place the order

Examples:
|	Name	|
|	Tom		|
|	Cauliflower	|			
