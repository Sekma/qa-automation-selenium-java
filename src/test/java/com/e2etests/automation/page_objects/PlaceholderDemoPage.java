package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PlaceholderDemoPage {

    @FindBy(how = How.ID , using = "toolTipTextField")
    private WebElement placeholder;

    public PlaceholderDemoPage(){
        PageFactory.initElements(Setup.getDriver(), this);
    }
    /** Methods **/
    public String getPlaceholderText(){
        return placeholder.getAttribute("placeholder");
    }


}
