package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import pages.Locators.ShoppingBagPageLocators;

public interface IShoppingBagPage extends ShoppingBagPageLocators{

	WebElement getShoppingBagEditButton();

	WebElement getEditShoppingBagRemoveButton(String editshoppingbagremovebutton);

	WebElement getEmptyShoppingBagMessage();

	void clickOnShoppingBagEditButton();

	void clickOnEditShoppingBagRemoveButton(String editshoppingbagremovebutton);

	WebElement getShoppingBagBackButton();

	void clickOnShoppingBagBackButton();

	List<WebElement> getCheckboxsInEditBag();

	void validateDefaultCheckboxSelectionForMoreItemsInBag();

	void validateDefaultCheckboxSelectionForOneItemInBag();

	WebElement getCheckboxForOneItemInEditBag();

	void checkAllCheckboxesInEditBag();

}
