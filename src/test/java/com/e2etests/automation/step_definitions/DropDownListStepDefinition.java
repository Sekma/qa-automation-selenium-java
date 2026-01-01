package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.DropDownListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownListStepDefinition {
	private DropDownListPage dropDownListPage;

	public DropDownListStepDefinition() {
		this.dropDownListPage = new DropDownListPage();
	}
	@Given("je me connecte sur le site demoqa select menu")
	public void jeMeConnecteSurLeSiteDemoqaSelectMenu() {
		dropDownListPage.goToUrl();
	}
	@When("je selectionne le choix black au select menu")
	public void jeSelectionneLeChoixBlackAuSelectMenu() {
		dropDownListPage.selectTheOptionByIndex(5);
	}
	@Then("l element black est selectionné {string}")
	public void lElementBlackEstSelectionné(String option) {
		Assert.assertEquals(option, dropDownListPage.selectedOption());
	}



}
