package pages.impl;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import io.appium.java_client.android.AndroidKeyCode;
import pages.ILoginPage;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPageImpl extends CommonSteps implements ILoginPage{

	@Step("Get phone number on Login page")
	@Override
	public WebElement getLoginRegisteredNo(){
		return findElement(REGISTERED_NUMBER_LOGIN);
	}
	
	@Step("Get password on Login page")
	@Override
	public WebElement getLoginPassword(){
		return findElement(LOGIN_PASSWORD);
	}
	
	@Step("Get login button on Login page")
	@Override
	public WebElement getLoginButton(){
		return findElement(LOGIN_BUTTON);
	}
	
	@Step("Get Do It Letter button on Login page")
	@Override
	public WebElement getDoItLetterButton(){
		return findElement(LOGIN_DO_IT_LATER_BUTTON);
	}
	
	@Step("Login to application")
	@Override
	public void doFirstTimeLogin(String mobileno, String pswd){
		getLoginRegisteredNo().sendKeys(mobileno);
		getLoginPassword().sendKeys(pswd);
		enterKey(AndroidKeyCode.ENTER, 66);
		getLoginButton().click();
	}
	
	@Override
	public void clickOnDoItLaterButton(){
		getDoItLetterButton().click();
	}
}
