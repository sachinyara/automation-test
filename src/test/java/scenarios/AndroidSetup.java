package scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class AndroidSetup {

	protected static AndroidDriver<WebElement> driver;

	@Step("Setting capabilities and Opening App")
	protected void prepareAndroidForAppium() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

		// Mandatory capabilities
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");

		// Other caps
		capabilities.setCapability("appPackage", "net.one97.paytm");
		capabilities.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");

		capabilities.setCapability("unicodeKeyboard", "true");                                     
		capabilities.setCapability("resetKeyboard", "true");
		
		System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}
	
	@Step("Closing App")
	protected void closeApp(){
		driver.quit();
	}
}
