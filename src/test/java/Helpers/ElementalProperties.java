//package Helpers;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import Common.CommonClass;
//
//public class ElementalProperties  {
//
//
//	public static String login = "Driver.findElement(By.id('username'))";
//		
//
//		
//		public By LoginUsername = By.id("username");
//		public By LoginPassword = By.id("password");
//		public By LoginSubmit = By.xpath("//button[contains(text(),'Sign in')]");
//		public By AdminDashboardLabel = By.xpath("//h1[normalize-space()='Dashboard']");
//
//		//General Settings
//		
//		public By Settings = By.xpath("//span[normalize-space()='Settings']");
//		public By GsPage = By.xpath("//h3[normalize-space()='General Settings']");
//		public By GsSearch = By.xpath("//input[@placeholder='Search settings...']");
//		public By GsCollapseAll = By.xpath("//button[normalize-space()='Collapse All']");
//		public By GsAccounting = By.xpath("//h3[normalize-space()='Accounting']");
//		public By CurrencyDecimalDD = By.xpath("(//label[normalize-space()='Currency Decimals']   /ancestor::div[contains(@class,'flex-col')][1]   //div[contains(@class,'control')])");
//		public By WeightDecimalDD = By.xpath("(//label[normalize-space()='Weight Decimals']   /ancestor::div[contains(@class,'flex-col')][1]   //div[contains(@class,'control')])");
//		public By OrderAmountDecimalDD = By.xpath("(//label[normalize-space()='Order Amount Decimals']   /ancestor::div[contains(@class,'flex-col')][1]   //div[contains(@class,'control')])");
//		public By isShippingTaxable = By.xpath("//label[normalize-space()='Shipping is Taxable']   /ancestor::div[contains(@class,'items-center')][1]   //input[@type='checkbox']");
//		public By isPostageTaxable = By.xpath("//label[normalize-space()='Postage is Taxable']   /ancestor::div[contains(@class,'items-center')][1]   //input[@type='checkbox']");
//		public By isCalculateTax = By.xpath("//label[normalize-space()='Enable Calculate Tax']//ancestor::div[contains(@class,'tems-center')]//input[@type='checkbox']");
//		public By isEnablePromotions = By.xpath("//label[normalize-space()='Enable Promotions Discounts']//ancestor::div[contains(@class,'tems-center')]//input[@type='checkbox']");
//		public By isEnablePromotionsOnOrderTotal = By.xpath("//label[normalize-space()='Enable Promotions on Order Total']//ancestor::div[contains(@class,'tems-center')]//input[@type='checkbox']");
//
//	
//		
//		
//		
//		public By SaveGeneralSettings = By.xpath("//button[normalize-space()='Save']");
//		
//	
//	
	
//}
package Helpers;

import org.openqa.selenium.By;

public class ElementalProperties {

    /* ================= LOGIN ================= */

    public final By LoginUsername = By.id("username");
    public final By LoginPassword = By.id("password");
    public final By LoginSubmit   = By.xpath("//button[normalize-space()='Sign in']");
    public final By AdminDashboardLabel =
            By.xpath("//h1[normalize-space()='Dashboard']");

    /* ============== GENERAL SETTINGS ============== */

    public final By Settings =
            By.xpath("//span[normalize-space()='Settings']");
    
    public final By GsLabel =
            By.xpath("//h3[normalize-space()='General Settings']");

    public final By GsSearch =
            By.xpath("//input[@placeholder='Search settings...']");

    public final By GsCollapseAll =
            By.xpath("//button[normalize-space()='Collapse All']");

    public final By GsAccounting =
            By.xpath("//h3[normalize-space()='Accounting']");

    /* ============== DECIMAL DROPDOWNS ============== */

    public final By CurrencyDecimalDD =
            By.xpath("//label[normalize-space()='Currency Decimals']" +
                     "/ancestor::div[contains(@class,'flex-col')][1]" +
                     "//div[contains(@class,'control')]");

    public final By WeightDecimalDD =
            By.xpath("//label[normalize-space()='Weight Decimals']" +
                     "/ancestor::div[contains(@class,'flex-col')][1]" +
                     "//div[contains(@class,'control')]");

    public final By OrderAmountDecimalDD =
            By.xpath("//label[normalize-space()='Order Amount Decimals']" +
                     "/ancestor::div[contains(@class,'flex-col')][1]" +
                     "//div[contains(@class,'control')]");

    /* ============== TOGGLES ============== */

    public final By isShippingTaxable =
            By.xpath("//label[normalize-space()='Shipping is Taxable']" +
                     "/ancestor::div[contains(@class,'items-center')][1]" +
                     "//input[@type='checkbox']");

    public final By isPostageTaxable =
            By.xpath("//label[normalize-space()='Postage is Taxable']" +
                     "/ancestor::div[contains(@class,'items-center')][1]" +
                     "//input[@type='checkbox']");

    public final By isCalculateTax =
            By.xpath("//label[normalize-space()='Enable Calculate Tax']" +
                     "/ancestor::div[contains(@class,'items-center')][1]" +
                     "//input[@type='checkbox']");

    public final By isEnablePromotions =
            By.xpath("//label[normalize-space()='Enable Promotions Discounts']" +
                     "/ancestor::div[contains(@class,'items-center')][1]" +
                     "//input[@type='checkbox']");

    public final By isEnablePromotionsOnOrderTotal =
            By.xpath("//label[normalize-space()='Enable Promotions on Order Total']" +
                     "/ancestor::div[contains(@class,'items-center')][1]" +
                     "//input[@type='checkbox']");

    /* ============== SAVE ============== */

    public final By SaveGeneralSettings =
            By.xpath("//button[normalize-space()='Save']");
}

