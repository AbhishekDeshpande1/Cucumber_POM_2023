package com.test.practise.testbase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.test.practise.utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver;

	public static void setup() {
		String browserName = ConfigReader.getProperties("browser");

		if (browserName.equals("chrome")) {
			driver = WebDriverManager.chromedriver().create();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		} else if (browserName.equals("Firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} else if (browserName.equals("Safari")) {
			driver = WebDriverManager.safaridriver().create();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	public static void closeBrowser() {
		driver.quit();
	}
}
