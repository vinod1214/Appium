import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AmazonLogin extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<WebElement>driver = capabilities();
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement English = driver.findElement(By.xpath ("//android.widget.ImageView[@bounds='[55,924][717,1370]']"));
		English.click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Already a customer? Sign in']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[112,742][1330,896]']")).sendKeys("8008586520");
		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@bounds='[49,749][689,871]']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[49,535][1393,689]']")).sendKeys("Winod1@14");
		driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click();
		Thread.sleep(35000);
		//System.out.println(driver.getPageSource());
		String text1 = "कैंसिल करें";
		String text2 = "Cancel";
		try {
		if(text1.equalsIgnoreCase("कैंसिल करें")) {
			driver.findElement(By.xpath("//android.widget.Button[@text='कैंसिल करें']")).click();
		}else if(text2.equalsIgnoreCase("Cancel")) {
			driver.findElement(By.xpath("//android.widget.Button[@text='Cancel']")).click();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"EOSS | Styles for men | Up to 70% off\"))");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Footwear | Up to 70% off\"))");
		driver.findElement(By.xpath("//*[@text='Footwear | Up to 70% off']")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Casual Footwear & Sports Shoes\"))");
		driver.findElement(By.xpath("//*[@text='Sports Shoes']")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Shozie Men's Running Sports Shoes\"))");
		driver.findElement(By.xpath("//*[@bounds='[56,483][682,689]']")).click();
		//Thread.sleep(3000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Previous\"))");
		System.out.println(driver.getPageSource());

	}

}
