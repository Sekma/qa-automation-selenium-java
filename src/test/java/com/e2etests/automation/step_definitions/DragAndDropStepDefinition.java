package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.DragAndDropPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDropStepDefinition {
	private DragAndDropPage dragAndDropPage;

	public DragAndDropStepDefinition() {
		this.dragAndDropPage = new DragAndDropPage();
	}
	@Given("je me connecte sur le site demoqa droppable")
	public void jeMeConnecteSurLeSiteDemoqaDroppable() {
		dragAndDropPage.goToUrl();
	}
	@When("je glisse l element drag me dans l element drop here")
	public void jeGlisseLElementDragMeDansLElementDropHere() {
		dragAndDropPage.dragAndDrop();
	}
	@Then("l element est déplacé un message est affiché {string}")
	public void lElementEstDéplacéUnMessageEstAffiché(String text) {
		String textTo = DragAndDropPage.to.getText();
		Assert.assertEquals(text, textTo);
	}



}
