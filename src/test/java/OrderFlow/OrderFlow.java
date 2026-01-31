//package OrderFlow;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import Helpers.Waits;
//import Common.CommonClass;
//import Helpers.ElementalProperties;
//import Helpers.ExcelUtils;
//
//public class OrderFlow {
//
//	public static WebDriver Driver;
//	public static ElementalProperties EP = new ElementalProperties();
//	public static CommonClass CC = new CommonClass();
//	static WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(Waits.ImplicitWait));
//	
//	@BeforeClass
//	public static void BrowserSetup() {
//		Driver = new ChromeDriver();
//		Driver.get("https://qa-acg5.accuconnect.com/admin/");
//		Driver.manage().window().maximize();
//        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement userName = Driver.findElement(EP.LoginUsername);
//		wait.until(ExpectedConditions.visibilityOf(userName));
//		
//	}
//	
//	
//	@Test (dataProvider = "TestData")
//	public void OrderFlow (Map <String, String> data) {
//		
//		
//		String td = data.get("TD");
//		String description = data.get("Description");
//		String shippingBasis = data.get("Shipping Basis");
//		String shippingPriceBasis = data.get("ShippingPriceBasis");
//		String defaultPackageWeight = data.get("Default Package Weight for Consolidated Shipping");
//		String userOrderShippingOrHandlingFee = data.get("user order shipping orhandling fee");
//		String enableCalculateTax = data.get("Enable Calculate Tax");
//		String taxProvider = data.get("Tax Provider");
//		String decimalValue = data.get("Decimal Value");
//		String weightDecimalValue = data.get("Weightdecimalvalue");
//		String orderAmountValue = data.get("OrderAmountValue");
//		String enablePromotionsDiscounts = data.get("Enable Promotions/Discounts");
//		String enablePromotionsOnOrderTotal = data.get("Enable Promotions on Order Total");
//		String shippingIsTaxable = data.get("Shipping is Taxable");
//		String enableZeroAmountOrder = data.get("Enable Zero Amount Order");
//		String showBillingAddressForZeroAmount = data.get("Show Billing Address For Zero Amount / Hide Pricing");
//		String taxPercentage = data.get("Tax (%)");
//		String paymentMethod = data.get("Payment Method");
//		String paymentSubOption = data.get("Payment SubOption");
//		String enableMultiPaymentMethods = data.get("Enable Multi Payment Methods");
//		String shippingAddressSameAsBilling = data.get("Shipping Address same as Billing Address");
//		String enableCostCenters = data.get("Enable Cost Centers");
//		String fulfillmentChargePerOrder = data.get("Fulfillment Charge per Order");
//		String fulfillmentChargePerItem = data.get("Fulfillment Charge Per Item");
//		String productPricePerPiece = data.get("Product Price(PerPiece)");
//		String productPriceFlatRate = data.get("Product Price (Flat Rate)");
//		String shippingPricePerPiece = data.get("ShippingPricePerPiece");
//		String coupon = data.get("Coupon");
//		String couponPercentage = data.get("Coupon Percentage");
//		String productName = data.get("Product Name");
//		String exemptFromTaxes = data.get("Exempt from Taxes");
//		String minimumPrice = data.get("Minimum Price");
//		String podItemPriceUnitType = data.get("POD Item Price Unit Type");
//		String podParameterUnitType = data.get("POD Parameter Unit Type");
//		String podItemPrice = data.get("POD- Item Price");
//		String noOfPages = data.get("No. of Pages");
//		String quantity = data.get("Quantity");
//
//		String podOptionsPrint = data.get("POD - Options Print");
//		String podOptionsPaper = data.get("POD - Options Paper");
//		String podOptionsFinishing = data.get("POD - Options Finishing");
//		String podOptionsAdvanced = data.get("POD - Options Advanced");
//
//		String parameterOptionPrice = data.get("Parameter/Option Price");
//		String podPriceBeforeChange = data.get("POD Price (Before Change)");
//		String vsItemPrice = data.get("VSItem Price");
//		String vsTotalPrice = data.get("VSTotal Price");
//
//		String scQuantity = data.get("SCQuantity");
//		String scUnitPrice = data.get("SCUnit Price");
//		String scAmountPrice = data.get("SCAmount Price");
//
//		String shippingAddresses = data.get("Shipping Addresses");
//
//		String ocSubtotal = data.get("OCSubtotal");
//		String ocShipping = data.get("OCShipping");
//		String ocHandlingFee = data.get("OCHandlingFee");
//		String ocFulfillmentCharges = data.get("OCFulfillement Charges");
//		String ocTaxAmount = data.get("OCTax Amount");
//		String ocPromotion = data.get("OCPromotion");
//		String ocTotal = data.get("OCTotal");
//		String ocTotalAfterCouponApplied = data.get("OCTotalAfterCouponApplied");
//
//		String quantity1ForSplitShip = data.get("Quantity 1 for Split Ship");
//		String quantity2ForSplitShip = data.get("Quantity 2 for Split Ship");
//		String splitShippingPrice1 = data.get("Split Shipping Price 1");
//		String splitShippingPrice2 = data.get("Split Shipping Price 2");
//
//		String payment1Price = data.get("Payment1Price");
//		String amtAfterPayment1 = data.get("AmtAfterPayment1");
//		String payment2Price = data.get("Payment2Price");
//		String amtAfterPayment2 = data.get("AmtAfterPayment2");
//
//		System.out.println(td);
//		
//		
//		
//		
//		CommonClass.AdminLogin();
//		
//		
//		
//		Assert.fail("Fail test intentionally");
//
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//	
//	
//	@DataProvider(name = "TestData")
//	public Object[][] orderData() {
//
//	    Object[][] allData = ExcelUtils.getExcelDataAsMap(
//	            "src/test/resources/POD-TestData.xlsx",
//	            "Sheet1");
//
//	    List<Object[]> filtered = new ArrayList<>();
//
//	    for (Object[] row : allData) {
//
//	        @SuppressWarnings("unchecked")
//	        Map<String, String> data = (Map<String, String>) row[0];
//
//	        String td = data.get("TD");
//
//	        if (Helpers.ExecutionFilter.shouldExecute(td)) {
//	            filtered.add(row);
//	        }
//	    }
//
//	    return filtered.toArray(new Object[0][0]);
//	}
//
//
//	
//	
//	
//	
//
//}

package OrderFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Common.CommonClass;
import Helpers.ExcelUtils;

public class OrderFlow extends BaseTest {

    CommonClass common;

    @Test(dataProvider = "TestData")
    public void adminConfigAndOrderFlow(Map<String, String> data) {

        driver.get("https://qa-acg5.accuconnect.com/admin/");
        common = new CommonClass(driver, wait);

        String td = data.get("TD");
        System.out.println("Executing TD: " + td);

        
     
        // ADMIN FLOW
        common.adminLogin();
        common.openGeneralSettings();

        // 👉 Here call:
        // Admin config methods
        // Product creation
        // Order placing (later via user role)
    }

    
	@DataProvider(name = "TestData")
	public Object[][] orderData() {

	    Object[][] allData = ExcelUtils.getExcelDataAsMap(
	            "src/test/resources/POD-TestData.xlsx",
	            "Sheet1");

	    List<Object[]> filtered = new ArrayList<>();

	    for (Object[] row : allData) {

	        @SuppressWarnings("unchecked")
	        Map<String, String> data = (Map<String, String>) row[0];

	        String td = data.get("TD");

	        if (Helpers.ExecutionFilter.shouldExecute(td)) {
	            filtered.add(row);
	        }
	    }

	    return filtered.toArray(new Object[0][0]);
	}
}
