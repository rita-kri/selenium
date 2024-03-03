
Feature: Application login

Background:
When launch the browser in config variables
And hit the home page url in banking site
  	
	@SmokeTest @NetBanking
Scenario: User Page default login
	
	Given User is on the Netbanking Landing page
	When user login into the application with "user" and password "7890"
	Then Home page is displayed
	And cards are displayed
	

 @SmokeTest @Mortage
 Scenario Outline: Mortage User Page default login
	
	Given User is on the Netbanking Landing page
	When user login into the application with "<Username>" and password "<Password>" 
	Then Home page is displayed
	And cards are displayed
	
	Examples: 
	| Username   | Password	|
	| debituser	 |	asdf			|
	|	credituser |	ghjk			|
	
	
	

   
