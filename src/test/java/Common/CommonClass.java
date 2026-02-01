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
import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
    public static String takeScreenshot(WebDriver driver, String testName) {

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filePath = "screenshots/" + testName + "_" + timeStamp + ".png";

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(filePath);

        try {
            FileUtils.copyFile(src, dest); // ✅ correct
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;
    }

    

    public void adminLogin() throws InterruptedException {
        WebElement userName = driver.findElement(EP.LoginUsername);
        wait.until(ExpectedConditions.visibilityOf(userName));
        driver.findElement(EP.LoginUsername).sendKeys("TS_Admin");
        driver.findElement(EP.LoginPassword).sendKeys("welcome");
        driver.findElement(EP.LoginSubmit).click();
//        ((JavascriptExecutor) driver)
//        .executeScript("document.body.style.zoom='90%'");

//        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(EP.AdminDashboardLabel)));
        
        // ✅ Wait for page load
//        wait.until(d ->
//            ((JavascriptExecutor)d)
//                .executeScript("return document.readyState")
//                .equals("complete")
//        );

        // ✅ Wait for spinner / overlay gone
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(
//            By.cssSelector(".spinner, .loading, .overlay")
//        ));

        // ✅ Ensure sidebar visible
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//        		EP.AdminDashboardLabel
//        ));
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

