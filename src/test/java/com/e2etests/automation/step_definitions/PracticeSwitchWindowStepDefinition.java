package com.e2etests.automation.step_definitions;

import static org.junit.Assert.assertEquals;

import com.e2etests.automation.page_objects.PracticeSwitchWindowPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeSwitchWindowStepDefinition {

    private PracticeSwitchWindowPage practiceSwitchWindowPage;
    public PracticeSwitchWindowStepDefinition(){
        this.practiceSwitchWindowPage = new PracticeSwitchWindowPage();
    }

@Given("je suis sur la page guru99 test")
public void jeSuisSurLaPageGuru99Test() {
    practiceSwitchWindowPage.goToUrl();
}
@When("je clique sur l image j meter")
public void jeCliqueSurLImageJMeter() {
    practiceSwitchWindowPage.clickOnImage();
}
@When("je passe vers l onglet ouvert")
public void jePasseVersLOngletOuvert() {
    practiceSwitchWindowPage.swithToNextWindow();
}
@When("je suis dans la page selenium live {string}")
public void jeSuisDansLaPageSeleniumLive(String pageTitle) {
    assertEquals(pageTitle, practiceSwitchWindowPage.getTitleCurrentPage(pageTitle));
}
@When("je clique sur le bouton home")
public void jeCliqueSurLeBoutonHome() {
    practiceSwitchWindowPage.clickOnHomeButton();
}
@Then("je suis sur la page principale du site {string}")
public void jeSuisSurLaPagePrincipaleDuSite(String pageTitle) {
    assertEquals(pageTitle, practiceSwitchWindowPage.getTitleCurrentPage(pageTitle));
}
}
