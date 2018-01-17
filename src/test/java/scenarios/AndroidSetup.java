package scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class AndroidSetup{
	
	protected static AndroidDriver<WebElement> driver;
	
	@BeforeSuite
	@Parameters({"port","device"})
	@Step("Setting capabilities and Opening App")
	protected void prepareAndroidForAppium(String port,String device) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

		// Mandatory capabilities
		capabilities.setCapability("deviceName", device);
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.3.3");

		// Other caps
		capabilities.setCapability("appPackage", "net.one97.paytm");
		capabilities.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");

		capabilities.setCapability("unicodeKeyboard", "true");                                     
		capabilities.setCapability("resetKeyboard", "true");
		
		System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
		String url= "http://0.0.0.0:"+port+"/wd/hub";
		driver = new AndroidDriver<>(new URL(url), capabilities);
	}
	
	@Step("Closing App")
	protected void closeApp(){
		driver.quit();
	}
}
