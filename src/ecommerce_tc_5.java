import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("deprecation")
public class ecommerce_tc_5 extends base {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<WebElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"))");
		driver.findElement(By.xpath("//*[@text='Australia']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sumAmount = 0;
		for(int i=0;i<count;i++) {
			String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			double amount=getAmount(amount1);
			sumAmount=sumAmount+amount;
		}
//		String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
//		amount1 = amount1.substring(1);
//		double doubleamount1 = Double.parseDouble(amount1);
//		String amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
//		amount2 = amount2.substring(1);
//		double doubleamount2 = Double.parseDouble(amount2);
//		double sumAmount = doubleamount1 + doubleamount2;
		System.out.println(sumAmount);
		
		String totalAmount = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		totalAmount = totalAmount.substring(1);
		double total = Double.parseDouble(totalAmount);
		System.out.println(total);
		Assert.assertEquals(sumAmount, total );
		//mobile gestures
		WebElement checkbox = driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']"));
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		WebElement tc = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.className("android.widget.Button")).click();

	}
	public static double getAmount(String value) {
		value = value.substring(1);
		double double2amount = Double.parseDouble(value);
		return double2amount;
	}

}
