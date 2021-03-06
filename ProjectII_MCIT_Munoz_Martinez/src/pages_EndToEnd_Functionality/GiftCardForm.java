package pages_EndToEnd_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GiftCardForm {

	WebDriver driver;
	String amount = "50";
	String to = "Manuel";
	String from = "Danny";
	String msn = "Test";

	By goToForm = By.xpath("//header//div//nav//div/span[1]//a[@aria-haspopup=\"true\"]//span");
	By acceptCookies = By.id("button--accept-cookies");
	By amountField = By.cssSelector("input[id=\"cws_txt_gcBuyAmt\"]");
	By optionQty = By.id("cws_list_gcBuyQty");
	By toField = By.id("cws_txt_gcBuyTo");
	By fromField = By.id("cws_txt_gcBuyFrom");
	By messageField = By.id("cws_txt_gcMsg");
	By addToCar = By.id("cws_btn_gcBuyAdd");
	By proceed = By.id("cws_btn_gcBuyCheckout");

	public GiftCardForm(WebDriver driver) {
		this.driver = driver;
	}


	public void fillingOutForm(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(acceptCookies).click();
		Thread.sleep(2000);
		driver.findElement(goToForm).click();
		

		Thread.sleep(2000);
		driver.findElement(amountField).sendKeys(amount);
		Thread.sleep(2000);
		Select menu = new Select(driver.findElement(optionQty));
		menu.selectByVisibleText("1");
		Thread.sleep(2000);
		driver.findElement(toField).sendKeys(to);
		Thread.sleep(2000);
		driver.findElement(fromField).sendKeys(from);
		Thread.sleep(2000);
		driver.findElement(messageField).sendKeys(msn);
		Thread.sleep(2000);
		driver.findElement(addToCar).click();
		Thread.sleep(2000);
		driver.findElement(proceed).click();

	}

}
