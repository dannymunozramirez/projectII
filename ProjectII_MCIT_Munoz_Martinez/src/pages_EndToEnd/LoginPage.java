package pages_EndToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By userInputById = By.id("edit-email-address");
	By passwordInputById = By.id("edit-password");
	By submitBtnByCss = By.cssSelector("button[class='a-btn']");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signingUp(WebDriver driver) throws InterruptedException {
		driver.get("https://secondcup.com/");
		driver.findElement(userInputById).sendKeys(RewardsPage.EMAIL);
		Thread.sleep(2000);
		driver.findElement(passwordInputById).sendKeys(RewardsPage.PASSWORD);
		Thread.sleep(2000);
		driver.findElement(submitBtnByCss).click();
	}
	
}
