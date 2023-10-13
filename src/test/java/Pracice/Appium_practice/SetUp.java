package Pracice.Appium_practice;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class SetUp {
	 public AppiumDriverLocalService service;
	 public AndroidDriver driver;
	 
	@BeforeClass
	
	public void AppiumSetUp() throws MalformedURLException {
	
		
	 service  = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1")
			 .usingPort(4723).build();
	 service.start();
	UiAutomator2Options options = new UiAutomator2Options();
	options.setDeviceName("Pixel 2 XL");
	options.setApp("C:\\Users\\HP\\eclipse-workspace\\Appium-practice\\src\\test\\java\\resources\\ApiDemos-debug.apk");
	
	
	
	
	driver  = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	
	}
	
	
	@AfterClass
	
	public void tearDown() {
	driver.quit();
	service.stop();
	}
	
}

