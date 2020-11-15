package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utitilty {
	public WebDriver driver;

	public String getScreenshot(String s, WebDriver driver) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\screenshot" + s + ".png";
		FileUtils.copyFile(file, new File(destinationFile));
		return destinationFile;
	}
}
