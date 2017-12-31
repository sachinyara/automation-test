package pages.impl;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import common.CommonSteps;
import pages.IShoppingBagPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ShoppingBagPageImpl extends CommonSteps implements IShoppingBagPage {

	@Step("Get Shopping bag edit button")
	@Override
	public WebElement getShoppingBagEditButton() {
		return findElement(SHOPPING_BAG_EDIT_BUTTON);
	}

	@Step("Get Shopping bag remove button")
	@Override
	public WebElement getEditShoppingBagRemoveButton(String editshoppingbagremovebutton) {
		return findElement(EDIT_SHOPPING_BAG_REMOVE_BUTTON, editshoppingbagremovebutton);
	}

	@Step("Get Empty Shopping bag Message")
	@Override
	public WebElement getEmptyShoppingBagMessage() {
		return findElement(SHOPPING_BAG_EMPTY_MSG);
	}

	@Step("Get App Back Button")
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

	@Step("Click on Shopping bag edit button")
	@Override
	public void clickOnShoppingBagEditButton() {
		getShoppingBagEditButton().click();
	}

	@Step("Click on Shopping bag remove button")
	@Override
	public void clickOnEditShoppingBagRemoveButton(String editshoppingbagremovebutton) {
		getEditShoppingBagRemoveButton(editshoppingbagremovebutton).click();
	}

	@Step("Click on App back button")
	@Override
	public void clickOnShoppingBagBackButton() {
		getShoppingBagBackButton().click();
	}

	@Step("Validate Default Checkbox selection for one item in bag")
	@Override
	public void validateDefaultCheckboxSelectionForOneItemInBag(){
	    assertTrue(getCheckboxForOneItemInEditBag().isSelected(), "Checkbox in Edit Bag is not selected");
	}
	
	@Step("Validate Default Checkboxes selection for more items in bag")
	@Override
	public void validateDefaultCheckboxSelectionForMoreItemsInBag(){
	    List<WebElement> checkboxes = getCheckboxsInEditBag();
	    for(WebElement checkbox:checkboxes){
	    	assertFalse(checkbox.isSelected(), "Checkbox in Edit Bag is selected");
	    }
	}
	
	@Step("Check checboxes for all items in bag")
	@Override
	public void checkAllCheckboxesInEditBag(){
		List<WebElement> checkboxes = getCheckboxsInEditBag();
	    for(WebElement checkbox:checkboxes){
	    	checkbox.click();
	    }
	}
}
