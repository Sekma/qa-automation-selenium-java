package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.ElementHiddenPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElementHiddenStepDefinition {
	
	private ElementHiddenPage elementHiddenPage;
	public ElementHiddenStepDefinition() {
		this.elementHiddenPage = new ElementHiddenPage();
	}
	
	@Given("je me connecte sur la page letskodeit")
	public void jeMeConnecteSurLaPageLetskodeit() {
		elementHiddenPage.goToUrl();
	}
	@When("je clique sur le bouton pour masquer le champ de saisie")
	public void jeCliqueSurLeBoutonPourMasquerLeChampDeSaisie() {
		elementHiddenPage.clickHiddenButton();
	}
	@When("je saisis le texte {string} dans le champ")
	public void jeSaisisLeTexteDansLeChamp(String string) {
		elementHiddenPage.fillText(string);
	}
	@Then("le texte {string} est présent dans le champ même s’il est masqué")
	public void leTexteEstPrésentDansLeChampMêmeSIlEstMasqué(String string) {
		String currentText = elementHiddenPage.isTextPresent();
		Assert.assertEquals(currentText, string);
	}
	@When("je clique sur le bouton pour afficher le champ de saisie")
	public void jeCliqueSurLeBoutonPourAfficherLeChampDeSaisie() {
		elementHiddenPage.clickShowButton();
	}
	@Then("le champ de saisie est visible avec le texte {string}")
	public void leChampDeSaisieEstVisibleAvecLeTexte(String string) {
		Assert.assertTrue(elementHiddenPage.isTextDisplayed());
	}



}
