package com.shoppers.qsp.pomrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperLoginPage {
WebDriver driver;
public ShopperLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id = "Email")
private WebElement emailTextField;

@FindBy(id = "Password")
private WebElement passwordTextField;

@FindBy(xpath = "//span[text()='Login']")
private WebElement loginButton;

public WebElement getEmailTextField() {
	return emailTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getLoginOption() {
	return loginButton;
}
}
