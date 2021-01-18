package ExecutionEndToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages_EndToEnd.DashboardPage;
import Pages_EndToEnd.HomePage;
import Pages_EndToEnd.LoginPage;
import Pages_EndToEnd.RewardsPage;

/**
* 
* @author  Munoz_Martinez This class will use all the POM structure in the
 *         project folder, in order to perform the second cup automation test
 *         case.
*/

public class UtilEndToEndSecondCup {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver.driver", "/Users/dannymunoz/git/projectII/projectII_MCIT_Munoz_Martinez/chromedriver");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secondcup.com/");
		
		HomePage homePageActions = new HomePage(driver);
		RewardsPage rewardPageActions = new RewardsPage(driver);
		LoginPage loginPageActions = new LoginPage(driver);
		DashboardPage dashboardPageActions = new DashboardPage(driver);
		
		homePageActions.clickReward(driver);
		rewardPageActions.clickSignUp(driver);
		rewardPageActions.fillingOutForm(driver);
		loginPageActions.signingUp(driver);
		dashboardPageActions.logOut(driver);
		
	}
	

}
