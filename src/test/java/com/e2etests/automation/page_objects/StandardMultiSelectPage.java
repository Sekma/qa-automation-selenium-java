package com.e2etests.automation.page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class StandardMultiSelectPage {

    private Select select;
    
    @FindBy (how = How.ID , using = "cars")
    private WebElement multiSelect;
    private List<String> selectedTexts;

    public StandardMultiSelectPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.select = new Select(multiSelect);
        this.selectedTexts = new ArrayList<>();
    }

    /** Methods **/
    private void checkMultiSelect() {
    if (!select.isMultiple()) {
        throw new IllegalStateException("Ce select n'est pas multiple");
        }
    }
    public void selectOptionByIndex(int index){
        checkMultiSelect();
        select.selectByIndex(index);
    }
    public void selectOptionByValue(String value){
        checkMultiSelect();
        select.selectByValue(value);
    }
    public void selectOptionByText(String text){
        checkMultiSelect();
        select.selectByVisibleText(text);
    }
    public void deselectOptionByIndex(int index){
        checkMultiSelect();
        select.deselectByIndex(index);
    }
    public void deselectOptionByText(String text){
        checkMultiSelect();
        select.deselectByVisibleText(text);
    }
    public List<String> optionsSelected() {
        checkMultiSelect();
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            selectedTexts.add(option.getText());
        }
    return selectedTexts;
    }

}
