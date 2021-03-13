package qa.testcases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import qa.pages.BookingsPage;
import qa.pages.HomePage;
import qa.pages.RailFreightPage;
import qa.base.TestBase;
import qa.util.ExtentReporterNG;;

@Listeners(ExtentReporterNG.class)
public class HomePageTest extends TestBase {

	HomePage homePage;
	RailFreightPage railFreightPage;
	BookingsPage bookingsPage;
	public ExtentReports report;
	public ExtentTest extentLogger;

	SoftAssert softAssert = new SoftAssert();

	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		// testUtil = new TestUtil();

		homePage = new HomePage();
		railFreightPage = new RailFreightPage();
		bookingsPage = new BookingsPage();

		// homePage = loginPage.login(prop.getProperty("username"),
		// prop.getProperty("password"));
		// Logger TestNG.runTimeInfo("error", "login successful");
		// testUtil.switchToFrame();
		// contactsPage = homePage.clickOnContactsLink();
	}

	@BeforeTest
	public void setVariables() {

		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReportNG.html", true);
		report.addSystemInfo("Environment", "UAT");
		report.addSystemInfo("User", "Admin");
	}

	@AfterTest
	public void pauseReporting() {

		report.flush();
		report.close();

	}

//"E yyyy.MM.dd 'at' hh:mm:ss a zzz"
	public static String Screenshot(WebDriver driver, String screenshotName) throws IOException {

		String datevalue = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String outputFolder = System
				.getProperty("user.dir" + "Screenshots" + screenshotName + " " + datevalue + ".png");

		File destination = new File(outputFolder);

		FileUtils.copyFile(src, destination);

		return outputFolder;

	}

	@Test(priority = 1)
	public void verifyRailFreightTab() {

		Assert.assertEquals(homePage.clickRailFreightLink(), "Rail freight | KiwiRail");
	}

	// @Test(dependsOnMethods = "verifyRailFreightTab")
	public void verifyLoginTab() {

		homePage.clickRailFreightLink();

		Assert.assertEquals(railFreightPage.clickBookLink(), "Home - KiwiRail Freight Hub");

	}

	/*
	 * 
	 * @Test public void createAndVerifyRequest() {
	 * 
	 * homePage.clickRailFreightLink(); railFreightPage.clickBookLink(); Boolean
	 * flag = bookingsPage.reqQuote();
	 * 
	 * softAssert.assertTrue(flag);
	 * 
	 * softAssert.assertTrue(bookingsPage.verifyEmptyContainer());
	 * 
	 * softAssert.assertTrue(bookingsPage.verifyQty());
	 * softAssert.assertTrue(bookingsPage.verifysize());
	 * softAssert.assertTrue(bookingsPage.verifyType());
	 * softAssert.assertTrue(bookingsPage.verifyWeight());
	 * softAssert.assertTrue(bookingsPage.verifyTypeOfGoodsMoving());
	 * 
	 * softAssert.assertTrue(bookingsPage.verifyfirstname());
	 * softAssert.assertTrue(bookingsPage.verifylastname());
	 * softAssert.assertTrue(bookingsPage.verifySuburbName());
	 * softAssert.assertTrue(bookingsPage.verifyDropTime());
	 * 
	 * softAssert.assertAll();
	 * 
	 * }
	 * 
	 * @Test public void verifyRequest() {
	 * 
	 * homePage.clickRailFreightLink(); railFreightPage.clickBookLink(); Boolean
	 * flag = bookingsPage.reqQuote();
	 * 
	 * Assert.assertTrue(flag);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Test public void negativeSignIn() {
	 * 
	 * homePage.clickRailFreightLink(); railFreightPage.clickBookLink();
	 * 
	 * Boolean flag =
	 * bookingsPage.credentials(prop.getProperty("username"),prop.getProperty(
	 * "password"));
	 * 
	 * assertTrue(flag);
	 * 
	 * }
	 * 
	 * //@Test//To run using testng.xml file
	 * 
	 * @Parameters({ "username", "password" }) public void negativeSignInUsingXML
	 * (String username, String password) {
	 * 
	 * homePage.clickRailFreightLink(); railFreightPage.clickBookLink();
	 * 
	 * Boolean flag = bookingsPage.credentials(username, password);
	 * 
	 * assertTrue(flag);
	 * 
	 * }
	 * 
	 */

	// @AfterMethod public void tearDown(){ }

}
