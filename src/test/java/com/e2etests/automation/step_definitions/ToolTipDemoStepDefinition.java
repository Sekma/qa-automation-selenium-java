package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.e2etests.automation.page_objects.ToolTipDemoPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolTipDemoStepDefinition {

    private ToolTipDemoPage toolTipDemoPage;
    public ToolTipDemoStepDefinition(){
        this.toolTipDemoPage = new ToolTipDemoPage();
    }

@Given("je suis sur la page toul tip")
public void jeSuisSurLaPageToulTip() {
    toolTipDemoPage.goToUrl();
}
@When("je survole sur le bouton")
public void jeSurvoleSurLeBouton() {
    toolTipDemoPage.hoverOnButton();
}
@Then("le tool tip est affiché {string}")
public void leToolTipEstAffiché(String currentToolTipText) {
    assertEquals(toolTipDemoPage.getToolTipText(), currentToolTipText);
}
}
