package testRunners;

import cucumber.api.junit.Cucumber;
import cucumber.deps.com.thoughtworks.xstream.io.path.Path;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import utils.Utils;
import static config.SystemProperties.*;

import java.io.File;
import java.nio.file.Paths;

import org.junit.AfterClass;
import common.Page_BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "resources/features", 
		glue = "stepDefinitions",
		plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json"}
		//Use this for importing junit xml
		//plugin = {"pretty","html:target/cucumber-html-report","junit:target/allcukes.xml"}
		
		)

public class TestRunner_URLpage {

	@AfterClass
    public static void teardown() {
         Utils.exportReportToJIRA(JIRA_USERNAME, JIRA_PASSWORD, JIRA_ROOT_URL, CUCUMBER_JSON_REPORT_FILEPATH);
         System.out.println("After exportReportToJIRA");
    }
	
}
