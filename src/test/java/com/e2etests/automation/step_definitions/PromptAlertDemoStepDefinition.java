package com.e2etests.automation.step_definitions;

import static org.junit.Assert.assertTrue;

import com.e2etests.automation.page_objects.PromptAlertDemoPage;

import io.cucumber.java.en.When;

public class PromptAlertDemoStepDefinition {

    private PromptAlertDemoPage promptAlertDemoPage;
    public PromptAlertDemoStepDefinition(){
        this.promptAlertDemoPage = new PromptAlertDemoPage();
    }

@When("je clique sur le bouton prompt alert")
public void jeCliqueSurLeBoutonPromptAlert() {
   promptAlertDemoPage.clickOnPromptButton();
}
@When("je saisie le text {string} dans l alert prompt")
public void jeSaisieLeTextDansLAlertPrompt(String text) {
   promptAlertDemoPage.fillPromptText(text);
}
@When("le message alert prompt est affiché {string}")
public void leMessageAlertPromptEstAffiché(String text) {
   assertTrue(promptAlertDemoPage.getPromptResult().contains(text));
}
}
