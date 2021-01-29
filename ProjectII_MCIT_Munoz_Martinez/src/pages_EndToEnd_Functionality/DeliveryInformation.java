package pages_EndToEnd_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryInformation {
	
	WebDriver driver;
	By selectOp = By.id("cws_rad_shipMethod0");
	By nextBtn = By.id("cws_btn_submitShipMethod");
	
	public DeliveryInformation(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectingDelivery(WebDriver driver) throws InterruptedException {
		driver.findElement(selectOp).click();
		Thread.sleep(2000);
		driver.findElement(nextBtn).click();
	}
}