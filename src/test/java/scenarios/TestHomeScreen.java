package scenarios;

import static pages.MobilePageFactory.getFactory;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.CommonSteps;
import common.TakeScreenshot;
import pages.IChooseLanguagePage;
import pages.IHomePage;
import pages.ILoginPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Listeners({ TakeScreenshot.class })

public class TestHomeScreen extends CommonSteps {

	@Features(value = { "Home Screen" })
	@Stories(value = { "Section Items Validation" })
	@Test(description = "Validate Recharge Or Pay For Section", enabled=false)
	public void validateRechargeOrPayForSection() {

		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();

		log("Select English language to continue");
		chooselanguagepage.clickOnLanguageToBeChoosen("English");

		log("Click on Continue button");
		chooselanguagepage.clickOnContinueButton();

		log("Click on Do It Later button");
		loginpage.clickOnDoItLaterButton();

		log("Validate Recharge or Pay for section");
		List<String> list = new ArrayList<>();
		List<WebElement> listRechargeOrPayFor;

		do {
			listRechargeOrPayFor = homepage.getRechargeOrPayForList();
			for (WebElement eachItem : listRechargeOrPayFor) {
				list.add(eachItem.getText());
			}
			waitForPageToLoad();
			homepage.swipeToGetAllRechargeElements();
		} while (!list.contains("Daily Needs"));

		System.out.println(list.size());
		for (String eachItem : list) {
			System.out.println(eachItem);
		}

		assertTrueAllure(list.get(0).equals("Mobile Prepaid"), "Mobile Prepaid is present",
				"Mobile Prepaid is not present");
	}

	@Features(value = { "Home Screen" })
	@Stories(value = { "Section Items Validation" })
	@Test(description = "Validate Mobiles Best Deals")
	public void validateMobilesBestDeals() {

		IChooseLanguagePage chooselanguagepage = getFactory().getIChooseLanguagePage();
		ILoginPage loginpage = getFactory().getILoginPage();
		IHomePage homepage = getFactory().getIHomePage();

		log("Select English language to continue");
		chooselanguagepage.clickOnLanguageToBeChoosen("English");

		log("Click on Continue button");
		chooselanguagepage.clickOnContinueButton();

		log("Click on Do It Later button");
		loginpage.clickOnDoItLaterButton();

		log("Validate Mobiles Best Deals section");
		List<WebElement> listRechargeOrPayFor;
		List<String> list=new ArrayList<>();
		do{
			listRechargeOrPayFor=homepage.getRowsTitle();
			for (WebElement eachItem : listRechargeOrPayFor) {
				list.add(eachItem.getText());
			}
			swipeBottomToTop();
		}while(!list.contains("Best Deals on Mobiles"));
	
	}
}