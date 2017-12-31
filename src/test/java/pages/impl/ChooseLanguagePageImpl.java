package pages.impl;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import pages.IChooseLanguagePage;

public class ChooseLanguagePageImpl extends CommonSteps implements IChooseLanguagePage{

	@Override
	public WebElement getLanguageToBeChoosen(String languagetobechoosen){
		return findElement(LANGUAGE_TO_BE_CHOOSEN,languagetobechoosen);
	}
	
	@Override
	public WebElement getContinueButton(){
		return findElement(CONTINUE_BUTTON);
	}
	
	@Override
	public void clickOnLanguageToBeChoosen(String languagetobechoosen){
		getLanguageToBeChoosen(languagetobechoosen).click();
	}
	
	@Override
	public void clickOnContinueButton(){
		getContinueButton().click();
	}
}
