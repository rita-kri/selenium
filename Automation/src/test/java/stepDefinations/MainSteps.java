package stepDefinations;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on the Netbanking Landing page")
	public void user_is_on_the_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on the Netbanking Landing page");
	}
	
	@Given("User is on the practise Landing page")
	public void user_is_on_the_practise_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on practise Landing page");
	}
	
	@When("user Sign Up into the application")
	public void user_sign_up_into_the_application(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	
//	@When("user login into the application")
//	public void user_login_into_the_application() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("user login into the application");
//	}
	
	@When("user login into the application with {string} and password {string}")
	public void user_login_into_the_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(username + " and password is " + password);
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home page is displayed");
	}
	@Then("cards are displayed")
	public void card_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("cards are displayed");
	}
	
	@Given("set up the enteries in the database")
	public void setUpEntries() {
		System.out.println("***************************");
		System.out.println("set up the enteries in the database");
	}
	
	@When("launch the browser in config variables")
	public void launchBrowser() {
		System.out.println("launch the browser in config variables");
	}
	
	@And("hit the homw page url in banking site")
	public void hitUrl() {
		System.out.println("hit the homw page url in banking site");
	}
	
	@When("hit the home page url in banking site")
	public void hit_the_home_page_url_in_banking_site() {
	    System.out.println("hit the home page in mrtage site");
	}
	
	

}
