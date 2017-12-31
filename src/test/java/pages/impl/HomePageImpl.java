package pages.impl;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import pages.IHomePage;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePageImpl extends CommonSteps implements IHomePage{

	@Step("Get Hamburger Icon in home page")
	@Override
	public WebElement getHamburgerIcon(){
		return findElement(HOMEPAGE_HAMBURGER);
	}
	
	@Step("Get Category to be choosen")
	@Override
	public WebElement getCategoryToBeChoosen(String categorytobechoosen){
		return findElement(CATEGORY_TO_BE_CHOOSEN, categorytobechoosen);
	}
	
	@Step("Get Category to be choosen")
	@Override
	public WebElement getShopOnPaytmToBeChoosen(String shoponpaytmtobechoosen){
		return findElement(SHOP_ON_PAYTM_TO_BE_CHOOSEN, shoponpaytmtobechoosen);
	}
	
	@Step("Get Item type to be choosen")
	@Override
	public WebElement getItemType1ToBeChoosen(String womenfashiontobechoosen){
		return findElement(WOMEN_FASHION_TO_BE_CHOOSEN, womenfashiontobechoosen);
	}
	
	@Step("Get Item type to be choosen")
	@Override
	public WebElement getItemType2ToBeChoosen(String westernweartobechoosen){
		return findElement(WESTERN_WEAR_TO_BE_CHOOSEN, westernweartobechoosen);
	}
	
	@Step("Get Item to be added in bag")
	@Override
	public WebElement getItemToBeAddedInBag(String itemtobeaddedinbag){
		return findElement(ITEM_TO_BE_ADDED_IN_BAG, itemtobeaddedinbag);
	}
	
	@Step("Get Add to bag button")
	@Override
	public WebElement getAddToBagButton(){
		return findElement(ADD_TO_BAG_BUTTON);
	}
	
	@Override
	public WebElement getSizeOfItem(String sizeofitem){
		return findElement(SIZE_OF_ITEM, sizeofitem);
	}
	
	@Override
	public void waitForPageToLoad(){
		waitForPresent(HOMEPAGE_HAMBURGER, 20);
	}
	
	@Step("Click on Hamburger Icon")
	@Override
	public void clickOnHamburger(){
		getHamburgerIcon().click();
	}
	
	@Step("Click on Category to be choosen")
	@Override
	public void clickOnCategoryToBeChoosen(String categorytobechoosen){
		getCategoryToBeChoosen(categorytobechoosen).click();
	}
	
	@Step("Click on Category to be choosen")
	@Override
	public void clickOnShopOnPaytmToBeChoosen(String shoponpaytmtobechoosen){
		getShopOnPaytmToBeChoosen(shoponpaytmtobechoosen).click();
	}
	
	@Step("Click on Item Type to be choosen")
	@Override
	public void clickOnItemType1ToBeChoosen(String womenfashiontobechoosen){
		getItemType1ToBeChoosen(womenfashiontobechoosen).click();
	}
	
	@Step("Click on Item Type to be choosen")
	@Override
	public void clickOnItemType2ToBeChoosen(String westernweartobechoosen){
		getItemType2ToBeChoosen(westernweartobechoosen).click();
	}
	
	@Step("Click on Item to be added in bag")
	@Override
	public void clickOnItemToBeAddedInBag(String itemtobeaddedinbag){
		getItemToBeAddedInBag(itemtobeaddedinbag).click();
	}
	
	@Step("Click on Add to Bag button")
	@Override
	public void clickOnAddToBagButton(){
		getAddToBagButton().click();
	}
	
	@Override
	public void clickOnSizeOfItem(String sizeofitem){
		getSizeOfItem(sizeofitem).click();
	}
}
