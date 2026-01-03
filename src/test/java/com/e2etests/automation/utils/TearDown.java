package com.e2etests.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;
public class TearDown {
	/**
	 * This method is used to close browser. This method is called after the
	 * invocation of each test method in given class.
	 * @After Methods annotated with @After execute after every scenario.
	 **/ 
	
	@After
	public void quitDriver(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			final byte [] screenShot = ((TakesScreenshot)Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			// Screenshot pour Allure
            Allure.addAttachment("Screenshot - " + scenario.getName(),new ByteArrayInputStream(screenShot));
            // Screenshot pour Cucumber
			scenario.attach(screenShot, "image/png", "screenshot");	
			
		}
		
		Setup.getDriver().quit();
	}

}
