package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.DoubleClickPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DoubleClickStepDefinition {
	
	private DoubleClickPage doubleClickPage;

	public DoubleClickStepDefinition() {
		this.doubleClickPage = new DoubleClickPage();
	}
	@Given("je me connecte sur le site demoqa buttons")
	public void jeMeConnecteSurLeSiteDemoqaButtons() {
		doubleClickPage.goToUrl();
	}
	@When("je clique sur le bouton double click me")
	public void jeCliqueSurLeBoutonDoubleClickMe() {
		doubleClickPage.clickOnDoubleClickButton();
	}
	@Then("un message de double click est affiché {string}")
	public void unMessageDeDoubleClickEstAffiché(String message) {
		String currentMessage = DoubleClickPage.doubleClickMessage.getText();
		Assert.assertEquals(message, currentMessage);
	}



}
