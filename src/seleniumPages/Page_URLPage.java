package seleniumPages;

import static org.junit.Assert.assertEquals;
import static config.SystemProperties.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.*;
import java.io.*;

import common.Page_BasePage;
import utils.Utils;


public class Page_URLPage extends Page_BasePage{

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver();
	}
	
	public void openURL() {
		driver.get("http://www.dunelm.com/");
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("pillows");
		driver.findElement(By.id("search_submit")).click();
	}
	
	
	public void checkPageTitle() {
		//assertEquals("Pillows | Feather Pillow & Memory Foam Pillows | Dunelm",driver.getTitle());		
		assertEquals("Courtney",driver.getTitle());		
		
	}
	

	
	public void tearDown() throws IOException {
		driver.quit();
		//Utils.exportReportToJIRA(JIRA_USERNAME, JIRA_PASSWORD, JIRA_ROOT_URL, CUCUMBER_JSON_REPORT_FILEPATH);	
	}
}

