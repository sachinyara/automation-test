package common;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

import ru.yandex.qatools.allure.annotations.Attachment;
import scenarios.AndroidSetup;

public class TakeScreenshot extends AndroidSetup implements IHookable {

	public void run(IHookCallBack callBack, ITestResult testResult) {

		callBack.runTestMethod(testResult);
		if (testResult.getThrowable() != null) {
			try {
				takeScreenShot(testResult.getMethod().getMethodName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Attachment(value = "Screenshot for failure in method {0}", type = "image/png")
	private static byte[] takeScreenShot(String methodName) throws IOException {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		return screenshot;
	}
}
