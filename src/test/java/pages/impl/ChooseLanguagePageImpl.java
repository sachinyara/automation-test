package pages.impl;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import pages.IChooseLanguagePage;
import ru.yandex.qatools.allure.annotations.Step;

public class ChooseLanguagePageImpl extends CommonSteps implements IChooseLanguagePage{

	@Step("Get Language to be choosen button")
	@Override
	public WebElement getLanguageToBeChoosen(String languagetobechoosen){
		return findElement(LANGUAGE_TO_BE_CHOOSEN,languagetobechoosen);
	}
	
	@Step("Get Continue button in Choose Language page")
	@Override
	public WebElement getContinueButton(){
		return findElement(CONTINUE_BUTTON);
	}
	
	@Step("Click on Language to be choosen")
	@Override
	public void clickOnLanguageToBeChoosen(String languagetobechoosen){
		getLanguageToBeChoosen(languagetobechoosen).click();
	}
	
	@Step("Click on Continue button")
	@Override
	public void clickOnContinueButton(){
		getContinueButton().click();
	}
}
