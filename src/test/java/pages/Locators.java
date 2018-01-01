package pages;

public interface Locators {

	/**
	 * Locator repository to hold login page locators
	 */
	public interface LoginPageLocators {
		String REGISTERED_NUMBER_LOGIN = "//*[@resource-id='net.one97.paytm:id/edit_username']";
		String LOGIN_PASSWORD = "//*[@resource-id='net.one97.paytm:id/edit_password']";
		String LOGIN_BUTTON = "//*[@resource-id='net.one97.paytm:id/lyt_sign_in_button']";
		String LOGIN_DO_IT_LATER_BUTTON = "//*[@text='Do It Later']";
	}

	/**
	 * 
	 */
	public interface ChooseLanguagePageLocators {
		String LANGUAGE_TO_BE_CHOOSEN = "//*[@text='%s']";
		String CONTINUE_BUTTON = "//*[@resource-id='net.one97.paytm:id/btn_language_continue_button']";
	}

	/**
	 * Locator repository to hold home page locators
	 */
	public interface HomePageLocators {
		String HOMEPAGE_HAMBURGER = "//*[@class='android.widget.ImageButton']";
		String CATEGORY_TO_BE_CHOOSEN = "//*[contains(@text,'%s')]";
		String SHOP_ON_PAYTM_TO_BE_CHOOSEN = "//*[contains(@text,'%s')]";
		String WOMEN_FASHION_TO_BE_CHOOSEN = "//*[contains(@text,'%s')]";
		String WESTERN_WEAR_TO_BE_CHOOSEN = "//*[contains(@text,'%s')]";
		String ITEM_TO_BE_ADDED_IN_BAG = "//*[contains(@text,'%s')]";
		String ADD_TO_BAG_BUTTON = "//*[@resource-id='net.one97.paytm:id/pdp_no_offer_price']";
		String SIZE_OF_ITEM = "//*[@text='%s']";
		String RECHARGE_ORPAY_FOR_LIST = "//*[contains(@text,'Recharge')]/following-sibling::*[1]/descendant::*/*[@resource-id='net.one97.paytm:id/item_name']";
		String HOME_PAGE_ROW_TITLE = "//*[@resource-id='net.one97.paytm:id/txt_row_title']";
	}

	public interface ShoppingBagPageLocators {
		String SHOPPING_BAG_EDIT_BUTTON = "//*[@text='Edit']";
		String EDIT_SHOPPING_BAG_REMOVE_BUTTON = "//*[@text='%s']";
		String SHOPPING_BAG_EMPTY_MSG = "//*[@text='Your Bag is empty']";
		String SHOPPING_BAG_BACK_BUTTON = "//*[contains(@content-desc,'Navigate up')]";
		String EDIT_SHOPPING_BAG_CHECKBOXES = "//*[@resource-id='net.one97.paytm:id/edit_cart_item_remove_icon']";
	}

}
