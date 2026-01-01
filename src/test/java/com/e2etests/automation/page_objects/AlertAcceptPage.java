package com.e2etests.automation.page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AlertAcceptPage {
	
	private ConfigFileReader configFileReader; 
	
	/** @FindBy **/
	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement alertButton;
	
	public AlertAcceptPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/** Create methods **/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("alert.url"));
	}
	public void clickOnAlertButton() {
		alertButton.click();
	}
	public void acceptAlert() {
		// accept alert
		Alert alert = Setup.getDriver().switchTo().alert();
		alert.accept();
	}
	
}
