package com.shoppers.qsp.pomrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperHomePage {
WebDriver driver;
public ShopperHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id = "men")
private WebElement mensLink;


@FindBy(xpath = "//div[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/button/span")
private WebElement AddToCart;
public WebElement getMensLink() {
	return mensLink;
}


public WebElement getAddToCart() {
	return AddToCart;
}

}