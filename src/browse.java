import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.appium.java_client.android.AndroidDriver;

public class browse extends baseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<WebElement> driver = capabilities();
//		driver.get("http://www.facebook.com");
//		driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("querty");
//		driver.findElementByXPath("//input[@id='m_login_password']").sendKeys("12345");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElementByXPath("//button[@name='login']").click();
		
		driver.get("http://www.cricbuzz.com");
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByXPath("//a[@title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,480)", "");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
	}

}
