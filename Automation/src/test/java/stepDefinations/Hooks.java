package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void netBankingSetUp() {
		System.out.println("****************************************");
		System.out.println("set up the enteries in NetBanking Database");
	}
	
	@After
	public void tearDown() {
		System.out.println("Clear the enteries");
	}
	
	@Before("@Mortage")
	public void mportageSetUp() {
		System.out.println("set up the enteries in Mortage Database");
	}

}

//Before ->Background ->Scenario ->After