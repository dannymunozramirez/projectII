package Pages_EndToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Munoz_Martinez This class contains the info and methods for Second Cup Home Page.
 *
 */

public class HomePage {
	
	WebDriver driver;
	By rewardsBtn = By.cssSelector("a[class='m-nav-main__link'][href='/rewards']");
	By signInBtn = By.cssSelector("a[class='m-nav-top__link'][href='/rewards/sign-in']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickReward(WebDriver driver) {
		driver.findElement(rewardsBtn).click();
	}
	
	public void clickSignIn(WebDriver driver) {
		driver.findElement(signInBtn).click();
	}

}
