package Pracice.Appium_practice;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class WiFiSettings extends SetUp {
	
	@Test
	public void SetupWiFI() {
	
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	}

}
