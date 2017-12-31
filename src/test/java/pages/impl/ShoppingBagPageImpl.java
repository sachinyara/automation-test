package pages.impl;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import pages.IShoppingBagPage;

public class ShoppingBagPageImpl extends CommonSteps implements IShoppingBagPage {

	@Override
	public WebElement getShoppingBagEditButton() {
		return findElement(SHOPPING_BAG_EDIT_BUTTON);
	}

	@Override
	public WebElement getEditShoppingBagRemoveButton(String editshoppingbagremovebutton) {
		return findElement(EDIT_SHOPPING_BAG_REMOVE_BUTTON, editshoppingbagremovebutton);
	}

	@Override
	public WebElement getEmptyShoppingBagMessage() {
		return findElement(SHOPPING_BAG_EMPTY_MSG);
	}

	@Override
	public WebElement getShoppingBagBackButton() {
		return findElement(SHOPPING_BAG_BACK_BUTTON);
	}
	
	@Override
	public WebElement getCheckboxForOneItemInEditBag() {
		return findElement(EDIT_SHOPPING_BAG_CHECKBOXES);
	}

	@Override
	public List<WebElement> getCheckboxsInEditBag() {
		return findElements(EDIT_SHOPPING_BAG_CHECKBOXES);
	}

	@Override
	public void clickOnShoppingBagEditButton() {
		getShoppingBagEditButton().click();
	}

	@Override
	public void clickOnEditShoppingBagRemoveButton(String editshoppingbagremovebutton) {
		getEditShoppingBagRemoveButton(editshoppingbagremovebutton).click();
	}

	@Override
	public void clickOnShoppingBagBackButton() {
		getShoppingBagBackButton().click();
	}

	@Override
	public void validateDefaultCheckboxSelectionForOneItemInBag(){
	    assertTrue(getCheckboxForOneItemInEditBag().isSelected(), "Checkbox in Edit Bag is not selected");
	}
	
	@Override
	public void validateDefaultCheckboxSelectionForMoreItemsInBag(){
	    List<WebElement> checkboxes = getCheckboxsInEditBag();
	    for(WebElement checkbox:checkboxes){
	    	assertFalse(checkbox.isSelected(), "Checkbox in Edit Bag is selected");
	    }
	}
	
	@Override
	public void checkAllCheckboxesInEditBag(){
		List<WebElement> checkboxes = getCheckboxsInEditBag();
	    for(WebElement checkbox:checkboxes){
	    	checkbox.click();
	    }
	}
}
