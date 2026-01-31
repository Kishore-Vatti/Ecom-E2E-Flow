//package Common;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import Helpers.ElementalProperties;
//import Helpers.Waits;
//import OrderFlow.OrderFlow;
//public class CommonClass {
//	
//	public static WebDriver d = OrderFlow.Driver;
//
//	 public static ElementalProperties EP = new ElementalProperties();
//	
//	//public static WebDriver Driver;
//    public   static WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(Waits.ImplicitWait));
//	public static void AdminLogin() {
//		
//		WebElement userName = d.findElement(EP.LoginUsername);
//		wait.until(ExpectedConditions.visibilityOf(userName));
//		d.findElement(EP.LoginUsername).sendKeys("TS_Admin");
//		d.findElement(EP.LoginPassword).sendKeys("welcome");
//		d.findElement(EP.LoginSubmit).click();
//		WebElement AdminDashboardLabel1 = d.findElement(EP.AdminDashboardLabel);
//		wait.until(ExpectedConditions.visibilityOf(AdminDashboardLabel1));
//	}
//	
//	public static void GeneralSettings () {
//		d.findElement(EP.Settings).click();
//		
//		
//		
//	}
//	
//}



package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.ElementalProperties;

public class CommonClass {

    WebDriver driver;
    WebDriverWait wait;
    ElementalProperties EP = new ElementalProperties();

    public CommonClass(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void adminLogin() throws InterruptedException {
        WebElement userName = driver.findElement(EP.LoginUsername);
        wait.until(ExpectedConditions.visibilityOf(userName));
        driver.findElement(EP.LoginUsername).sendKeys("TS_Admin");
        driver.findElement(EP.LoginPassword).sendKeys("welcome");
        driver.findElement(EP.LoginSubmit).click();
        Thread.sleep(20000);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(EP.AdminDashboardLabel)));
    }

    public void openGeneralSettings() throws InterruptedException {
        driver.findElement(EP.Settings).click();
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(EP.GsLabel)));
        driver.findElement(EP.GsLabel).click();
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(EP.GsCollapseAll)));
        driver.findElement(EP.GsCollapseAll).click();
        driver.findElement(EP.GsAccounting).click();
        driver.findElement(EP.isShippingTaxable).click();
        System.out.println("clicked on toggle");
        driver.findElement(EP.SaveGeneralSettings).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(EP.GsSaveToast)));
        Thread.sleep(2000);
    }
    
    
    
}

