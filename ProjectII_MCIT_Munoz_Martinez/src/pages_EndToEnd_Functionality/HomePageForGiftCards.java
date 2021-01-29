package pages_EndToEnd_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageForGiftCards {
	
	WebDriver driver;
	By clickGifCardBtn = By.cssSelector("a[href='/gift-cards']");
	
	public  HomePageForGiftCards(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickGifCardBtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://secondcup.com/");
		Thread.sleep(2000);
		driver.findElement(clickGifCardBtn).click();;
	}
	
}
