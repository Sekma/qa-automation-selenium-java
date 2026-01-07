package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class ToolTipDemoPage {

    private ConfigFileReader configFileReader;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(how = How.ID , using = "toolTipButton")
    private WebElement toolTipButton;
    @FindBy(how = How.CSS , using = ".tooltip-inner")
    private WebElement toolTip;

    public ToolTipDemoPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
        this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
        this.action = new Actions(Setup.getDriver());
    }

    /** Methods **/
    public void goToUrl(){
        Setup.getDriver().get(configFileReader.getProperties("tool-tip.url"));
    }
    public void hoverOnButton(){
        action.moveToElement(toolTipButton).perform();
    }
    public String getToolTipText(){
        wait.until(ExpectedConditions.visibilityOf(toolTip));
        return toolTip.getText();
    }

}
