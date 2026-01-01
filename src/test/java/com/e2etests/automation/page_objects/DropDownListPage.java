package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class DropDownListPage {

    private ConfigFileReader configFileReader;

    @FindBy(how = How.ID, using = "oldSelectMenu")
    private static WebElement selectMenu; 

    public DropDownListPage() {
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
    }

    /** Navigation **/
    public void goToUrl() {
        Setup.getDriver()
             .get(configFileReader.getProperties("select-menu.url"));
    }

    /** Actions **/
    public void selectTheOptionByIndex(int index) {
        new Select(selectMenu).selectByIndex(index);
    }

    public void selectTheOptionByValue(String value) {
        new Select(selectMenu).selectByValue(value);
    }

    public void selectTheOptionByVisibleText(String text) {
        new Select(selectMenu).selectByVisibleText(text);
    }

    /** Verification **/
    public String selectedOption() {
        return new Select(selectMenu)
                .getFirstSelectedOption()
                .getText();
    }
}

