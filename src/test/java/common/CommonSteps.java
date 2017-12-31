package common;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import ru.yandex.qatools.allure.annotations.Step;
import scenarios.AndroidSetup;

public class CommonSteps extends AndroidSetup {

	private static final Logger LOG = Logger.getLogger(CommonSteps.class.getName());

	protected static void log(String message) {
		LOG.info(message);
		System.out.println(message);
	}

	@Step("{0} : Verified")
	private static void logForAssert(String message) {
		Reporter.log(message);
		System.out.println(message);
		LOG.info(message);
	}

	protected static void assertTrueAllure(boolean condition, String passMessage, String failMessage) {
		if (condition) {
			assertTrue(true);
			logForAssert(passMessage);
		} else {
			logForAssert(failMessage);
			assertTrue(false);
		}
	}

	protected static void assertFalseAllure(boolean condition, String failMessage, String passMessage) {
		if (!condition) {
			assertFalse(false);
			logForAssert(passMessage);
		} else {
			logForAssert(failMessage);
			assertFalse(true);
		}
	}

	protected WebElement findElement(String elementXPath) {
		return driver.findElement(By.xpath(elementXPath));
	}

	protected WebElement findElement(String elementXPath, String replacingtext) {
		return driver.findElement(By.xpath(elementXPath.replace("%s", replacingtext)));
	}

	protected List<WebElement> findElements(String elementXPath) {
		return driver.findElements(By.xpath(elementXPath));
	}

	protected void enterKey(int key, int metastate) {
		driver.sendKeyEvent(key, metastate);
	}

	protected void waitForPresent(String locator, int secondstowait) {

		WebDriverWait wait = new WebDriverWait(driver, secondstowait);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}

	protected void waitForPageToLoad() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
