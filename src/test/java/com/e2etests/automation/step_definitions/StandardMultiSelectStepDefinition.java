package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.e2etests.automation.page_objects.StandardMultiSelectPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StandardMultiSelectStepDefinition {

    private StandardMultiSelectPage standardMultiSelectPage;
    public StandardMultiSelectStepDefinition(){
        this.standardMultiSelectPage = new StandardMultiSelectPage();
    }

@When("je sélectionne l option opel par index {int}")
public void jeSélectionneLOptionOpelParIndex(Integer int1) {
    standardMultiSelectPage.selectOptionByIndex(int1);
}
@When("je sélectionne l option {string} par valeur")
public void jeSélectionneLOptionParValeur(String value) {
    standardMultiSelectPage.selectOptionByValue(value);
}
@When("je sélectionne l option {string} par texte visible")
public void jeSélectionneLOptionParTexteVisible(String text) {
    standardMultiSelectPage.selectOptionByText(text);
}
@Then("les options sélectionnées sont {string} {string} {string}")
public void lesOptionsSélectionnéesSont(String opt1, String opt2, String opt3) {
   List<String> expected = List.of(opt1, opt2, opt3);
    List<String> actual = standardMultiSelectPage.optionsSelected();
    assertEquals(expected.size(), actual.size()); //verifier le nombre des options selectionnées
    assertTrue(actual.containsAll(expected));     //verifier les options selectionnées
}
@When("je désélectionne l option audi par index {int}")
public void jeDésélectionneLOptionAudiParIndex(Integer int3) {
    standardMultiSelectPage.deselectOptionByIndex(int3);
}
@When("je désélectionne l option {string} par texte visible")
public void jeDésélectionneLOptionParTexteVisible(String text) {
    standardMultiSelectPage.deselectOptionByText(text);
}
@Then("seule l option {string} est sélectionnée")
public void seuleLOptionEstSélectionnée(String opt) {
    List<String> actual = standardMultiSelectPage.optionsSelected();
    assertEquals( 1, actual.size());     //verifier qu'une seule option selectionnée
    assertEquals( opt , actual.get(0));       //verifier l'option selectionnée
}
}
