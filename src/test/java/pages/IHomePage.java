package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import pages.Locators.HomePageLocators;

public interface IHomePage extends HomePageLocators{

	WebElement getHamburgerIcon();

	WebElement getCategoryToBeChoosen(String categorytobechoosen);

	void clickOnHamburger();

	void clickOnCategoryToBeChoosen(String categorytobechoosen);

	WebElement getShopOnPaytmToBeChoosen(String shoponpaytmtobechoosen);

	void clickOnShopOnPaytmToBeChoosen(String shoponpaytmtobechoosen);

	WebElement getItemType1ToBeChoosen(String womenfashiontobechoosen);

	WebElement getItemType2ToBeChoosen(String westernweartobechoosen);

	void clickOnItemType1ToBeChoosen(String womenfashiontobechoosen);

	void clickOnItemType2ToBeChoosen(String westernweartobechoosen);

	WebElement getItemToBeAddedInBag(String itemtobeaddedinbag);

	WebElement getAddToBagButton();

	WebElement getSizeOfItem(String sizeofitem);

	void clickOnItemToBeAddedInBag(String itemtobeaddedinbag);

	void clickOnAddToBagButton();

	void clickOnSizeOfItem(String sizeofitem);

	void waitForPageToLoad();

	List<WebElement> getRechargeOrPayForList();

	void swipeToGetAllRechargeElements();

	List<WebElement> getRowsTitle();
}
