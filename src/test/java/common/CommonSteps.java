package common;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
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

	protected void swipeRightToLeft() {

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		// Find swipe start and end point from screen's with and height.
		// Find startx point which is at right side of screen.
		int startx = (int) (size.width * 0.9);
		// Find endx point which is at left side of screen.
		int endx = (int) (size.width * 0.1);
		// Find vertical point where you wants to swipe. It is in middle of
		// screen height.
		int starty = size.height / 2;
		System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		// Swipe from Right to Left.
		driver.swipe(startx, starty, endx, starty, 1000);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void swipeBottomToTop() {

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		int starty = (int) (size.height * 0.6);
		int endy = (int) (size.height * 0.3);
		int startx = size.width / 2;
		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		driver.swipe(startx, starty, startx, endy, 1000);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
