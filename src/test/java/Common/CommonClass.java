package Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helpers.ElementalProperties;
import Helpers.Waits;
import OrderFlow.OrderFlow;
public class CommonClass {
	
	public static WebDriver d = OrderFlow.Driver;

	 public static ElementalProperties EP = new ElementalProperties();
	
	//public static WebDriver Driver;
    public   static WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(Waits.ImplicitWait));
	public static void AdminLogin() {
		
		WebElement userName = d.findElement(EP.LoginUsername);
		wait.until(ExpectedConditions.visibilityOf(userName));
		d.findElement(EP.LoginUsername).sendKeys("TS_Admin");
		d.findElement(EP.LoginPassword).sendKeys("welcome");
		d.findElement(EP.LoginSubmit).click();
		WebElement AdminDashboardLabel1 = d.findElement(EP.AdminDashboardLabel);
		wait.until(ExpectedConditions.visibilityOf(AdminDashboardLabel1));
	}
	
	public static void GeneralSettings () {
		d.findElement(EP.Settings).click();
		
		
		
	}
	
}
