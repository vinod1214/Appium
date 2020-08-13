import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Androidautomator extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<WebElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * syntax 
		 * driver.findElementByAndroidUIAutomator("attribute("Value")").click();
		 */
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		/*
		 * syntax
		 * driver.findElementsByAndroidUIAutomator("new UiSelector.property(value)").szie();
		 */
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
	}

}
