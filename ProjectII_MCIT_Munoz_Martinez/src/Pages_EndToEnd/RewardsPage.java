package Pages_EndToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Munoz_Martinez This class contains the info and methods for Second
 *         Cup rewards page it will use buttons and will fill out the form in
 *         order to register a new user.
 *
 */
public class RewardsPage {
	WebDriver driver;
	By signUpBtn = By.cssSelector("a[class='a-btn'][href*='sign-up']");
	By submitBtn = By.id("edit-submit");
	By boxOwnCard = By.cssSelector("label.option[for='edit-own-a-card']");
	
	//Form and fields
	By nameFieldByCss = By.cssSelector("input#edit-first-name");
	By lastNameByCss = By.cssSelector("input#edit-last-name");
	By emailById = By.id("edit-email-address");
	By emailConfirmById = By.id("edit-confirm-email-address");
	By passwordById = By.id("edit-password");
	By passwordConfirmById = By.id("edit-confirm-password");
	By boxPromoCss = By.cssSelector("label.option[for='edit-opt-in-promotions']");
	By boxPolicyCss = By.cssSelector("label.option[for='edit-agree-tos']");
	By boxMajorityCss = By.cssSelector("label.option[for='edit-majority']");
	
	
	//Form info to fill out
	public  final static String NAME = "Munoz_Martinez";
	public  final static String LAST_NAME = "MunozMartinez";
	public  final static String EMAIL = "projectII.mcit@gmail.com";
	public  final static String PASSWORD = "Munoz@Martinez";
	
	//Action over promotion box
	Actions act = new Actions(driver);
	WebElement box = driver.findElement(boxPolicyCss);
	
	
	
	public RewardsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignUp(WebDriver driver) {
		driver.findElement(signUpBtn).click();
	}

	public void fillingOutForm(WebDriver driver) throws InterruptedException {
		driver.findElement(boxOwnCard).click();
		Thread.sleep(2000);
		driver.findElement(nameFieldByCss).sendKeys(NAME);
		Thread.sleep(2000);
		driver.findElement(lastNameByCss).sendKeys(LAST_NAME);
		Thread.sleep(2000);
		driver.findElement(emailById).sendKeys(EMAIL);
		Thread.sleep(2000);
		driver.findElement(emailConfirmById).sendKeys(EMAIL);
		Thread.sleep(2000);
		driver.findElement(passwordById).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(passwordConfirmById).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(boxPromoCss).click();;
		Thread.sleep(2000);
		act.moveToElement(box).click().release().build().perform();
		Thread.sleep(2000);
		driver.findElement(boxMajorityCss).click();;
		Thread.sleep(2000);
		//driver.findElement(submitBtn).click();
		
	}

}
