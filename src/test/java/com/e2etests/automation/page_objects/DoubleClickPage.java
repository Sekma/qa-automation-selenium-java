package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class DoubleClickPage {
	
	private ConfigFileReader configFileReader;
	private Actions action;
	
	/** @FindBy **/
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement doubleClickBtn;
	@FindBy(how = How.ID, using = "doubleClickMessage")
	public static WebElement doubleClickMessage;
	
	public DoubleClickPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		this.action = new Actions(Setup.getDriver());
	}
	/** Create methods **/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("button.url"));
	}
	public void clickOnDoubleClickButton() {
		action.doubleClick(doubleClickBtn).perform();
	}
	
}
