package com.seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoTestCase {

	public static void main(String[] args) throws MalformedURLException{
		
		WebDriver driver;
		
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ds);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
