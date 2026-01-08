package com.e2etests.automation.step_definitions;

import static org.junit.Assert.assertFalse;

import com.e2etests.automation.page_objects.SliderDemoPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SliderDemoStepDefinition {
    
    private String initSliderValue;

    private SliderDemoPage sliderDemoPage;
    public SliderDemoStepDefinition(){
        this.sliderDemoPage = new SliderDemoPage();
    }

@Given("je suis sur la page slider")
public void jeSuisSurLaPageSlider() {
   sliderDemoPage.goToUrl();
   initSliderValue = sliderDemoPage.getSliderValue();
}
@When("je glisse l’élément horizontalement")
public void jeGlisseLÉlémentHorizontalement() {
   sliderDemoPage.mouveSlider();
}
@Then("l elemnt a changer de position")
public void lElemntAChangerDePosition() {
   assertFalse(initSliderValue.equals(sliderDemoPage.getSliderValue()));
}
}
