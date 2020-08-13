import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class SampleSauceTest {

	private static AndroidDriver<WebElement> driver;
//	public static String sauceUsername = "vinod-kumar";
//	public static String sauceAccesskey = "515f229a-1453-4947-af53-f3c3aed627a3";
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		String sauceUserName = "vinod-kumar";
	    String sauceAccessKey = "515f229a-1453-4947-af53-f3c3aed627a3";
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("username", sauceUserName);
	    caps.setCapability("accessKey", sauceAccessKey);
		caps.setCapability("appiumVersion", "1.17.1");
		caps.setCapability("deviceName","Google Pixel 3 XL GoogleAPI Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("platformName","Android");
	    driver = new AndroidDriver<WebElement>(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"), caps);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);

	}

}
