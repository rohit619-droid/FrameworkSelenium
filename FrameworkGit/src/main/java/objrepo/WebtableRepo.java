package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebtableRepo {

	public WebDriver driver;

	public WebtableRepo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='brand greenLogo']")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
}
