package qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.base.TestBase;

public class RailFreightPage extends TestBase {

	@FindBy(xpath = "//h3[contains(text(),'Book')]")
	WebElement bookLink;

	@FindBy(xpath = "//h1[contains( text(),'Rail freight')]")
	WebElement railFreightHeading;

	@FindBy(xpath = "//input[@type='submit' and @name = 'signin']")
	WebElement password;
	
	BookingsPage bookingsPage;

	public RailFreightPage() {
		PageFactory.initElements(driver, this);
	}

	public String clickBookLink() {
		String title = null;
		bookingsPage = new BookingsPage();
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", bookLink);

		bookLink.click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> itr = handles.iterator();
		

		String grandParentWindow = itr.next();
		String parentWindow = itr.next();
		String childWindow = itr.next();

		driver.switchTo().window(childWindow);

		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(bookingsPage.bookConsignmentHeading));
		title = driver.getTitle();

		return title;
	}

}
