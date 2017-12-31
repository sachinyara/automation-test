package scenarios;

import static org.testng.Assert.assertTrue;
import static pages.MobilePageFactory.getFactory;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.CommonSteps;
import common.TakeScreenshot;
import pages.IChooseLanguagePage;
import pages.IHomePage;
import pages.ILoginPage;
import pages.IShoppingBagPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ TakeScreenshot.class })

public class TestEditScreen extends CommonSteps {

	@BeforeMethod
	public void androidDeviceSetup() throws MalformedURLException {
		prepareAndroidForAppium();
	}

	/*@Features(value = { "Shopping bag" })
	@Stories(value = { "Edit Screen" })
	@Test(description = "Do First Time Login", enabled = false)
	public void doFirstTimeLogin() {
		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();

		log("Select English language to continue");
		chooselanguagepage.clickOnLanguageToBeChoosen("English");

		log("Click on Continue button");
		chooselanguagepage.clickOnContinueButton();

		log("Login into Application");
		loginpage.doFirstTimeLogin("", "");

		log("Verify user is in home page");
		waitForPageToLoad();
		assertTrueAllure(homepage.getHamburgerIcon().isDisplayed(), "Home page is displayed",
				"Home page is not displayed");
	}*/

	@Features(value = { "Shopping bag" })
	@Stories(value = { "Edit Screen" })
	@Test(description = "Validate Edit Screen For 1 Item in Cart")
	public void validateEditScreenForOneItemInCart() {
		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();
		IShoppingBagPage shoppingbagpage = getFactory().getIShoppingBagPage();

		log("Select English language to continue");
		chooselanguagepage.clickOnLanguageToBeChoosen("English");

		log("Click on Continue button");
		chooselanguagepage.clickOnContinueButton();

		log("Click on Do It Later button");
		loginpage.clickOnDoItLaterButton();

		log("Click on Hamburger Menu");
		homepage.waitForPageToLoad();
		homepage.clickOnHamburger();

		log("Click on Category to be choosen");
		try {
			if (homepage.getCategoryToBeChoosen("Electronics").isDisplayed()) {
				homepage.clickOnCategoryToBeChoosen("Electronics");
				homepage.clickOnItemType1ToBeChoosen("Televisions");
				homepage.clickOnItemType2ToBeChoosen("32");

				log("Click on Item to be added in bag");
				waitForPageToLoad();
				homepage.clickOnItemToBeAddedInBag("HDX900S");
			} else {
				homepage.clickOnCategoryToBeChoosen("Mobile");
				homepage.clickOnItemType1ToBeChoosen("Mobiles");
				homepage.clickOnItemType2ToBeChoosen("Smartphones");

				log("Click on Item to be added in bag");
				waitForPageToLoad();
				homepage.clickOnItemToBeAddedInBag("Apple iPhone 7");
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
		}

		log("Click on Add to bag button");
		waitForPageToLoad();
		homepage.clickOnAddToBagButton();

		log("Click on Shopping bag edit button");
		waitForPageToLoad();
		shoppingbagpage.clickOnShoppingBagEditButton();
		// shoppingbagpage.validateDefaultCheckboxSelectionForOneItemInBag();

		log("Click on Remove button in edit screen");
		shoppingbagpage.clickOnEditShoppingBagRemoveButton("Remove 1 Item");
		waitForPageToLoad();

		log("Verify Empty Shopping Bag message is displayed");
		assertTrue(shoppingbagpage.getEmptyShoppingBagMessage().isDisplayed(),
				"Empty Shopping Bag message is not displayed");
	}

	@Features(value = { "Shopping bag" })
	@Stories(value = { "Edit Screen" })
	@Test(description = "Validate Edit Screen For More Items in Cart")
	public void validateEditScreenForMoreItemsInCart() {
		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();
		IShoppingBagPage shoppingbagpage = getFactory().getIShoppingBagPage();

		log("Select English language to continue");
		chooselanguagepage.clickOnLanguageToBeChoosen("English");

		log("Click on Continue button");
		chooselanguagepage.clickOnContinueButton();

		log("Click on Do It Later button");
		loginpage.clickOnDoItLaterButton();

		log("Click on Hamburger Menu");
		homepage.waitForPageToLoad();
		homepage.clickOnHamburger();

		log("Click on Category to be choosen");
		try {
			if (homepage.getCategoryToBeChoosen("Electronics").isDisplayed()) {
				homepage.clickOnCategoryToBeChoosen("Electronics");
				homepage.clickOnItemType1ToBeChoosen("Televisions");
				homepage.clickOnItemType2ToBeChoosen("32");

				log("Click on Item to be added in bag");
				waitForPageToLoad();
				homepage.clickOnItemToBeAddedInBag("HDX900S");
			} else {
				homepage.clickOnCategoryToBeChoosen("Mobile");
				homepage.clickOnItemType1ToBeChoosen("Mobiles");
				homepage.clickOnItemType2ToBeChoosen("Smartphones");

				log("Click on Item to be added in bag");
				waitForPageToLoad();
				homepage.clickOnItemToBeAddedInBag("Apple iPhone 7");
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
		}

		log("Click on Add to bag button");
		waitForPageToLoad();
		homepage.clickOnAddToBagButton();

		log("Click on Category to be choosen");
		shoppingbagpage.clickOnShoppingBagBackButton();
		shoppingbagpage.clickOnShoppingBagBackButton();

		log("Click on Item to be added in bag");
		waitForPageToLoad();
		try {
			if (homepage.getItemToBeAddedInBag("HDXSMART").isDisplayed()) {
				homepage.clickOnItemToBeAddedInBag("HDXSMART");
			} else {
				homepage.clickOnItemToBeAddedInBag("Apple iPhone SE");
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
		}

		log("Click on Add to bag button");
		homepage.clickOnAddToBagButton();
		waitForPageToLoad();

		try {
			if (homepage.getSizeOfItem("SILVER").isDisplayed()) {
				homepage.clickOnSizeOfItem("SILVER");
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
		}

		log("Click on Shopping bag edit button");
		shoppingbagpage.clickOnShoppingBagEditButton();
		shoppingbagpage.validateDefaultCheckboxSelectionForMoreItemsInBag();
		shoppingbagpage.checkAllCheckboxesInEditBag();

		log("Click on Remove button in edit screen");
		shoppingbagpage.clickOnEditShoppingBagRemoveButton("Remove 2 items");
		waitForPageToLoad();

		log("Verify Empty Shopping Bag message is displayed");
		assertTrue(shoppingbagpage.getEmptyShoppingBagMessage().isDisplayed(),
				"Empty Shopping Bag message is not displayed");
	}

}
