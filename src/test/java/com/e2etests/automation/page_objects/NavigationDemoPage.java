package com.e2etests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class NavigationDemoPage {

    private JavascriptExecutor executor;
    private ConfigFileReader configFileReader;

    public NavigationDemoPage(){
        PageFactory.initElements(Setup.getDriver(), this);
        this.executor = (JavascriptExecutor) Setup.getDriver();
        this.configFileReader = new ConfigFileReader();
    }

    /** Methods **/
    public void scrollDown(){
        executor.executeScript("window.scrollBy(0,500)");
    }
    public void getRefresh(){
        Setup.getDriver().navigate().refresh();
    }
    public void goBack(){
        Setup.getDriver().navigate().back();
    }
    public void goForward(){
        Setup.getDriver().navigate().forward();
    }
    public String urlPage(){
        return configFileReader.getProperties("key-board-envent.url");
    }
    public String currentUrlPage(){
        return Setup.getDriver().getCurrentUrl();
    }

}
