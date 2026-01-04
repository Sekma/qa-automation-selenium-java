package com.e2etests.automation.page_objects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class MultipleSelectDropDownPage {

    @FindBy(how = How.ID , using = "react-select-4-input")
    private WebElement reactSelect;
    @FindBy(how = How.CSS , using = ".css-12jo7m5")
    private List<WebElement> choices;

    public MultipleSelectDropDownPage(){
         PageFactory.initElements(Setup.getDriver(), this);
    }
    /** Methods **/
    public void selectChoices(String choice1 , String choice2){
        reactSelect.sendKeys(choice1);
        reactSelect.sendKeys(Keys.ENTER);
        reactSelect.sendKeys(choice2);
        reactSelect.sendKeys(Keys.ENTER);
        reactSelect.sendKeys(Keys.ESCAPE);
    }
    public int getNumberOfChoices(){
        return choices.size();
    }

}
