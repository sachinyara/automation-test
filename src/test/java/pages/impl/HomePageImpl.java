package pages.impl;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import pages.IHomePage;
import scenarios.AndroidSetup;

public class HomePageImpl extends CommonSteps implements IHomePage{

	@Override
	public WebElement getHamburgerIcon(){
		return findElement(HOMEPAGE_HAMBURGER);
	}
	
	@Override
	public WebElement getCategoryToBeChoosen(String categorytobechoosen){
		return findElement(CATEGORY_TO_BE_CHOOSEN, categorytobechoosen);
	}
	
	@Override
	public WebElement getShopOnPaytmToBeChoosen(String shoponpaytmtobechoosen){
		return findElement(SHOP_ON_PAYTM_TO_BE_CHOOSEN, shoponpaytmtobechoosen);
	}
	
	@Override
	public WebElement getItemType1ToBeChoosen(String womenfashiontobechoosen){
		return findElement(WOMEN_FASHION_TO_BE_CHOOSEN, womenfashiontobechoosen);
	}
	
	@Override
	public WebElement getItemType2ToBeChoosen(String westernweartobechoosen){
		return findElement(WESTERN_WEAR_TO_BE_CHOOSEN, westernweartobechoosen);
	}
	
	@Override
	public WebElement getItemToBeAddedInBag(String itemtobeaddedinbag){
		return findElement(ITEM_TO_BE_ADDED_IN_BAG, itemtobeaddedinbag);
	}
	
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
	
	@Override
	public void clickOnHamburger(){
		getHamburgerIcon().click();
	}
	
	@Override
	public void clickOnCategoryToBeChoosen(String categorytobechoosen){
		getCategoryToBeChoosen(categorytobechoosen).click();
	}
	
	@Override
	public void clickOnShopOnPaytmToBeChoosen(String shoponpaytmtobechoosen){
		getShopOnPaytmToBeChoosen(shoponpaytmtobechoosen).click();
	}
	
	@Override
	public void clickOnItemType1ToBeChoosen(String womenfashiontobechoosen){
		getItemType1ToBeChoosen(womenfashiontobechoosen).click();
	}
	
	@Override
	public void clickOnItemType2ToBeChoosen(String westernweartobechoosen){
		getItemType2ToBeChoosen(westernweartobechoosen).click();
	}
	
	@Override
	public void clickOnItemToBeAddedInBag(String itemtobeaddedinbag){
		getItemToBeAddedInBag(itemtobeaddedinbag).click();
	}
	
	@Override
	public void clickOnAddToBagButton(){
		getAddToBagButton().click();
	}
	
	@Override
	public void clickOnSizeOfItem(String sizeofitem){
		getSizeOfItem(sizeofitem).click();
	}
}
