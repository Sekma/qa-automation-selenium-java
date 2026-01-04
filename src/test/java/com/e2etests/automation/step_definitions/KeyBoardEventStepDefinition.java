package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.e2etests.automation.page_objects.KeyBoardEventPage;
import com.e2etests.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KeyBoardEventStepDefinition {

    KeyBoardEventPage keyBoardEventPage;
    ConfigFileReader configFileReader;

    public KeyBoardEventStepDefinition(){
        this.keyBoardEventPage = new KeyBoardEventPage();
        this.configFileReader = new ConfigFileReader();
    }

@Given("je suis dans la page text box")
public void jeSuisDansLaPageTextBox() {
    keyBoardEventPage.goToUrl();
}
@When("je saisie le nom complet")
public void jeSaisieLeNomComplet() {
    keyBoardEventPage.fillFullName();
}
@When("je saisie l email")
public void jeSaisieLEmail() {
    keyBoardEventPage.fillEmail();
}
@When("je saisie l adresse")
public void jeSaisieLAdresse() {
    keyBoardEventPage.filAddress();
}
@When("je copie l adresse")
public void jeCopieLAdresse() {
    keyBoardEventPage.copyPasteAddress();
}
@When("je clique sur le bouton pour envoyer le formulaire")
public void jeCliqueSurLeBoutonPourEnvoyerLeFormulaire() {
    keyBoardEventPage.clickOnSubmit();
}
@Then("le fomulaire est envoyé")
public void leFomulaireEstEnvoyé() {
    	assertTrue(keyBoardEventPage.getSuccessText().contains(configFileReader.getProperties("key-board-envent.name")));
        assertTrue(keyBoardEventPage.getSuccessText().contains(configFileReader.getProperties("key-board-envent.email")));
        assertTrue(keyBoardEventPage.getSuccessText().contains(configFileReader.getProperties("key-board-envent.address")));
}
}
