package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRepo {

	public WebDriver driver;

	public HomePageRepo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Top Deals')]")
	WebElement topDeals;

	@FindBy(xpath = "//a[contains(text(),'Flight Booking')]")
	WebElement flightText;

	@FindBy(xpath = "//input[contains(@placeholder,'Search for Vegetables and Fruits')]")
	WebElement searchbox;
	
	public WebElement getDeals() {
		return topDeals;
	}

	public WebElement getflightText() {
		return flightText;
	}
	
	public void getsearchbox() {
		searchbox.sendKeys("apple");
		
	}

}
