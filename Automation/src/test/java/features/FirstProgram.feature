
Feature: Application login

Background:
Given set up the enteries in the database
When launch the browser in config variables
And hit the home page url in banking site
  
  Scenario: Admin Page default login
	
	Given User is on the Netbanking Landing page
	When user login into the application with "admin" and password "1234"
	Then Home page is displayed
	And cards are displayed
	
	#Reusable
	
	
Scenario: User Page default login
	
	Given User is on the Netbanking Landing page
	When user login into the application with "user" and password "7890"
	Then Home page is displayed
	And cards are displayed
 
 @SmokeTest
 Scenario Outline: User Page default login
	
	Given User is on the Netbanking Landing page
	When user login into the application with "<Username>" and password "<Password>" 
	Then Home page is displayed
	And cards are displayed
	
	Examples: 
	| Username   | Password	|
	| debituser	 |	asdf			|
	|	credituser |	ghjk			|
	
	
	@SmokeTest
 Scenario: User Page default Sign Up
	
	Given User is on the practise Landing page
	When user Sign Up into the application
	| Rahul |
	| Shetty |
	| conatct@email.com |
	| 234567189 |
	Then Home page is displayed
	And cards are displayed

   
