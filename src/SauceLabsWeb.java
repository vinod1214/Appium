import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsWeb {
  private static WebDriver driver;

  
  public static void main (String args[]) throws MalformedURLException, InterruptedException {
    String sauceUserName = "vinod-kumar";
    String sauceAccessKey = "515f229a-1453-4947-af53-f3c3aed627a3";

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("username", sauceUserName);
    capabilities.setCapability("accessKey", sauceAccessKey);
    capabilities.setCapability("browserName", "Chrome");
    capabilities.setCapability("browserVersion", "84.0");
    capabilities.setCapability("platform", "Windows 10");
    driver = new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"), capabilities);
    driver.navigate().to("https://www.saucedemo.com");
    WebDriverWait wait = new WebDriverWait(driver, 5);
    By userNameFieldLocator = By.cssSelector("[type='text']");
    wait.until(ExpectedConditions.visibilityOfElementLocated(userNameFieldLocator));
    driver.findElement(userNameFieldLocator).sendKeys("standard_user");
    driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("[type='submit']")).click();
    Thread.sleep(3000);
    driver.quit();

  }

}


