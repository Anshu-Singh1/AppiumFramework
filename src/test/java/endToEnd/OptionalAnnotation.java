package endToEnd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class OptionalAnnotation {
WebDriver driver;


@Test
@org.testng.annotations.Parameters({"browser","username","password"})

public void loginTOActitime(@Optional("firefox")String browser,@Optional("xyz")String username,@Optional("123dhc")String password) {
	
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		
	}else if(	browser.equals("firefox")) {
			driver = new FirefoxDriver();	
		}
	
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement userNametextField = driver.findElement(By.id("username"));
	userNametextField.sendKeys(username);
}

public void failedScreenshot(String testMethod) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	File permFile = new File("./defectshot/"+testMethod+"shots.png");
	FileUtils.copyFile(tempFile, permFile);
}
}

