package com.e2etests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.qameta.allure.Step;

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
    @Step("Ouvrir la page")
    public void goToUrl() {
        Setup.getDriver().get(configFileReader.getProperties("hidden.url"));
    }
    @Step("Cliquer sur le bouton Hide")
    public void clickHiddenButton() {
    	hiddenBtn.click();
    }
    @Step("Remplir le champ caché avec la valeur : {0}")
    public void fillText(String value) { 
		executor.executeScript("arguments[0].value = arguments[1]",
											text, value);
    }
    @Step("Récupérer le texte du champ caché")
    public String isTextPresent() { 
        return (String) executor.executeScript(
                "return arguments[0].value;",
                text
            );
    }
    @Step("Cliquer sur le bouton Show")
    public void clickShowButton() {
    	showBtn.click();
    }
    @Step("Vérifier que le champ texte est affiché")
    public boolean isTextDisplayed() { 
        return text.isDisplayed();
    }
}
