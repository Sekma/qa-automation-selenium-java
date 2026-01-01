package com.e2etests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class ElementHiddenPage {

    private ConfigFileReader configFileReader;
    private JavascriptExecutor executor;
    
    @FindBy(how = How.ID, using = "hide-textbox")
    private WebElement hiddenBtn; 
    @FindBy(how = How.ID, using = "show-textbox")
    private WebElement showBtn;
    @FindBy(how = How.ID, using = "displayed-text")
    private WebElement text;

    public ElementHiddenPage() {
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
        this.executor = (JavascriptExecutor) Setup.getDriver();
    }

    /** Methods **/
    public void goToUrl() {
        Setup.getDriver()
             .get(configFileReader.getProperties("hidden.url"));
    }
    public void clickHiddenButton() {
    	hiddenBtn.click();
    }
    public void fillText(String value) { 
		executor.executeScript("arguments[0].value = arguments[1]",
											text, value);
    }
    public String isTextPresent() { 
        return (String) executor.executeScript(
                "return arguments[0].value;",
                text
            );
    }
    public void clickShowButton() {
    	showBtn.click();
    }
    public boolean isTextDisplayed() { 
        return text.isDisplayed();
    }
}
