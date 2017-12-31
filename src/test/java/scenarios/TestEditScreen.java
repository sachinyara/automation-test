package scenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;
import static pages.MobilePageFactory.getFactory;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import common.CommonSteps;
import pages.IChooseLanguagePage;
import pages.IHomePage;
import pages.ILoginPage;
import pages.IShoppingBagPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

public class TestEditScreen extends CommonSteps {

	@BeforeSuite
	public void androidDeviceSetup() throws MalformedURLException {
		prepareAndroidForAppium();
	}

	@Features(value = { "Shopping bag" })
    @Stories(value = { "Edit Screen" })
	@Test(description = "Do First Time Login")
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
	}

	@Features(value = { "Shopping bag" })
    @Stories(value = { "Edit Screen" })
	@Test(description = "Validate Edit Screen For 1 Item in Cart", enabled = false)
	public void validateEditScreenForOneItemInCart() {
		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();
		IShoppingBagPage shoppingbagpage = getFactory().getIShoppingBagPage();

		chooselanguagepage.clickOnLanguageToBeChoosen("English");
		chooselanguagepage.clickOnContinueButton();
		loginpage.doFirstTimeLogin("8197607711", "Rinki427");
		homepage.waitForPageToLoad();
		homepage.clickOnHamburger();
		homepage.clickOnCategoryToBeChoosen("Mobile");
		homepage.clickOnItemType1ToBeChoosen("Mobiles");
		homepage.clickOnItemType2ToBeChoosen("Smartphones");
		waitForPageToLoad();
		homepage.clickOnItemToBeAddedInBag("Vivo");
		waitForPageToLoad();
		homepage.clickOnAddToBagButton();
		waitForPageToLoad();
		// homepage.clickOnSizeOfItem("32");
		shoppingbagpage.clickOnShoppingBagEditButton();
		// shoppingbagpage.validateDefaultCheckboxSelectionForOneItemInBag();
		shoppingbagpage.clickOnEditShoppingBagRemoveButton("Remove 1 Item");
		waitForPageToLoad();
		assertTrue(shoppingbagpage.getEmptyShoppingBagMessage().isDisplayed(),
				"Empty Shopping Bag message is not displayed");
	}

	@Features(value = { "Shopping bag" })
    @Stories(value = { "Edit Screen" })
	@Test(description = "Validate Edit Screen For More Items in Cart", enabled = false)
	public void validateEditScreenForMoreItemsInCart() {
		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();
		IShoppingBagPage shoppingbagpage = getFactory().getIShoppingBagPage();

		chooselanguagepage.clickOnLanguageToBeChoosen("English");
		chooselanguagepage.clickOnContinueButton();
		loginpage.doFirstTimeLogin("8197607711", "Rinki427");
		homepage.waitForPageToLoad();
		homepage.clickOnHamburger();

		homepage.clickOnCategoryToBeChoosen("Mobile");
		homepage.clickOnItemType1ToBeChoosen("Mobiles");
		homepage.clickOnItemType2ToBeChoosen("Smartphones");
		waitForPageToLoad();
		homepage.clickOnItemToBeAddedInBag("Gionee");
		waitForPageToLoad();
		homepage.clickOnAddToBagButton();
		waitForPageToLoad();

		shoppingbagpage.clickOnShoppingBagBackButton();
		shoppingbagpage.clickOnShoppingBagBackButton();
		homepage.clickOnItemToBeAddedInBag("Samsung");
		homepage.clickOnAddToBagButton();

		shoppingbagpage.clickOnShoppingBagEditButton();
		shoppingbagpage.validateDefaultCheckboxSelectionForMoreItemsInBag();
		shoppingbagpage.checkAllCheckboxesInEditBag();
		shoppingbagpage.clickOnEditShoppingBagRemoveButton("Remove 2 items");
		waitForPageToLoad();
		assertTrue(shoppingbagpage.getEmptyShoppingBagMessage().isDisplayed(),
				"Empty Shopping Bag message is not displayed");
	}
}
