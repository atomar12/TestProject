package AppiumTest.AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities cap = new DesiredCapabilities();

		File appDir = new File("src"); // store file object in a reference

		File app = new File(appDir, "ApiDemos-debug.apk"); // It required file object of the parent folder

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AkhilEmulator");

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// new step

		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap); // Path of appium server
		return driver;
	}

}
