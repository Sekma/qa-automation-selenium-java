package com.e2etests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
import java.util.ArrayList;
import java.util.List;
public class PracticeSwitchWindowPage {

    private ConfigFileReader configFileReader;
    private WebDriverWait wait;

    @FindBy(how = How.ID , using = "a077aa5e")
    private WebElement frame;
    @FindBy(how = How.XPATH , using = "//img[@src='Jmeter720.png']")
    private WebElement image;
    @FindBy(how = How.ID , using = "menu-item-3172")
    private WebElement home;

    public PracticeSwitchWindowPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
        this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
    }
    /** Methods **/
    public void goToUrl(){
        Setup.getDriver().get(configFileReader.getProperties("practice-switch.url"));
    }
    public void clickOnImage(){
        Setup.getDriver().switchTo().frame(frame);
        image.click();
            // sortir du frame *** IMPORTANT ***
        Setup.getDriver().switchTo().defaultContent();
    }
    public void swithToNextWindow(){
        // Store all opened window handles in a List for easier manipulation
		List<String> handles = new ArrayList<>(Setup.getDriver().getWindowHandles());
        //switch to the second window
		Setup.getDriver().switchTo().window(handles.get(1));
    }
    public void clickOnHomeButton(){
        home.click();
    }
    public String getTitleCurrentPage(String expectedTitle){
            wait.until(ExpectedConditions.titleIs(expectedTitle));
        return Setup.getDriver().getTitle();
    }


}
