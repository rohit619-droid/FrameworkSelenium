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

	@FindBy(xpath = "//input[@type='search']")
	WebElement searchbox;
	public WebElement getDeals() {
		return topDeals;
	}
	
	public WebElement searchbox() {
		return searchbox;
	}

}
