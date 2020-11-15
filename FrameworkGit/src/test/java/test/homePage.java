package test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.base;
import objrepo.HomePageRepo;
import objrepo.WebtableRepo;

public class homePage extends base {

	@BeforeTest
	public void setup() throws IOException {
		driver = initilize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void main() throws IOException, InterruptedException {

		HomePageRepo p = new HomePageRepo(driver);
		p.getDeals().click();

	}

	@Test(dataProvider = "getdata", dependsOnMethods = "main")
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
