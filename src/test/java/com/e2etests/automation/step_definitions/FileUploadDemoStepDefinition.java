package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.FileUploadDemoPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileUploadDemoStepDefinition {

	private FileUploadDemoPage fileUploadDemoPage;
	public FileUploadDemoStepDefinition() {
		this.fileUploadDemoPage = new FileUploadDemoPage();
	}

	@Given("je suis dans le site demo guru99")
	public void jeSuisDansLeSiteDemoGuru99() {
		fileUploadDemoPage.goToUrl();
	}
	@When("je choisi un fichier a remonter {string}")
	public void jeChoisiUnFichierARemonter(String path) {
		fileUploadDemoPage.importFile(path);
	}
	@When("je coche le checkbox terms")
	public void jeCocheLeCheckboxTerms() {
		fileUploadDemoPage.clickOnCheckbox();
	}
	@When("je click sur le bouton submit file")
	public void jeClickSurLeBoutonSubmitFile() {
		fileUploadDemoPage.clickOnSubmitFile();
	}
	@Then("le fichier est importé {string}")
	public void leFichierEstImporté(String message) {
		Assert.assertTrue(fileUploadDemoPage.getSuccessMessage().contains(message));
	}



}
