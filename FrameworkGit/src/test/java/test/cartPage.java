package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.base;
import objrepo.HomePageRepo;

public class cartPage extends base {

	@BeforeTest
	public void setup() throws IOException {
		driver = initilize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void main() throws IOException, InterruptedException {

		HomePageRepo p = new HomePageRepo(driver);
		p.searchbox().sendKeys("brinjal");
	}

	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
