package com.Simpleopenbrowser;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_browser {
	
	WebDriver driver;
	 @Test
	public void open_url()
	
	{
	
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.get("https://www.gdata.in/");
		 String x = driver.getTitle();
		 assertEquals("Web & App Dev. | Digital Marketing | IMS | General Data", x);
		 driver.close();
	}

}
