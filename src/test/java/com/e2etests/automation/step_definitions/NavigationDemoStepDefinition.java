package com.e2etests.automation.step_definitions;

import static org.junit.Assert.assertEquals;

import com.e2etests.automation.page_objects.NavigationDemoPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationDemoStepDefinition {

    NavigationDemoPage navigationDemoPage;

    public NavigationDemoStepDefinition(){
        this.navigationDemoPage = new NavigationDemoPage();
    }

@When("je defile vers le bas")
public void jeDefileVersLeBas() {
    navigationDemoPage.scrollDown();
}
@When("je refraiche la page")
public void jeRefraicheLaPage() {
    navigationDemoPage.getRefresh();
}
@When("je reviens vers la page precedente")
public void jeReviensVersLaPagePrecedente() {
    navigationDemoPage.goBack();
}
@When("je passe a la page suivante")
public void jePasseALaPageSuivante() {
    navigationDemoPage.goForward();
}
@Then("je suis a la page initiale")
public void jeSuisALaPageInitiale() {
    assertEquals(navigationDemoPage.urlPage(), navigationDemoPage.currentUrlPage());
}
}
