package stepDefinitions;

import java.io.IOException;
import java.sql.Driver;

import io.cucumber.java.After;
import utils.TextContextSetUp;

//hooks is used for precondition and postcondition clean up. Those hooks is automatically exceutued after test excueted completely.

public class Hooks {
	
TextContextSetUp textContextSetUp;	
	
	public Hooks(TextContextSetUp textContextSetUp) {
		this.textContextSetUp = textContextSetUp;
	}

	@After
	public void AfterScenario() throws IOException {
		textContextSetUp.testBase.webDriverManger().quit();
	}

}
