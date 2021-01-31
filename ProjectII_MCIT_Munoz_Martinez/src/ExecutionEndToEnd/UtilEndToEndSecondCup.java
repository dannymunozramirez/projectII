package ExecutionEndToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
* @author  Munoz_Martinez This class will use all the POM structure in the
 *         project folder, in order to perform the second cup automation test
 *         case.
*/

public class UtilEndToEndSecondCup {
	
	
	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		
		ATUTestRecorder recorder;
		recorder = new ATUTestRecorder("/Users/dannymunoz/git/projectII", "ProjectII_MCIT_Munoz_Martinez_GiftCardModule", false);
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chromedriver.driver", "/Users/dannymunoz/git/projectII/projectII_MCIT_Munoz_Martinez/geckodriver");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://cws.givex.com/cws4.0/secondcup4/");
		recorder.start();
		
		HomePage homePageActions = new HomePage(driver);
		RewardsPage rewardPageActions = new RewardsPage(driver);
		LoginPage loginPageActions = new LoginPage(driver);
		DashboardPage dashboardPageActions = new DashboardPage(driver);
		
		//GiftCard Functionality test
		HomePageForGiftCards homeGift = new HomePageForGiftCards(driver);
		GiftCardBuy clickShopNow = new GiftCardBuy(driver);
		GiftCardForm fillOutForm = new GiftCardForm(driver);
		Payment paymentInfo = new Payment(driver);
		DeliveryInformation deliveryOptions = new DeliveryInformation(driver);
		
		
		
		//Creating user and login in and login out
		homePageActions.clickReward(driver);
		rewardPageActions.clickSignUp(driver);
		rewardPageActions.fillingOutForm(driver);
		loginPageActions.signingUp(driver);
		dashboardPageActions.logOut(driver);
		
		//GiftCard Functionality test
		
		homeGift.clickGifCardBtn(driver);
		clickShopNow.clickGiftBtn(driver);	
		
		
		fillOutForm.fillingOutForm(driver);
		paymentInfo.fillOutEmailField(driver);
		paymentInfo.fillinOutPaymentInfo(driver);
		deliveryOptions.selectingDelivery(driver);
		
		recorder.stop();
		driver.close();
		
	}
	

}
