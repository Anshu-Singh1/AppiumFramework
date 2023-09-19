package com.shoppers.qsp.genericutility;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void implicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void WindowMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void windowMinimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	
	public void ElementToBeVisible(WebDriver driver , WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void Select(WebElement ele ,int index) {
	    Select s =  new Select(ele);
		s.selectByIndex(index);
		
	}
	
}
