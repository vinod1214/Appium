import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class gestures extends base {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	 AndroidDriver<WebElement> driver =	capabilities();
	 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 TouchAction t = new TouchAction(driver);
	 WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	 t.tap(tapOptions().withElement(element(expandList))).perform();
	 driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	 WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	 t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
	 System.out.println(driver.findElementById("android:id/title").isDisplayed());
	 
	 
	}
}
