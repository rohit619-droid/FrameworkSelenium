package test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.base;
import objrepo.HomePageRepo;
import objrepo.WebtableRepo;

public class homePage extends base {
	public WebDriver driver;

	Logger log = LogManager.getLogger(cartPage.class);

	@BeforeTest
	public void setup() throws IOException {
		driver = initilize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void homePageClick() throws IOException, InterruptedException {

		HomePageRepo p = new HomePageRepo(driver);
		p.getDeals().click();
		
	}

	@Test(dataProvider = "getdata")
	public void data(String food) throws InterruptedException {
		WebtableRepo op = new WebtableRepo(driver);
		Thread.sleep(3000);
		System.out.println(food);
		String logo = op.getLogo().getText();
		System.out.println("logo->" + logo);
		Assert.assertEquals("blukart", logo);
	}

	@DataProvider
	public Object[][] getdata() {
		return new Object[][] { { "Wheat" } };
	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}
}
