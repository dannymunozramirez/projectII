package ExecutionEndToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages_EndToEnd.DashboardPage;
import Pages_EndToEnd.HomePage;
import Pages_EndToEnd.LoginPage;
import Pages_EndToEnd.RewardsPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

//TODO add XML file and use that data to run this test case
//TODO add login and dashboard objects
//TODO add recording class

public class UtilTestNgSecondCup {
	
	WebDriver driver;
	ATUTestRecorder recorder;
	HomePage homePageActions = new HomePage(driver);
	RewardsPage rewardPageActions = new RewardsPage(driver);
	LoginPage loginPageActions = new LoginPage(driver);
	DashboardPage dashboardPageActions = new DashboardPage(driver);

	// Before Suite => Before Test => Before Class =>  Before Method => Method
	
	@BeforeTest
	public void beforeTest() throws ATUTestRecorderException {
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
		System.setProperty("webdriver.chromedriver.driver", "/Users/dannymunoz/git/projectII/projectII_MCIT_Munoz_Martinez/chromedriver");
		
		//Saving recorder file
		recorder = new ATUTestRecorder("/Users/dannymunoz/git/projectII",
				"ProjectII_MCIT_Munoz_Martinez", false);
		
	}
	
	@BeforeClass
	public void beforeClass() throws ATUTestRecorderException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secondcup.com/");
		//Recording test case
		recorder.start();
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
	
	@Test(priority=4)
	public void homeToSignIn() throws InterruptedException {
		driver.get("https://secondcup.com/");
		homePageActions.clickSignIn(driver);
		
	}
	
	@Test(priority=5)
	public void homeToFillOutSignIn() throws InterruptedException {
		loginPageActions.signingUp(driver);
	}
	
	@Test(priority=6)
	public void dashBoardLogOut() throws InterruptedException {
		dashboardPageActions.logOut(driver);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test completed");
	}
	
	@AfterTest
	public void finishingTest() throws ATUTestRecorderException {
		recorder.stop();
		driver.close();
	}
	
}
