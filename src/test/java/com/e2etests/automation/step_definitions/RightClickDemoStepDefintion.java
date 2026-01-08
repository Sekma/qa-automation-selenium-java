package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.e2etests.automation.page_objects.RightClickDemoPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RightClickDemoStepDefintion {

    private RightClickDemoPage rightClickDemoPage;
    public RightClickDemoStepDefintion(){
        this.rightClickDemoPage = new RightClickDemoPage();
    }


@When("je clique sur le bouton right click")
public void jeCliqueSurLeBoutonRightClick() {
   rightClickDemoPage.rightClickOnButton();
}
@Then("un message de right click est affiché {string}")
public void unMessageDeRightClickEstAffiché(String message) {
   assertEquals(rightClickDemoPage.getRightClickMessage(), message);
}
}
