package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AlertAcceptPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertAcceptStepDefinition {

	private AlertAcceptPage alertAcceptPage;

	public AlertAcceptStepDefinition() {
		this.alertAcceptPage = new AlertAcceptPage();
	}
	@Given("je me connecte sur le site demoqa")
	public void jeMeConnecteSurLeSiteDemoqa() {
		alertAcceptPage.goToUrl();
	}
	@When("je clique sur le bouton alert")
	public void jeCliqueSurLeBoutonAlert() {
		alertAcceptPage.clickOnAlertButton();
	}
	@When("j accepte le message alert")
	public void jAccepteLeMessageAlert() {
		alertAcceptPage.acceptAlert();
	}
	@Then("le message alert est acceppter et je me redirige vers la page home {string}")
	public void leMessageAlertEstAcceppterEtJeMeRedirigeVersLaPageHome(String title) {
		String currentTitle = Setup.getDriver().getTitle();
		Assert.assertEquals(currentTitle, title);
	}



	
}
