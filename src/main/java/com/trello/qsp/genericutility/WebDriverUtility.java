package com.trello.qsp.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	public void implicityWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
