package seleniumPages;

import static org.junit.Assert.assertEquals;
import static config.SystemProperties.*;

import java.util.regex.Pattern;
import org.junit.*;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.codec.binary.*;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.Select;



	

import common.Page_BasePage;
import utils.Utils;


public class Search_URL_Page extends Page_BasePage{

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver();
	}
	
	public void openURL() {
		driver.get("http://www.bankofalbuquerque.com/");
		
		//String textname = driver.findElement(By.className("search-btn")).getText();
		//System.out.println("Search Icon"  + textname);
		//driver.findElement(By.cssSelector("a.search-btn")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Search")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtSiteSearch")).clear();
		driver.findElement(By.id("txtSiteSearch")).sendKeys("bank");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Español'])[1]/preceding::input[3]")).click();
		//driver.findElement(By.id("submit")).submit();
	}
	
	
	public void checkPageTitle() {
		//assertEquals("Pillows | Feather Pillow & Memory Foam Pillows | Dunelm",driver.getTitle());		
		assertEquals("Search Results",driver.getTitle());		
		
	}
	

	
	public void tearDown() throws IOException {
		driver.quit();
		//Utils.exportReportToJIRA(JIRA_USERNAME, JIRA_PASSWORD, JIRA_ROOT_URL, CUCUMBER_JSON_REPORT_FILEPATH);	
	}
}

