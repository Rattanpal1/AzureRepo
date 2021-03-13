package qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.base.TestBase;

public class HomePage extends TestBase {

//a[text(),'Rail freight']

	@FindBy(xpath = "//a[contains(text(),'Rail freight')] ")
	WebElement railFreightLink;

	@FindBy(id = "login-signin")
	WebElement nextBtn;

	@FindBy(xpath = "//input[@type='submit' and @name = 'signin']")
	WebElement password;

	RailFreightPage railFreightPage;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String clickRailFreightLink() {
		String title = null;
		railFreightPage = new RailFreightPage();

		railFreightLink.click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> itr = handles.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();

		driver.switchTo().window(childWindow);

		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(railFreightPage.railFreightHeading));
		title = driver.getTitle();

		return title;
	}

	
	public String clickRailFreightLinkOld() {
		String title = null;

		try {
			railFreightLink.click();

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> itr = handles.iterator();

			String parentWindow = itr.next();
			String childWindow = itr.next();

			driver.switchTo().window(childWindow);

			Thread.sleep(5);
			title = driver.getTitle();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return title;
	}

}
