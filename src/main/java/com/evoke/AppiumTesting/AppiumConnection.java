package com.evoke.AppiumTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumConnection {
	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("deviceName", "Realme11");

		URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");

		AppiumDriver driver = new AndroidDriver(appiumServerURL, capabilities);

		System.out.println("App launched successfully!");
		System.out.println("123");

		driver.quit();
	}
}
