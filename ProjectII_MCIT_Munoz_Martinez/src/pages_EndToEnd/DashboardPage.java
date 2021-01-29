package pages_EndToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	By logOutBtnByCss = By.cssSelector("a[class='m-nav-main__link'][href='/rewards/sign-out']");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logOut(WebDriver driver) {
		driver.findElement(logOutBtnByCss).click();;
	}

}
