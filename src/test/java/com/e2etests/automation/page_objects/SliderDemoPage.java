package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class SliderDemoPage {

    private ConfigFileReader configFileReader;
    private Actions action;

    @FindBy(how = How.ID , using = "sliderContainer")
    private WebElement slider;
    @FindBy(how = How.ID , using = "sliderValue")
    private WebElement sliderValue;    

    public SliderDemoPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
        this.action = new Actions(Setup.getDriver());
    }

    /** Methods **/
    public void goToUrl(){
        Setup.getDriver().get(configFileReader.getProperties("slider.url"));
    }
    public void mouveSlider(){
        action.moveToElement(slider, 20,0).click().build().perform();
    }
    public String getSliderValue(){
        return sliderValue.getAttribute("value");
    }

}
