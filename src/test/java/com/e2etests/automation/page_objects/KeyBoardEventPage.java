package com.e2etests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class KeyBoardEventPage {

    private ConfigFileReader configFileReader;
    private JavascriptExecutor executor;

    @FindBy(how = How.ID, using = "userName")
    private WebElement name;
    @FindBy(how = How.ID, using = "userEmail")
    private WebElement email;
    @FindBy(how = How.ID, using = "currentAddress")
    private WebElement currentAddress;
    @FindBy(how = How.ID, using = "permanentAddress")
    private WebElement permanentAddress;
    @FindBy(how = How.ID, using = "submit")
    private WebElement submitBtn;
    @FindBy(how = How.XPATH, using = "//div[@class='border col-md-12 col-sm-12']")
    private WebElement successMsg;

     public KeyBoardEventPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
        this.executor = (JavascriptExecutor) Setup.getDriver();
     }

     /** Methods **/
     public void goToUrl(){
        Setup.getDriver().get(configFileReader.getProperties("key-board-envent.url"));
     }
     public void fillFullName(){
        name.sendKeys(configFileReader.getProperties("key-board-envent.name"));
     }
     public void fillEmail(){
        email.sendKeys(configFileReader.getProperties("key-board-envent.email"));
     }
     public void filAddress(){
        currentAddress.sendKeys(configFileReader.getProperties("key-board-envent.address"));
     }
     public void copyPasteAddress(){
        currentAddress.sendKeys(Keys.CONTROL+"a");
        currentAddress.sendKeys(Keys.CONTROL+"c");
        permanentAddress.sendKeys(Keys.CONTROL+"v");
     }
     public void clickOnSubmit(){
        executor.executeScript("arguments[0].click();", submitBtn);
     }
     public String getSuccessText(){
       return successMsg.getText();
     }

}
