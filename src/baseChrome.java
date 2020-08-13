//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseChrome {

	public static AndroidDriver<WebElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		/*File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");*/
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability("chromedriverExecutable", "C:\\Users\\VDUDDUKU\\Downloads\\chromedriver.exe");
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
	}

}
