package com.e2etests.automation.page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AlertCancelPage {
	
	/** @FindBy **/
	@FindBy(how = How.ID, using = "confirmButton")
	public static WebElement confirmButton;
	@FindBy(how = How.ID, using = "confirmResult")
	public static WebElement confirmResult;
	
	public AlertCancelPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	/** Create methods **/
	public void clickOnConfirmButton() {
		confirmButton.click();
	}
	public void dismissAlert() {
		// dismiss alert
		Alert alert = Setup.getDriver().switchTo().alert();
		alert.dismiss();
	}
}
