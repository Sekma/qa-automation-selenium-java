package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.e2etests.automation.page_objects.PlaceholderDemoPage;

import io.cucumber.java.en.Then;

public class PlaceholderDemoStepDefinition {

    private PlaceholderDemoPage placeholderDemoPage;

    public PlaceholderDemoStepDefinition(){
        this.placeholderDemoPage = new PlaceholderDemoPage();
    }

@Then("le text du placeholder est affiché {string}")
public void leTextDuPlaceholderEstAffiché(String currentPlaceholderText) {
    assertEquals(placeholderDemoPage.getPlaceholderText(), currentPlaceholderText);
}

}
