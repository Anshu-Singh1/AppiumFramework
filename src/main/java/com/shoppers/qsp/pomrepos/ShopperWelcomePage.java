package com.shoppers.qsp.pomrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperWelcomePage {

	WebDriver driver;
	public ShopperWelcomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "loginBtn")
	private WebElement loginOption;
	public WebElement getLoginOption() {
		return loginOption;
	}
		
}
