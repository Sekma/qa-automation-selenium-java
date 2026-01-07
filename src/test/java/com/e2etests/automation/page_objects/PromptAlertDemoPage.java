package com.e2etests.automation.page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PromptAlertDemoPage {

    @FindBy(how = How.ID , using = "promtButton")
    private WebElement promtButton;
    @FindBy(how = How.ID , using = "promptResult")
    private WebElement promptResult;

    public PromptAlertDemoPage(){
        PageFactory.initElements(Setup.getDriver(), this);
    }

    /** Methods **/
    public void clickOnPromptButton(){
        promtButton.click();
    }
    public void fillPromptText(String text){
        Alert alert = Setup.getDriver().switchTo().alert();
        alert.sendKeys(text);
    }
    public String getPromptResult(){
        return promptResult.getText();
    }

}
