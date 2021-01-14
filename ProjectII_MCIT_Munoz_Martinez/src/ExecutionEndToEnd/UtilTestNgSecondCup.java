package ExecutionEndToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages_EndToEnd.DashboardPage;
import Pages_EndToEnd.HomePage;
import Pages_EndToEnd.LoginPage;
import Pages_EndToEnd.RewardsPage;

public class UtilTestNgSecondCup {
	
	WebDriver driver;
	HomePage homePageActions = new HomePage(driver);
	RewardsPage rewardPageActions = new RewardsPage(driver);
	LoginPage loginPageActions = new LoginPage(driver);
	DashboardPage dashboardPageActions = new DashboardPage(driver);

	// Before Suite => Before Test => Before Class =>  Before Method => Method
	
	@BeforeTest
	public void beforeTest() {
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
		System.setProperty("webdriver.chromedriver.driver", "/Users/dannymunoz/git/projectII/projectII_MCIT_Munoz_Martinez/chromedriver");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secondcup.com/");
	}
	
	@BeforeMethod 
	public void beforeMethod() throws InterruptedException{
		System.out.println("Before method eecuted");
		Thread.sleep(2000);
		
	}

	@Test(priority=0)
	public void testOne() {
		homePageActions.clickReward(driver);
		
	}
	
	@Test(priority=1)
	public void testTwo() {
		homePageActions.clickSignIn(driver);
		
	}
	
	@Test(priority=2)
	public void testThree() {
		rewardPageActions.clickSignUp(driver);
		
	}
	
	@Test(priority=3)
	public void testFour() throws InterruptedException {
		rewardPageActions.fillingOutForm(driver);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test completed");
	}
	
}
