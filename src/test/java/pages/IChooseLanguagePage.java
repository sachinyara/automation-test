package pages;


import org.openqa.selenium.WebElement;

import pages.Locators.ChooseLanguagePageLocators;

public interface IChooseLanguagePage extends ChooseLanguagePageLocators{

	WebElement getLanguageToBeChoosen(String languagetobechoosen);

	WebElement getContinueButton();

	void clickOnLanguageToBeChoosen(String languagetobechoosen);

	void clickOnContinueButton();
	
}
