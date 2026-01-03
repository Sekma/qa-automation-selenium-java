package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class FileUploadDemoPage {

	private ConfigFileReader configFileReader;
	private WebDriverWait wait;
	
	/** Elements **/
	@FindBy(how = How.ID, using = "uploadfile_0")
	private WebElement uploadInput;
	@FindBy(how = How.ID, using = "terms")
	private WebElement checkbox;
	@FindBy(how = How.ID, using = "submitbutton")
	private WebElement submitButton;
	@FindBy(how = How.CSS, using = "h3[id='res'] center")
	private WebElement successMsg;
	
	public FileUploadDemoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
	}
	
	/** Methods **/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("upload-file.url"));
	}
	public void importFile(String path) {
		uploadInput.sendKeys(path);
	}
	public void clickOnCheckbox() {
		checkbox.click();
	}
	public void clickOnSubmitFile() {
		submitButton.click();
	}
	public String getSuccessMessage() {
		return wait.until(ExpectedConditions.elementToBeClickable(successMsg)).getText();
	}
}
