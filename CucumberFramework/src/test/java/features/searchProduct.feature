Feature: Search and Place the order of Products
@OffersPage
Scenario Outline: Seach Experience for product search in both home and other page

Given User is on GreenCart Landing page
When user searched with shortname <Name> and extracted actual name pf product 
Then user searched for <Name> shortname in offers page 
And  validate product name in offers page matches with Landing Page.

Examples:
|	Name	|
|	Tom		|
|	Beet	|			
