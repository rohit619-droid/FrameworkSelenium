package green_cart;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.base;
import objrepo.HomePageRepo;

public class CartPage extends base {
	public WebDriver driver;

	Logger log = LogManager.getLogger(CartPage.class);

	@BeforeTest
	public void setup() throws IOException {
		driver = initilize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void Veg(){

		HomePageRepo a = new HomePageRepo(driver);
		String text = a.getflightText().getText();
		log.info("done...........flight" + text);
		a.getsearchbox();
		System.out.println("cartEnd");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
