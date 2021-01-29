package pages_EndToEnd_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardBuy {
	
	WebDriver driver;
	By GiftBtn =  By.xpath("//a[@class='a-btn--full-width'][contains(text(), \"Shop Now\")]");
	
	public GiftCardBuy(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickGiftBtn(WebDriver driver) {
		driver.findElement(GiftBtn).click();
	}

}
