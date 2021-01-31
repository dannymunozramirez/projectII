package pages_EndToEnd_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment {

	String email = "projectii.mcit@gmail.com";
	String firstName = "Danny";
	String lastName = "Munoz";
	String address = "9 Thurlow";
	String province = "Quebec";
	String city = "Montreal";
	String postalCode = "H3X6H7";
	String phoneNumber = "12345678903";

	WebDriver driver;
	By emailField = By.id("cws_txt_guestEmail");
	By btn = By.id("cws_btn_guestChkout");

	// filling out form
	By firstNameField = By.id("cws_txt_shippingFname");
	By lastNameField = By.id("cws_txt_shippingLname");
	By addressField = By.id("cws_txt_shippingAddr1");
	By select = By.id("cws_list_shippingProvince");
	By cityField = By.id("cws_txt_shippingCity");
	By postalCodeField = By.id("cws_txt_shippingPostal");
	By phoneNumberField = By.id("cws_txt_shippingPhone");
	By btnField = By.id("cws_btn_submitShip");

	public Payment(WebDriver driver) {
		this.driver = driver;
	}

	public void fillOutEmailField(WebDriver driver) throws InterruptedException {
		driver.findElement(emailField).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(btn).click();
	}

	public void fillinOutPaymentInfo(WebDriver driver) throws InterruptedException {

		driver.findElement(firstNameField).sendKeys(firstName);
		Thread.sleep(2000);
		driver.findElement(lastNameField).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(addressField).sendKeys(address);
		Thread.sleep(2000);

		Select op = new Select(driver.findElement(select));
		op.selectByVisibleText(province);

		Thread.sleep(2000);
		driver.findElement(cityField).sendKeys(city);
		Thread.sleep(2000);
		driver.findElement(postalCodeField).sendKeys(postalCode);
		Thread.sleep(2000);
		driver.findElement(phoneNumberField).sendKeys(phoneNumber);
		Thread.sleep(2000);

		driver.findElement(btnField).click();

	}

}
