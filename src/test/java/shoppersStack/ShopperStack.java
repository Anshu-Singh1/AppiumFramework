package shoppersStack;

import java.io.IOException;

import org.testng.annotations.Test;

import com.shoppers.qsp.genericutility.BaseClass;
import com.shoppers.qsp.pomrepos.ShopperHomePage;
import com.shoppers.qsp.pomrepos.ShopperLoginPage;
import com.shoppers.qsp.pomrepos.ShopperWelcomePage;

public class ShopperStack extends BaseClass{
	
	@Test
	public void oneEndToEndShoppers() throws IOException, InterruptedException {
		ShopperWelcomePage welcomePage = new ShopperWelcomePage(driver);
		welcomePage.getLoginOption().click();
		
		ShopperLoginPage loginPage = new ShopperLoginPage(driver);
		loginPage.getEmailTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("username"));
		Thread.sleep(2000);
		loginPage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		loginPage.getLoginOption().click();
		
		ShopperHomePage Homepage = new ShopperHomePage(driver);
		Homepage.getMensLink().click();
		Thread.sleep(2000);
		Homepage.getAddToCart().click();
		
	}

}
