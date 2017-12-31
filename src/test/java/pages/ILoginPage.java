package pages;

import org.openqa.selenium.WebElement;

import pages.Locators.LoginPageLocators;

public interface ILoginPage extends LoginPageLocators{

	WebElement getLoginRegisteredNo();

	WebElement getLoginPassword();

	WebElement getLoginButton();

	void doFirstTimeLogin(String mobileno, String pswd);

	WebElement getDoItLetterButton();

	void clickOnDoItLaterButton();
    
}
