package qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.base.TestBase;
import qa.util.SeleniumUtil;

public class BookingsPage extends TestBase {

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//h1[contains( text(),'Book your rail freight consignment')]")
	WebElement bookConsignmentHeading;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement signBtn;

	// Request a quote

	@FindBy(xpath = "//a[contains(text(),'Request a quote')]")
	WebElement quoteBtn;

	@FindBy(xpath = "//strong[contains(text(),'entered an incorrect user name or password.')]")
	WebElement errorMessage;

	@FindBy(xpath = "//input[@type = 'checkbox' and @id='productForm.kiwirailToSupply']")
	WebElement containerCheckbox;

	@FindBy(xpath = "//input[@type = 'text' and @id='productForm.quantity']")
	WebElement inputQuantity;

	@FindBy(id = "productForm.containerSize-button")
	WebElement containerSize;

	@FindBy(id = "productForm.containerSize-button") // xpath = "//span[contains(text(),'20\' Hi Cube')]"
														// productForm.containerSize-button
	WebElement size;

	@FindBy(xpath = "//a[contains(text(),'20\' Hi Cube')]") //
	WebElement size1;

	@FindBy(xpath = "//a[contains(text(),'GCM')]") //
	WebElement size2;

	@FindBy(xpath = "//a[@id='productForm.containerType-button']")
	WebElement containertype;

	@FindBy(xpath = "//span[contains(text(),'Reefer')]")
	WebElement type;

	@FindBy(id = "productForm.refrigeration1")
	WebElement operatingCheckbox;

	@FindBy(id = "productForm.setTemperature")
	WebElement temp;

	@FindBy(className = "ui-selectmenu-status")
	WebElement generatorDropdown;

	@FindBy(xpath = "//span[contains(text(),'No generator required')]")
	WebElement noGenerator;

	@FindBy(id = "refrigeration-save")
	WebElement savebutton;

	@FindBy(id = "productForm.weight")
	WebElement weight;

	@FindBy(id = "productForm.commodity-button")
	WebElement commodityDropdown;

	@FindBy(xpath = "//a[contains(text(),'Household effects')]")
	WebElement householdItem;

	@FindBy(id = "productForm.hazardous1")
	WebElement hazardousCheckbox;

	@FindBy(id = "contactForm.email")
	WebElement email;

	@FindBy(id = "contactForm.confirmEmail")
	WebElement email2;

	@FindBy(id = "contactForm.firstName")
	WebElement firstName;

	@FindBy(id = "contactForm.lastName")
	WebElement lastName;

	@FindBy(id = "contactForm.customerReference")
	WebElement custRef;

	@FindBy(id = "contactForm.areaCode")
	WebElement areaCode;

	@FindBy(id = "contactForm.phoneNumber")
	WebElement phoneNumber;

	@FindBy(id = "contactForm.company")
	WebElement company;

	@FindBy(id = "originForm.truckRequired0")
	WebElement originArrange;

	@FindBy(id = "originForm.addressForm.contactName")
	WebElement originContactPerson;

	@FindBy(id = "originForm.addressForm.areaCode")
	WebElement originAreaCode;

	@FindBy(id = "originForm.addressForm.phoneNumber")
	WebElement originPhonenumber;

	@FindBy(id = "originForm.addressForm.streetNumber")
	WebElement originStreetnumber;

	@FindBy(id = "originForm.addressForm.streetName")
	WebElement originStreetname;

	@FindBy(id = "originForm.addressForm.suburb")
	WebElement originSuburb;

	@FindBy(id = "originForm.addressForm.city")
	WebElement originCity;

	@FindBy(xpath = "//input[@id='originForm.deliveryDate']/following-sibling::img")
	WebElement dropOffDate;

	@FindBy(xpath = "//a[contains(text(),'18')]")
	WebElement dropDate;

	@FindBy(xpath = "//a[@id='originForm.deliveryTime-button']")
	WebElement dropTime;

	@FindBy(xpath = "//ul[@id='originForm.pickUpTime-menu']//li[5]//a")
	WebElement timeForLoad;

	@FindBy(xpath = "//input[@id='originForm.pickUpDate']/following-sibling::img")
	WebElement originDate;

	@FindBy(xpath = "//a[contains(text(),'31')]")
	WebElement pickupDate;

	@FindBy(xpath = "//a[@id='originForm.pickUpTime-button']")
	WebElement loadTime;

	@FindBy(xpath = "//span[contains(text(),'06')]")
	WebElement destinationArrangeTime;

	@FindBy(xpath = "//span[contains(text(),'02')]")
	WebElement originArrangeTime;

	@FindBy(id = "originForm.residentialAddress1")
	WebElement residentialAddress;

	@FindBy(id = "originForm.drivewayNarrow0")
	WebElement driveway;

	@FindBy(id = "originForm.storeOffStreet1")
	WebElement storeOffStreet;

	@FindBy(id = "originForm.truckToWait0")
	WebElement truckToWait;

	@FindBy(id = "originForm.groundStable0")
	WebElement groundStable;

	@FindBy(id = "originForm.overheadCable1")
	WebElement overheadCable;

	@FindBy(id = "originForm.doorDirectionInstructions1")
	WebElement specialsInstructions;

	@FindBy(id = "originForm.specialInstructions")
	WebElement instructions;

	@FindBy(id = "destinationForm.truckRequired1")
	WebElement destinationArrange;

	@FindBy(id = "destinationForm.location-button")
	WebElement acceptanceLocation;

	@FindBy(xpath = "//span[contains(text(),'Christchurch')]")
	WebElement deliveryLocation;

	@FindBy(xpath = "//input[@id='destinationForm.travelDate']/following-sibling::img")
	WebElement deliveryReqBy;

	@FindBy(xpath = "//a[contains(text(),'31')]")
	WebElement deliveryDate;

	@FindBy(id = "destinationForm.travelTime-button")
	WebElement deliveryTime;

	@FindBy(id = "destinationForm.specialInstructions")
	WebElement deliveryInstruction;

	@FindBy(xpath = "//button[text() = 'Next']")
	WebElement saveBtn;

	@FindBy(xpath = "//p[contains(text(),'Yes, I want KiwiRail to provide me with an empty container.')]")
	WebElement emptyContainerText;

	@FindBy(xpath = "//div[@class = 'field col-5']//p")
	WebElement sizeValue;

	@FindBy(xpath = "//div[@class='field col-1']")
	WebElement qtyValue;

	@FindBy(xpath = "//p[contains(text(),'Please confirm the details you have provided')]")
	WebElement detailsConfirm;

	@FindBy(xpath = "//h3[contains(text(),'Moving')] /following-sibling::p[1]")
	WebElement typeOfGoodsMoving;

	@FindBy(xpath = "//div[@id='user-details']") // (css = "div#user-details.col-3")//(xpath =
													// "//div[@id='user-details']/p/text()[1]") //(xpath =
													// "//div[@id='user-details']//p//br")
	WebElement userDetails;

	@FindBy(xpath = "//h3[contains(text(),'Company')] /following-sibling::p[1]")
	WebElement verifyCompany;

	@FindBy(xpath = "//h3[contains(text(),'Freight origin')] /following-sibling::div[1]/p") // "//h3[contains(text(),'Freight
																							// origin')]
																							// /following-sibling::div[1]/p/br[2]"
	WebElement verifySuburb;

	@FindBy(xpath = "//h3[contains(text(),'Customer Reference')] /following-sibling::p[1]/strong")
	WebElement verifyRef;
	
	
	

	@FindBy(xpath = "//h3[contains(text(),'Empty container to be dropped off')]/following-sibling::p")
	WebElement verifyDrop;
	
	
	@FindBy(xpath = "//h3[contains(text(),'Special instructions')]/following-sibling::p")
	WebElement verifyInstruction;
	
	
	
	// a id destinationForm.travelTime-button
	// a 31

	// 20' Hi Cube

	// productForm.containerSize-button

	// productForm.quantity text

	// input type checkbox and id productForm.kiwirailToSupply

	static final Logger logger = LogManager.getLogger(BookingsPage.class.getName());

	public BookingsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean credentials(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		signBtn.click();
		if (SeleniumUtil.isDisplayed(errorMessage)) {
			logger.error(errorMessage.getText());
		} else {
			logger.info("Logging to the application.");

		}
		return (SeleniumUtil.isDisplayed(errorMessage));

	}

	public boolean reqQuote() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", quoteBtn);

		quoteBtn.click();
		containerCheckbox.click();
		inputQuantity.sendKeys(prop.getProperty("quantity"));
		size.sendKeys(prop.getProperty("size"));
		weight.sendKeys(prop.getProperty("weight"));
		commodityDropdown.click();
		householdItem.click();
		hazardousCheckbox.click();
		email.sendKeys(prop.getProperty("email"));
		email2.sendKeys(prop.getProperty("email"));
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		custRef.sendKeys(prop.getProperty("customerReference"));
		areaCode.sendKeys(prop.getProperty("areaCode"));
		phoneNumber.sendKeys(prop.getProperty("phoneNumber"));
		company.sendKeys(prop.getProperty("company"));
		originArrange.click();
		originContactPerson.sendKeys(prop.getProperty("contactPerson"));
		originAreaCode.sendKeys(prop.getProperty("areaCode"));
		originPhonenumber.sendKeys(prop.getProperty("phoneNumber"));
		originStreetnumber.sendKeys(prop.getProperty("streetNumber"));
		originStreetname.sendKeys(prop.getProperty("streetName"));
		originSuburb.sendKeys(prop.getProperty("suburb"));
		originCity.sendKeys(prop.getProperty("collectFrom"));
		dropOffDate.click();
		dropDate.click();
		dropTime.click();
		originDate.click();
		pickupDate.click();
		dropTime.sendKeys(prop.getProperty("dropTime"));
		loadTime.sendKeys(prop.getProperty("loadTime"));

		residentialAddress.click();

		driveway.click();

		storeOffStreet.click();

		truckToWait.click();

		groundStable.click();

		overheadCable.click();

		specialsInstructions.click();

		instructions.sendKeys(prop.getProperty("instructions"));

		destinationArrange.click();

		// JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		// js2.executeScript("arguments[0].scrollIntoView(true);", acceptanceLocation);

		acceptanceLocation.sendKeys(prop.getProperty("acceptanceLocation"));
		deliveryReqBy.click();
		deliveryDate.click();
		deliveryTime.sendKeys(prop.getProperty("loadTime"));
		deliveryInstruction.sendKeys(prop.getProperty("specialInstructions"));

		saveBtn.click();

		return detailsConfirm.isDisplayed();

	}

	public boolean verifyEmptyContainer() {

		return emptyContainerText.isDisplayed();

	}

	public boolean verifysize() {

		String value = sizeValue.getText();

		String[] result = value.split(",");

		return result[0].equals(prop.getProperty("size"));

	}

	public boolean verifyQty() {
		// TODO Auto-generated method stub
		return qtyValue.getText().equals(prop.getProperty("quantity"));
	}

	public boolean verifyType() {

		String value = sizeValue.getText();

		String[] result = value.split(",");

		return result[1].trim().equals(prop.getProperty("type"));

	}

	public boolean verifyWeight() {

		String value = sizeValue.getText();

		String[] result = value.split(",");

		return result[2].substring(1, 3).equals(prop.getProperty("weight"));

	}

	public boolean verifyTypeOfGoodsMoving() {

		return (typeOfGoodsMoving.getText().equals(prop.getProperty("goods")));

	}

	//// working on this
	public boolean verifyfirstname() {

		String[] result = userDetails.getText().split(" ");

		System.out.println(result[0] + "************************");
		return (result[0].equals(prop.getProperty("firstname")));

	}

	public boolean verifylastname() {
		String[] result = userDetails.getText().split(" ");
		String s = userDetails.getText();

		System.out.println(result + "**************************************************4444");
        System.out.println(userDetails.getText()+ "1111111111111");
		//return (result[1].substring(0, 6).equals(prop.getProperty("lastname")));
		return (userDetails.getText().contains(prop.getProperty("lastname")));
	}

	public boolean verifySuburbName() {
		String result = verifySuburb.getText();

		System.out.println(result + "*****************");
		return (result.contains(prop.getProperty("suburb")));

	}
	
	public boolean verifyDropTime() {
		String result = verifyDrop.getText();

		System.out.println(result + "*****************");
		return (result.contains(prop.getProperty("dropTime")));

	}
	
	
	
	
	  public boolean verifyInstructions() {
	  
	  return verifyInstruction.getText().equals(prop.getProperty("specialInstructions"));
	  
	  }
	  
	  /*
	  public boolean verifyEmptyContainer() {
	  
	  return emptyContainerText.isDisplayed();
	  
	  }
	 */

}
