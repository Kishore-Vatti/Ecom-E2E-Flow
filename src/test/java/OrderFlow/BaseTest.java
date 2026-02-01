package OrderFlow;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Helpers.Waits;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void browserSetup() {
//    	ChromeOptions options = new ChromeOptions();
//
//    	options.addArguments("--headless=new");
//    	options.addArguments("--no-sandbox");
//    	options.addArguments("--disable-dev-shm-usage");
//    	options.addArguments("--disable-gpu");
//    	options.addArguments("--window-size=1920,1080");
//
//    	driver = new ChromeDriver(options);

    	ChromeOptions options = new ChromeOptions();

    	//options.addArguments("--headless=new");
    	options.addArguments("--window-size=1920,1080");
    	options.addArguments("--force-device-scale-factor=1");
    	options.addArguments("--high-dpi-support=1");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");
    	options.addArguments("--disable-gpu");

    	 driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1080));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(Waits.ImplicitWait));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
