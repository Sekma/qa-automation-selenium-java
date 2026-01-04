package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.e2etests.automation.page_objects.MultipleSelectDropDownPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleSelectDropDownStepDefinition {

    MultipleSelectDropDownPage multipleSelectDropDownPage;

    public MultipleSelectDropDownStepDefinition(){
        this.multipleSelectDropDownPage = new MultipleSelectDropDownPage(); 
    }
    
@When("je selectionne les choix {string} et {string} au multiple select menu")
public void jeSelectionneLesChoixEtAuMultipleSelectMenu(String choice1, String choice2) {
    multipleSelectDropDownPage.selectChoices(choice1, choice2);
}

@Then("les deux elements sont selectionnés")
public void lesDeuxElementsSontSelectionnés() {
 assertTrue(multipleSelectDropDownPage.getNumberOfChoices() == 2);
}
}
