package ExecutionEndToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import pages_EndToEnd.DashboardPage;
import pages_EndToEnd.HomePage;
import pages_EndToEnd.LoginPage;
import pages_EndToEnd.RewardsPage;
import pages_EndToEnd_Functionality.DeliveryInformation;
import pages_EndToEnd_Functionality.GiftCardBuy;
import pages_EndToEnd_Functionality.GiftCardForm;
import pages_EndToEnd_Functionality.HomePageForGiftCards;
import pages_EndToEnd_Functionality.Payment;

/**
 * 
 * @author Munoz_Martinez This testNg class will use all the POM classes in the
 *         project folder, in order to perform the second cup automation test
 *         case. It will follow this structure for all the classes on it and for
 *         each @test included on this TestNg class, then it will back to
 *         the @BeforeMethod.
 *
 */

public class UtilTestNgSecondCup {
	

	WebDriver driver;
	ATUTestRecorder recorder;
	HomePage homePageActions = new HomePage(driver);
	RewardsPage rewardPageActions = new RewardsPage(driver);
	LoginPage loginPageActions = new LoginPage(driver);
	DashboardPage dashboardPageActions = new DashboardPage(driver);

	// GiftCard functional test
	// GiftCard Functionality test
	HomePageForGiftCards homeGift = new HomePageForGiftCards(driver);
	GiftCardBuy clickShopNow = new GiftCardBuy(driver);
	GiftCardForm fillOutForm = new GiftCardForm(driver);
	Payment paymentInfo = new Payment(driver);
	DeliveryInformation deliveryOptions = new DeliveryInformation(driver);

	// Before Test => Before Class => Before Method => Method => Before Method =>
	// Method => AfterMethod => AfterTest

	@BeforeTest
	public void beforeTest() throws ATUTestRecorderException {
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
		System.setProperty("webdriver.chromedriver.driver",
				"/Users/dannymunoz/git/projectII/projectII_MCIT_Munoz_Martinez/chromedriver");
		// Saving recorder file generated
		recorder = new ATUTestRecorder("/Users/dannymunoz/git/projectII", "ProjectII_MCIT_Munoz_Martinez", false);

	}

	@BeforeClass
	public void beforeClass() throws ATUTestRecorderException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secondcup.com/"); //https://cws.givex.com/cws4.0/secondcup4/ test case 7
		// Recording test case
		recorder.start();
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("Before method executed");
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	public void testOne() {
		homePageActions.clickReward(driver);

	}

	@Test(priority = 1)
	public void testTwo() {
		homePageActions.clickSignIn(driver);

	}

	@Test(priority = 2)
	public void testThree() {
		rewardPageActions.clickSignUp(driver);

	}

	@Test(priority = 3)
	public void testFour() throws InterruptedException {
		rewardPageActions.fillingOutForm(driver);

	}

	@Test(priority = 4)
	public void testFive() throws InterruptedException {
		driver.get("https://secondcup.com/");
		homePageActions.clickSignIn(driver);

	}

	@Test(priority = 5)
	public void testSix() throws InterruptedException {
		loginPageActions.signingUp(driver);
	}

	@Test(priority = 6)
	public void testSeven() throws InterruptedException {
		dashboardPageActions.logOut(driver);
	}

	@Test(priority = 7)
	public void functionalGiftCards() throws InterruptedException {
		
		fillOutForm.fillingOutForm(driver);
		paymentInfo.fillOutEmailField(driver);
		paymentInfo.fillinOutPaymentInfo(driver);
		deliveryOptions.selectingDelivery(driver);
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
