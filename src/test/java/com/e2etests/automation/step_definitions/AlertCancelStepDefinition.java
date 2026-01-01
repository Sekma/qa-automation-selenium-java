package com.e2etests.automation.step_definitions;
import org.junit.Assert;

import com.e2etests.automation.page_objects.AlertCancelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertCancelStepDefinition {
	
	private AlertCancelPage alertCancelPage;

	public AlertCancelStepDefinition() {
		this.alertCancelPage = new AlertCancelPage();
	}

	@When("je clique sur le bouton confirm alert")
	public void jeCliqueSurLeBoutonConfirmAlert() {
		alertCancelPage.clickOnConfirmButton();
	}
	@Then("un message d acceptation est affiché {string}")
	public void unMessageDAcceptationEstAffiché(String accept) {
		String result = AlertCancelPage.confirmResult.getText();
		Assert.assertTrue(result.contains(accept));
	}

	@When("j annule le message alert")
	public void jAnnuleLeMessageAlert() {
		alertCancelPage.dismissAlert();
	}
	@Then("un message d'annulation est affiché {string}")
	public void unMessageDAnnulationEstAffiché(String cancel) {
		String result = AlertCancelPage.confirmResult.getText();
		Assert.assertTrue(result.contains(cancel));
	}




}
