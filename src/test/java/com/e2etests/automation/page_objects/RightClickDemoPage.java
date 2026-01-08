package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class RightClickDemoPage {

    private Actions action;

    @FindBy (how = How.ID , using = "rightClickBtn")
    private WebElement rightClickBtn;
    @FindBy (how = How.ID , using = "rightClickMessage")
    private WebElement rightClickMessage;

    public RightClickDemoPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.action = new Actions(Setup.getDriver());
    }

    /** Methods **/
    public void rightClickOnButton(){
        action.contextClick(rightClickBtn).perform();
    }
    public String getRightClickMessage(){
        return rightClickMessage.getText();
    }

}
