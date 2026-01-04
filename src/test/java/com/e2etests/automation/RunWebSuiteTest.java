package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", /** Allure report **/
		        "html:target/cucumber-report.html"
		        },
		//tags = ("@alert-accept"),
		//tags = ("@confirm-alert"),
		//tags = ("@double-click"),
		//tags = ("@drag-and-drop"),
		//tags = ("@select-menu"),
		//tags = ("@hidden"),
		//tags = ("@upload-file"),
		//tags = (""),
		//tags = ("@key-board-envent"),
		tags = ("@multiple-select-drop-down"),
		//glue = {"com.e2etests.automation.step_definitions"},
		monochrome = true,
		snippets = CAMELCASE
		)


public class RunWebSuiteTest {
	
	

}
