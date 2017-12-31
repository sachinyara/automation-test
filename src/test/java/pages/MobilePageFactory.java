package pages;

import pages.impl.ChooseLanguagePageImpl;
import pages.impl.HomePageImpl;
import pages.impl.LoginPageImpl;
import pages.impl.ShoppingBagPageImpl;

public abstract class MobilePageFactory {

	public static MobilePageFactory getFactory() {
		return new AndroidPageFactory();
	}
	
	public abstract ILoginPage getILoginPage();
	public abstract IHomePage getIHomePage();
	public abstract IChooseLanguagePage getIChooseLanguagePage();
	public abstract IShoppingBagPage getIShoppingBagPage();

	public static class AndroidPageFactory extends MobilePageFactory {
		public ILoginPage getILoginPage() {
			return new LoginPageImpl();
		}

		public IHomePage getIHomePage() {
			return new HomePageImpl();
		}
		
		public IChooseLanguagePage getIChooseLanguagePage(){
			return new ChooseLanguagePageImpl();
		}
		
		public IShoppingBagPage getIShoppingBagPage(){
			return new ShoppingBagPageImpl();
		}
	}
}
